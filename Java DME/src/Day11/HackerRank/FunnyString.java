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

class Result28 {
    public static String funnyString(String s) {
        int n = s.length();
        StringBuilder reversedBuilder = new StringBuilder(s);
        String r = reversedBuilder.reverse().toString();

        for (int i = 1; i < n; i++) {
            int diffOriginal = Math.abs(s.charAt(i) - s.charAt(i - 1));
            int diffReversed = Math.abs(r.charAt(i) - r.charAt(i - 1));
            if (diffOriginal != diffReversed) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

}

public class FunnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result28.funnyString(s);

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
