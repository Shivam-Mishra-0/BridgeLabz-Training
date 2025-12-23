//Creating a class name with MostFrequentChar .
import java.util.Scanner;
public class MostFrequentChar {
    public static char findMaxOccurringChar(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();        
        if (input.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            char result = findMaxOccurringChar(input);
            System.out.println("Most Frequent Character: '" + result + "'");
        }
        
        scanner.close();
    }
}