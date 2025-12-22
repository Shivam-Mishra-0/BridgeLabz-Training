//Creating a class name with ShortestAndLongest.
import java.util.Scanner;
public class ShortestAndLongest {
    public static int findLengthManual(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; 
        }
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = scanner.next();
        int manualLen = findLengthManual(userInput);
        int builtInLen = userInput.length();

        System.out.println("Manual Length: " + manualLen);
        System.out.println("Built-in length(): " + builtInLen);
        scanner.close();
    }
}