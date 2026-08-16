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

class Result26 {
    public static void separateNumbers(String s) {
        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
            String firstStr = s.substring(0, len);

            if (firstStr.charAt(0) == '0') {
                continue;
            }

            long first = Long.parseLong(firstStr);
            StringBuilder built = new StringBuilder();
            long current = first;

            while (built.length() < n) {
                built.append(current);
                current++;
            }

            if (built.toString().equals(s)) {
                System.out.println("YES " + first);
                return;
            }
        }
        System.out.println("NO");
    }

}

public class SeparateTheNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result26.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
