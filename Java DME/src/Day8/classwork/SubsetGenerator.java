package Day8.classwork;

import java.util.*;

public class SubsetGenerator {
    public static void subsetGenerator(int[] arr, int index, List<Integer> current, List<List<Integer>> result){
        if( index == arr.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        // include the current element
        current.add(arr[index]);
        subsetGenerator(arr, index +1, current, result);

        //exclude the current element
        current.remove(current.size()-1);
        subsetGenerator(arr, index+1, current, result);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<List<Integer>> result = new ArrayList<>();
        subsetGenerator(arr, 0, new ArrayList<>(), result);

        for( List<Integer> subset: result){
            System.out.println(subset);
        }
    }
}
