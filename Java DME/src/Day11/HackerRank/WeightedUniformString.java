package Day11.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result25 {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Long> achievableWeights = new HashSet<>();

        int i = 0;
        int n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            int charWeight = c - 'a' + 1;
            int runLength = 0;

            while (i < n && s.charAt(i) == c) {
                runLength++;
                i++;
            }

            for (int k = 1; k <= runLength; k++) {
                achievableWeights.add((long) k * charWeight);
            }
        }

        List<String> results = new ArrayList<>();
        for (int q : queries) {
            results.add(achievableWeights.contains((long) q) ? "Yes" : "No");
        }
        return results;
    }

}

public class WeightedUniformString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<String> result = Result25.weightedUniformStrings(s, queries);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
