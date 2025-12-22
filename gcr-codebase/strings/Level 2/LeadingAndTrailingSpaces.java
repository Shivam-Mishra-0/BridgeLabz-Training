//Creating a class name with LeadingAndTrailingSpaces.
import java.util.Scanner;
public class LeadingAndTrailingSpaces {
    public static String[] splitManual(String text) {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIdx = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIdx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIdx] = text.substring(start);
        return words;
    }

    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(words[i].length()); 
        }
        return table;
    }

    public static int[] findShortestLongestIndexes(String[][] table) {
        int shortestIdx = 0, longestIdx = 0;
        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currentLen = Integer.parseInt(table[i][1]);
            if (currentLen < min) {
                min = currentLen;
                shortestIdx = i;
            }
            if (currentLen > max) {
                max = currentLen;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx}; 
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitManual(text);
        String[][] wordTable = createWordLengthTable(words);
        int[] results = findShortestLongestIndexes(wordTable);

        System.out.println("Shortest word: " + words[results[0]]);
        System.out.println("Longest word: " + words[results[1]]);
    }
}