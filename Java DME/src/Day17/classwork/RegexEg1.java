package Day17.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEg1 {
    public static void main(String[] args) {
        String text = "shivammishra@gmail.com";
        String regex = "[a-zA-Z0-9.-]+@[a-z]+.[a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

//        if(text.matches(regex)) {
//            System.out.println("Matched");
//        }

//        String replaceString = matcher.replaceAll("*");
//        System.out.println(replaceString);
//
//        String[] splits = text.split("\\s");
//        for(String element : splits){
//            System.out.println(element);


        while(matcher.find()){
            System.out.println("Matched");
        }

    }
}
