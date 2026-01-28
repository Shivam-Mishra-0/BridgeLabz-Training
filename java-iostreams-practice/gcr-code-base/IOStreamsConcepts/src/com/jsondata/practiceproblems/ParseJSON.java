package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ParseJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode rootNode = objectMapper.readTree(new File("src/com/jsondatahandling/resources/userparse.json"));

            for (JsonNode jsonNode : rootNode) {

                int age = jsonNode.get("age").asInt();

                if (age > 25) {
                    System.out.println("User Name: " + jsonNode.get("name").asText());
                    System.out.println("Age: " + age);
                    System.out.println("City: " + jsonNode.get("address").get("city").asText());
                    System.out.println("-------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

