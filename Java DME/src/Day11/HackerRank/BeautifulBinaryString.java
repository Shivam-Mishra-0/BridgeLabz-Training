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

class Result30 {
    public static int beautifulBinaryString(String b) {
        int changes = 0;
        int i = 0;
        while (i <= b.length() - 3) {
            if (b.charAt(i) == '0' && b.charAt(i + 1) == '1' && b.charAt(i + 2) == '0') {
                changes++;
                i += 3;
            } else {
                i++;
            }
        }
        return changes;
    }

}

public class BeautifulBinaryString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        int result = Result30.beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
