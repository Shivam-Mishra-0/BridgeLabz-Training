package Day4.Hackerrank;

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

class Result {

    public static List<Integer> reverseArray(List<Integer> a) {
        int[] arr = new int[a.size()];

        for( int i = 0; i < a.size(); i++){
            arr[i] = a.get(i);
        }

        int[] temp = new int[arr.length];
        for( int i = 0; i < arr.length; i++){
            temp[arr.length-1-i] = arr[i];
        }

        List<Integer> list = new ArrayList<Integer>();
        for( int i = 0; i < temp.length; i++){
            int value = temp[i];
            list.add(value);
        }

        return list;

    }

}

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

