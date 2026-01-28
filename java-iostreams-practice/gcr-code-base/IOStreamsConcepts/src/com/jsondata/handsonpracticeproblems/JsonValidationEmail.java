package com.jsondatahandling.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;
import java.io.File;
import java.util.Set;

public class JsonValidationEmail {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json = mapper.readTree(new File("user.json"));
        JsonNode schemaNode = mapper.readTree(new File("user-schema.json"));

        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(json);

        if (errors.isEmpty()) {
            System.out.println("Email is valid!");
        } else {
            errors.forEach(e -> System.out.println( e.getMessage()));
        }
    }
}

