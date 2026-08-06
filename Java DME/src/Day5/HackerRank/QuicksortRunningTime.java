package Day5.HackerRank;

import java.io.*;
import java.util.*;

public class QuicksortRunningTime {

    static long insertionSortShifts(int[] a) {
        long count = 0;

        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j];
                j = j - 1;
                count = count + 1;
            }

            a[j + 1] = value;
        }

        return count;
    }

    static long quickSortSwaps(int[] a, int low, int high) {
        long count = 0;

        if (low < high) {
            int pivot = a[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (a[j] <= pivot) {
                    i = i + 1;

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    count = count + 1;
                }
            }

            int temp = a[i + 1];
            a[i + 1] = a[high];
            a[high] = temp;
            count = count + 1;

            int p = i + 1;

            count = count + quickSortSwaps(a, low, p - 1);
            count = count + quickSortSwaps(a, p + 1, high);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr1[i] = value;
            arr2[i] = value;
        }

        long shifts = insertionSortShifts(arr1);
        long swaps = quickSortSwaps(arr2, 0, n - 1);

        long D = shifts - swaps;

        System.out.println(D);
    }
}