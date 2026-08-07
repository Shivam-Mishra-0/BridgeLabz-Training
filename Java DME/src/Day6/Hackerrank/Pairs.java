package Day6.Hackerrank;

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

class Result6 {

    public static int pairs(int k, List<Integer> arr) {
        int len = arr.size();
        // int[] ar = new int[len];

        // for( int i = 0; i< len; i++){
        //     ar[i] = arr.get(i);
        // }
        // int count = 0;
        // for( int i =0; i < len-1 ; i++){
        //     for( int j = i+1; j < len; j++){
        //         if( (ar[j] - ar[i] == k) || (ar[i] - ar[j] == k)){
        //             count++;
        //         }
        //     }
        // }

        Set<Integer> set = new HashSet<>(arr);
        int count = 0;
        for( int value : arr){
            if( set.contains(value + k)){
                count++;
            }
        }
        return count;
    }

}

public class Pairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result6.pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

