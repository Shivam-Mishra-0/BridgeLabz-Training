package Day8.HackerRank;

import java.util.*;

public class Permutation {
    public static void generatePermutation(List<String> current, List<String> remaining, List<List<String>> result){
        if(remaining.isEmpty()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < remaining.size(); i++){
            String chosen = remaining.get(i);
            current.add(chosen);
            remaining.remove(i);

            generatePermutation(current, remaining, result);
            remaining.add(i, chosen);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(List.of("ab", "bc", "cd"));
        List<List<String>> result = new ArrayList<>();
        generatePermutation(new ArrayList<>(), arr, result);
        for (List<String> permutation : result) {
            System.out.println(String.join(" ", permutation));
        }
    }
}