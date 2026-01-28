package com.jsondatahandling.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class JsonFilesMerge {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            JsonNode json1 = mapper.readTree(new File("src/com/jsondatahandling/resources/file1.json"));
            JsonNode json2 = mapper.readTree(new File("src/com/jsondatahandling/resources/file2.json"));

            ObjectNode merged = mapper.createObjectNode();

            merge(merged, json1);
            merge(merged, json2);

            System.out.println(merged.toPrettyString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void merge(ObjectNode target, JsonNode source) {
        Iterator<Map.Entry<String, JsonNode>> fields = source.fields();

        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields.next();
            target.set(entry.getKey(), entry.getValue());
        }
    }
}

