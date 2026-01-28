package com.jsondatahandling.handsonpracticeproblems;

import com.fasterxml.jackson.dataformat.csv.*;
import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.List;

public class CsvToJson {
    public static void main(String[] args) {
        try {
            CsvMapper csvMapper = new CsvMapper();
            ObjectMapper jsonMapper = new ObjectMapper();

            CsvSchema schema = CsvSchema.emptySchema().withHeader();

            MappingIterator<JsonNode> rows = csvMapper
                    .readerFor(JsonNode.class)
                    .with(schema)
                    .readValues(new File("src/com/jsondatahandling/resources/users.csv"));

            List<JsonNode> list = rows.readAll();

            String json = jsonMapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(list);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

