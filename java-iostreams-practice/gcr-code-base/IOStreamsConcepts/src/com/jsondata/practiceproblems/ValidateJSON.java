package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import java.io.File;
import java.io.IOException;
 

public class ValidateJSON {

	public static void main(String[] args) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();       

		JsonNode schemaNode = objectMapper.readTree(new File("src/com/jsondatahandling/resources/schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);      

        JsonNode jsonData = objectMapper.readTree(new File("src/com/jsondatahandling/resources/user.json"));   

        if (schema.validate(jsonData).isSuccess()) {
            System.out.println("JSON is valid!");
        } else {
            System.out.println("Invalid JSON!");
        }

	}

}
