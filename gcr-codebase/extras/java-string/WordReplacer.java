//Creating a class name with WordReplacer .
import java.util.Scanner;
public class WordReplacer {
    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result.append(replacement);
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace: ");
        String target = scanner.next();
        System.out.print("Replace with: ");
        String replacement = scanner.next();
        String result = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + result);

        scanner.close();
    }
}