package com.jsondatahandling.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JsonToXml {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            XmlMapper xmlMapper = new XmlMapper();

            JsonNode jsonNode = jsonMapper.readTree(new File("src/com/jsondatahandling/resources/file1.json"));

            String xml = xmlMapper.writeValueAsString(jsonNode);

            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

