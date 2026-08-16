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

class Result15 {
    public static String biggerIsGreater(String w) {
        char[] a = w.toCharArray();
        int n = a.length;
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }

        if (i < 0) {
            return "no answer";
        }
        int j = n - 1;
        while (a[j] <= a[i]) {
            j--;
        }
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        int left = i + 1, right = n - 1;
        while (left < right) {
            char t = a[left];
            a[left] = a[right];
            a[right] = t;
            left++;
            right--;
        }

        return new String(a);

    }

}

public class BiggerIsGreater {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result15.biggerIsGreater(w);

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

