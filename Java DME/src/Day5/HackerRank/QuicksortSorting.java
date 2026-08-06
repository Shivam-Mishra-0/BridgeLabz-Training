package Day5.HackerRank;

import java.io.*;
import java.util.*;

public class QuicksortSorting {

    public static List<Integer> quickSort(List<Integer> list){
        if(list.size() <= 1){
            return list;
        }


        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int pivot = arr[0];
        for( int value: arr){

            if(pivot > value){
                left.add(value);

            }
            else if(pivot < value){
                right.add(value);
            }
            else{
                equal.add(value);
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        printList(result);
        return result;
    }
    public static void printList(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }

            quickSort(list);

        }





    }
}