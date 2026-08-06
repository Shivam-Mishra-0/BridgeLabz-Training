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

class Result {

    public static long insertionSort(List<Integer> arr) {
        int[] a = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }

        int[] temp = new int[a.length];

        return mergeSortCount(a, temp, 0, a.length - 1);
    }

    static long mergeSortCount(int[] a, int[] temp, int left, int right) {
        long count = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSortCount(a, temp, left, mid);
            count += mergeSortCount(a, temp, mid + 1, right);
            count += merge(a, temp, left, mid, right);
        }

        return count;
    }

    static long merge(int[] a, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        long count = 0;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
                count += (mid - i + 1);
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = a[j];
            j++;
            k++;
        }

        for (int x = left; x <= right; x++) {
            a[x] = temp[x];
        }

        return count;
    }

}

public class AdvancedInsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                long result = Result.insertionSort(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}