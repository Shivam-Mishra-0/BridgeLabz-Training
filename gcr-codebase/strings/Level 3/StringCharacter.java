//Creating a class name with StringCharacter.
import java.util.Scanner;
public class StringCharacter {
    public static int getManualLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }
    public static char[] findUniqueCharacters(String text) {
        int len = getManualLength(text);
        char[] tempArray = new char[len]; 
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isAlreadyPresent = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isAlreadyPresent = true;
                    break;
                }
            }
            if (!isAlreadyPresent) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        char[] finalArray = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalArray[i] = tempArray[i];
        }

        return finalArray;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}