package Day1;

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

class Results {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
        int count = 0;

        for(int l = 1; l < s.length(); l++){
            for ( int i = 0; i <= s.length() - l; i++){

                String subString1 = s.substring(i, i + l);

                for ( int j = i + 1; j <= s.length() - l; j++){
                    String subString2 = s.substring(j , j + l);

                    int[] frequency = new int[26];

                    for ( int k = 0; k < subString1.length(); k++){
                        char c = subString1.charAt(k);
                        int index = c - 'a';
                        frequency[index]++;
                    }

                    for ( int k = 0; k < subString2.length(); k++){
                        char c = subString2.charAt(k);
                        int index = c - 'a';
                        frequency[index]--;
                    }

                    boolean isAnagram = true;
                    for ( int k = 0; k < 26; k++){
                        if ( frequency[k] != 0) {
                            isAnagram = false;
                            break;
                        }
                    }
                    if (isAnagram){
                        count++;
                    }
                }
            }
        }
        return count;
    }


}

public class SherlockAndAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Results.sherlockAndAnagrams(s);

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

