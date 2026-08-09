package Day1;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] token = s.split("[^A-Za-z]+");
        List<String> tokens = new ArrayList<>();

        for ( String value: token){
            if ( !value.isEmpty()){
                tokens.add(value);
            }
        }

        System.out.println(tokens.size());
        for( String value: tokens){
            System.out.println(value);
        }
        scan.close();
    }
}


