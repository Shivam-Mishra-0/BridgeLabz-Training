//Creating a class name with LongestWord .
import java.util.Scanner;
public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > longest.length()) {
                longest = cleanWord;
            }
        }
        return longest;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();        
        String longestWord = findLongestWord(sentence);      

        System.out.println("The longest word is: " + longestWord);
        scanner.close();
    }
}