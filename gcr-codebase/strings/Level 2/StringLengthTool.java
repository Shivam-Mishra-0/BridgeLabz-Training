//Creating a class name with StringLengthTool.
import java.util.Scanner;
public class StringLengthTool {
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
       
        System.out.print("Enter a single word to find its length: ");
        String userInput = scanner.next();
        int manualLength = findLengthManual(userInput);
        int builtInLength = userInput.length();
        System.out.println("Manual Length (using charAt exception): " + manualLength);
        System.out.println("Built-in length() method result: " + builtInLength);
        
        scanner.close();
    }
}