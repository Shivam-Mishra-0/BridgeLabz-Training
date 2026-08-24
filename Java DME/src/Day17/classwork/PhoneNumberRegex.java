package Day17.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static void main(String[] args) {
        String phone = "1234567890";
        String regex = "^\\d{10}$";

        String pss = "Cyber@123";
        String rgx = "[a-zA-Z0-9@!#$&*-_]+{8,12}";

        Pattern pattern = Pattern.compile(rgx);
        Matcher matcher = pattern.matcher(pss);

        while(matcher.find()){
            System.out.println("Matched");
        }
//        [a-zA-Z0-9.-]+@[a-z].(a-z){3};
//        [6-9]\\d{9};
//        [a-zA-Z0-9@!#$&*-_]+{8,12};
    }
}
