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

class Result1 {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        int[] ar = new int[arr.size()];

        for( int i = 0; i < arr.size(); i++){
            ar[i] = arr.get(i);
        }

        for (int i = 1; i < n; i++) {
            int key = ar[i];
            int j = i - 1;

            while( j >= 0 && ar[j] > key){
                ar[j+1] = ar[j];
                j--;
            }

            ar[j+1] = key;

            for (int k = 0; k < ar.length; k++) {
                System.out.print(ar[k] + " ");
            }
            System.out.println();
        }
    }

}

public class InsertionSortTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result1.insertionSort2(n, arr);

        bufferedReader.close();
    }
}

