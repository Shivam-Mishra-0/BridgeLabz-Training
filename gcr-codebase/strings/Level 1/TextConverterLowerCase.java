//Creating a class name with TextConverterLowerCase.
import java.util.Scanner;
public class TextConverterLowerCase {
    public static String convertToLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
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
        System.out.println("Enter the text to convert to lowercase:");
        String userInput = scanner.nextLine();
        String manualLower = convertToLowerCaseManual(userInput);
        String builtInLower = userInput.toLowerCase();
        boolean areSame = compareStringsManual(manualLower, builtInLower);

        System.out.println("Original Text:   " + userInput);
        System.out.println("Manual Result:   " + manualLower);
        System.out.println("Built-in Result: " + builtInLower);
        System.out.println("Comparison Match: " + areSame);

        scanner.close();
    }
}