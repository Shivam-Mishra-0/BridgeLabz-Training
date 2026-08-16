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

class Result9 {

    public static String timeConversion(String s) {
        if(s.isEmpty()) return "Invalid";

        String time = s.substring(0, s.length()-2);
        String ampm = s.substring(s.length()-2);
        String first = s.substring(0, 2);
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(first);
        if(ampm.equals("AM")){
            if (hour == 12) {
                hour = 0;

            }
        }
        else{
            if (hour != 12) {
                hour += 12;

            }
        }
        sb.append(String.format("%02d", hour)).append(s.substring(2, s.length() - 2));
        return sb.toString();
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result9.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
