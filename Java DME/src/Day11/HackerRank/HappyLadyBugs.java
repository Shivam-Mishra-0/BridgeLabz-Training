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

class Result18 {
    public static String happyLadybugs(String b) {
        Map<Character, Integer> counts = new HashMap<>();
        boolean hasUnderscore = false;

        for (char c : b.toCharArray()) {
            if (c == '_') {
                hasUnderscore = true;
            } else {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }

        for (int count : counts.values()) {
            if (count == 1) {
                return "NO";
            }
        }

        if (hasUnderscore) {
            return "YES";
        }

        int n = b.length();
        for (int i = 0; i < n; i++) {
            boolean leftMatch = (i > 0 && b.charAt(i - 1) == b.charAt(i));
            boolean rightMatch = (i < n - 1 && b.charAt(i + 1) == b.charAt(i));
            if (!leftMatch && !rightMatch) {
                return "NO";
            }
        }
        return "YES";
    }

}

public class HappyLadyBugs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result18.happyLadybugs(b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}





