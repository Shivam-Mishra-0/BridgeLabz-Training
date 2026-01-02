//Creating a class name with LexicographicalCompare .
import java.util.Scanner;

public class LexicographicalCompare {
    public static void compareLexicographically(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLength = Math.min(len1, len2);
        boolean foundDifference = false;
        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                if (c1 < c2) {
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                } else {
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                }
                foundDifference = true;
                break;
            }
        }
        if (!foundDifference) {
            if (len1 < len2) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
            } else if (len1 > len2) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal.");
            }
        }
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String 1: ");
        String str1 = scanner.nextLine();
        System.out.print("String 2: ");
        String str2 = scanner.nextLine();
        compareLexicographically(str1, str2);

        scanner.close();
    }

}