//Creating a class name with SubstringCounter .
import java.util.Scanner;
public class SubstringCounter {
    public static int countOccurrences(String text, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); 
        }
        return count;
    }
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String sub = scanner.nextLine();
        int count = countOccurrences(text, sub);

        System.out.println("The substring \"" + sub + "\" occurs " + count + " times.");      
        scanner.close();
    }
}