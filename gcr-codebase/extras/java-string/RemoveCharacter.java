//Creating a class name with RemoveCharacter .
import java.util.Scanner;

public class RemoveCharacter {
    public static String removeChar(String str, char target) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != target) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String input = scanner.nextLine();
        System.out.print("Character to Remove: ");
        char target = scanner.next().charAt(0);
        String result = removeChar(input, target);
        System.out.println("Modified String: \"" + result + "\"");

        scanner.close();
    }

}