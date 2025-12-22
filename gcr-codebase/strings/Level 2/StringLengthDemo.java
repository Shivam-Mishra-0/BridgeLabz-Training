//Creating a class name with StringLengthDemo.
import java.util.Scanner;
public class StringLengthDemo {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; 
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = sc.next(); 

        int manualLen = findLength(text);
        System.out.println("Manual Length: " + manualLen);
        System.out.println("Built-in length(): " + text.length()); 
    }
}