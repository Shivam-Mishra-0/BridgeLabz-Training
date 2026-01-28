package com.jsondata.iplandcensoranalyzer;

public class IplCensorApp {
    public static void main(String[] args) {
        try {
            JsonIplProcessor.processJson("src/com/jsondatahandling/resources/ipl.json", "src/com/jsondata/resources/ipl_censored.json");
            CsvIplProcessor.processCsv("src/com/jsondatahandling/resources/ipl.csv","src/com/jsondata/resources/ipl_censored.csv");

            System.out.println("Censorship completed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

