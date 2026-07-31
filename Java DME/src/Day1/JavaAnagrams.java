package Day1;

import java.util.Locale;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram (String a, String b ){

        if ( a.length() != b.length()){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int index;
        int[] count = new int[26];

        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            index = c - 'a';
            count[index]++;
        }
        for(int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            index = c - 'a';
            count[index]--;
        }
        for(int i = 0; i < 26; i++) {
            if ( count[i] != 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        boolean result = isAnagram(a , b);
        System.out.println( result ? "Anagrams" : "NotAnagrams");

    }
}
