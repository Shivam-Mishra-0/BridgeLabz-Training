package Day5.HackerRank;

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

class Result5 {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        int[] array = new int[arr.size()];

        int pivot = arr.get(0);
        int[] left = new int[arr.size()];
        int[] right = new int[arr.size()];
        int[] equal = new int[arr.size()];
        int leftCount = 0;
        int rightCount = 0;
        int equalCount = 0;
        for( int value: arr){

            if(pivot > value){
                left[leftCount++] = value;
            }
            else if ( pivot < value){
                right[rightCount++] = value;
            }
            else{
                equal[equalCount++] = value;
            }
        }
        // int[] result = new int[array.length];
        // int count = 0;
        // for( int i = 0; i < left.length; i++){
        //     result[i] = left[i];
        //     count++;
        // }
        // result[count] = pivot;
        // for(int i = 0; i < right.length; i++){
        //     result[i] = right[i];
        // }
        // for( int value: result){
        //     System.out.println(value + " ");
        // }
        List<Integer> list = new ArrayList<>();
        for( int i = 0; i < leftCount; i++){
            list.add(left[i]);
        }
        for( int j = 0; j < equalCount; j++){
            list.add(equal[j]);
        }
        for( int k = 0; k < rightCount; k++){
            list.add(right[k]);
        }

        return list;

    }

}

public class QuicksortPartition {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result5.quickSort(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

