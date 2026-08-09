package Day1;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        int count = 1;

        for( int i = 0; i < sentence.length(); i++ ){
            char c = sentence.charAt(i);

            if ( Character.isUpperCase(c)){
                count++;
            }
        }

        System.out.println(count);
    }
}
