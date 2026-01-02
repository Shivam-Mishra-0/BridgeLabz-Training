//Creating a class name with PalindromeChecker .
import java.util.Scanner;
public class PalindromeChecker {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        return scanner.nextLine();
    }
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
    public static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("Result: \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a palindrome.");
        }
    }
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}