package com.jsondata.handsonpracticeproblems;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJson {
    public static void main(String[] args) {
        try {
            CsvMapper csvMapper = new CsvMapper();
            ObjectMapper jsonMapper = new ObjectMapper();

            CsvSchema schema = CsvSchema.emptySchema().withHeader();

            MappingIterator<JsonNode> rows = csvMapper
                    .readerFor(JsonNode.class)
                    .with(schema)
                    .readValues(new File("src/com/jsondata/resources/users.csv"));

            List<JsonNode> list = rows.readAll();

            String json = jsonMapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(list);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

