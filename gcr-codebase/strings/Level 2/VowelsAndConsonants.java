//Creating a class name with VowelsAndConsonants.
import java.util.Scanner;
public class VowelsAndConsonants {
    public static String[] splitManual(String text) {
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        int[] spaceIndexes = new int[spaces];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }
        String[] words = new String[spaces + 1];
        int start = 0;
        for (int i = 0; i < spaces; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[spaces] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] manualResult = splitManual(text);
        String[] builtInResult = text.split(" ");
        System.out.println("Methods match: " + compareArrays(manualResult, builtInResult));
        scanner.close();
    }
}