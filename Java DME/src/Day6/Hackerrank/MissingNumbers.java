package Day6.Hackerrank;

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

class Result7 {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> mapArr = new HashMap<>();
        Map<Integer, Integer> mapBrr = new HashMap<>();

        for (int value : arr) {
            mapArr.put(value, mapArr.getOrDefault(value, 0) + 1);
        }

        for (int value : brr) {
            mapBrr.put(value, mapBrr.getOrDefault(value, 0) + 1);
        }

        List<Integer> missing = new ArrayList<>();

        for (int key : mapBrr.keySet()) {
            int brrCount = mapBrr.get(key);
            int arrCount = mapArr.getOrDefault(key, 0);

            if (brrCount > arrCount) {
                missing.add(key);
            }
        }

        Collections.sort(missing);
        return missing;
    }

}

public class MissingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result7.missingNumbers(arr, brr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

