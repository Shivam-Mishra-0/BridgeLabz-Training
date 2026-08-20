package Day15.HackerRank;

import java.io.*;
import java.util.*;

public class JavaGenerics {
    public static <T> void printArr(T[] inputArr){
        for( T elements: inputArr){
            System.out.println(elements);
        }
    }

    public static void main(String[] args) {
        Integer[] intarr = {1,2,3};
        String[] stringarr = {"Hello", "World"};

        printArr(intarr);
        printArr(stringarr);
    }
}
