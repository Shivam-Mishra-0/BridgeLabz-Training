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

class Result12 {
    public static String appendAndDelete(String s, String t, int k) {
        int common = 0;
        int minLen = Math.min(s.length(), t.length());
        while (common < minLen && s.charAt(common) == t.charAt(common)) {
            common++;
        }
        int minOps = (s.length() - common) + (t.length() - common);

        if (k < minOps) {
            return "No";
        }
        else if ((k - minOps) % 2 == 0) {
            return "Yes";
        }
        else if (k >= s.length() + t.length()) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}

public class AppendAndDelete {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result12.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
