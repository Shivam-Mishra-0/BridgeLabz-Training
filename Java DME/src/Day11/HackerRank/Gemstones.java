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

class Result27 {
    public static int gemstones(List<String> arr) {
        Set<Character> common = null;

        for (String rock : arr) {
            Set<Character> letters = new HashSet<>();
            for (char c : rock.toCharArray()) {
                letters.add(c);
            }

            if (common == null) {
                common = letters;
            } else {
                common.retainAll(letters);
            }
        }
        return common == null ? 0 : common.size();
    }

}

public class Gemstones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int result = Result27.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
