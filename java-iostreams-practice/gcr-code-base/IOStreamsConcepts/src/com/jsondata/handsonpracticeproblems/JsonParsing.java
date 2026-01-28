package com.jsondatahandling.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class JsonParsing {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode rootNode = objectMapper.readTree(new File("src/com/jsondatahandling/resources/user.json"));

            printJson(rootNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printJson(JsonNode node) {

        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.print(entry.getKey() + " : ");
                printJson(entry.getValue());
            }
        }
        else if (node.isArray()) {
            for (JsonNode item : node) {
                printJson(item);
            }
        }
        else {
            System.out.println(node.asText());
        }
    }
}

