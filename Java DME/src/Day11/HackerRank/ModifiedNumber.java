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

class Result16 {
    public static void kaprekarNumbers(int p, int q) {
        boolean found = false;
        StringBuilder result = new StringBuilder();

        for (long n = p; n <= q; n++) {
            long square = n * n;
            String squareStr = Long.toString(square);
            int d = Long.toString(n).length();

            String rStr, lStr;
            if (squareStr.length() <= d) {
                rStr = squareStr;
                lStr = "0";
            } else {
                rStr = squareStr.substring(squareStr.length() - d);
                lStr = squareStr.substring(0, squareStr.length() - d);
            }

            long l = lStr.isEmpty() ? 0 : Long.parseLong(lStr);
            long r = rStr.isEmpty() ? 0 : Long.parseLong(rStr);

            if (l + r == n) {
                found = true;
                result.append(n).append(" ");
            }
        }

        if (found) {
            System.out.println(result.toString().trim());
        } else {
            System.out.println("INVALID RANGE");
        }
    }

}

public class ModifiedNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result16.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}

