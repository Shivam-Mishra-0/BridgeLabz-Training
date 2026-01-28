package com.jsondatahandling.iplandcensoranalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class JsonIplProcessor {

    public static void processJson(String input, String output) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) mapper.readTree(new File("src/com/jsondatahandling/resources/ipl.json"));

        for (JsonNode match : matches) {

            ObjectNode obj = (ObjectNode) match;

            String team1 = obj.get("team1").asText();
            String team2 = obj.get("team2").asText();

            obj.put("team1", CensorUtil.maskTeam(team1));
            obj.put("team2", CensorUtil.maskTeam(team2));
            obj.put("player_of_match", CensorUtil.redactPlayer());

            ObjectNode scoreNode = (ObjectNode) obj.get("score");
            ObjectNode newScore = mapper.createObjectNode();

            Iterator<Map.Entry<String, JsonNode>> fields = scoreNode.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                newScore.set(
                        CensorUtil.maskTeam(entry.getKey()),
                        entry.getValue()
                );
            }

            obj.set("score", newScore);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(output), matches);
    }
}

