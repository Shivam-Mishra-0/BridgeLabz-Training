package com.jsondatahandling.iplandcensoranalyzer;

public class CensorUtil {

    public static String maskTeam(String team) {
        String[] parts = team.split(" ", 2);
        return parts[0] + " ***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}

