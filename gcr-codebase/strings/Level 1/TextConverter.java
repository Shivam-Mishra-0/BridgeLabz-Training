//Creating a class name with TextConverter.
import java.util.Scanner;

public class TextConverter {
    public static String convertToUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
    public static boolean compareStringsManual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to convert:");
        String userInput = scanner.nextLine();
        String manualUpper = convertToUpperCaseManual(userInput);
        String builtInUpper = userInput.toUpperCase();
        boolean areSame = compareStringsManual(manualUpper, builtInUpper);

        System.out.println("Original Text: " + userInput);
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results identical? " + areSame);

        scanner.close();
    }
}