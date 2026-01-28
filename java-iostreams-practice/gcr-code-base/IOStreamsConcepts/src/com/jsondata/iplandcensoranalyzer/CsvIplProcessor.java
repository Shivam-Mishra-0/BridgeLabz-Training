package com.jsondatahandling.iplandcensoranalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.*;
import java.io.File;
import java.util.List;

public class CsvIplProcessor {

    public static void processCsv(String input, String output) throws Exception {

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnReordering(true);

        MappingIterator<JsonNode> rows = csvMapper
                .readerFor(JsonNode.class)
                .with(schema)
                .readValues(new File("src/com/jsondatahandling/resources/ipl.csv"));

        List<JsonNode> list = rows.readAll();

        for (JsonNode node : list) {
            ((ObjectNode) node).put("team1",
                    CensorUtil.maskTeam(node.path("team1").asText("")));

            ((ObjectNode) node).put("team2",
                    CensorUtil.maskTeam(node.path("team2").asText("")));

            ((ObjectNode) node).put("winner",
                    CensorUtil.maskTeam(node.path("winner").asText("")));

            ((ObjectNode) node).put("player_of_match",
                    CensorUtil.redactPlayer());
        }


        CsvSchema outSchema = CsvSchema.builder()
                .addColumn("match_id")
                .addColumn("team1")
                .addColumn("team2")
                .addColumn("score_team1")
                .addColumn("score_team2")
                .addColumn("winner")
                .addColumn("player_of_match")
                .build()
                .withHeader(); 


        csvMapper.writer(outSchema)
                 .writeValue(new File(output), list);
    }
}

