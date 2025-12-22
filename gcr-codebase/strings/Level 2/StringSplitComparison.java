//Creating a class name with StringSplitComparison.
import java.util.Arrays;
import java.util.Scanner;
public class StringSplitComparison {
    public static String[] manualSplit(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        int[] spaceIndexes = new int[wordCount - 1]; 
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }

        String[] words = new String[wordCount]; 
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a1, String[] a2) {
        return Arrays.equals(a1, a2); 
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine(); 

        String[] manualWords = manualSplit(text);
        String[] builtInWords = text.split(" "); 

        System.out.println("Comparison Result: " + compareArrays(manualWords, builtInWords)); 
    }
}