//Creating a class name with CustomStringSplitter.
import java.util.Scanner;
public class CustomStringSplitter {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[] splitManual(String text) {
        int len = getLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int start = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, len);
        
        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence to split: ");
        String text = scanner.nextLine();
        String[] manualWords = splitManual(text);
        String[] builtInWords = text.split(" ");
        boolean isMatch = compareStringArrays(manualWords, builtInWords);
        System.out.println("Manual Split Count: " + manualWords.length);
        System.out.println("Built-in Split Count: " + builtInWords.length);
        System.out.println("Do both methods match? " + isMatch);

        scanner.close();
    }
}