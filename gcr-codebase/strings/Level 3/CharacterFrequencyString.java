//Creating a class name with CharacterFrequencyString.
import java.util.Scanner;
public class CharacterFrequencyString {
    public static String[][] getFrequencyArray(String text) {
        int[] freqMap = new int[256];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freqMap[c] == 0) uniqueCount++; 
            freqMap[c]++;
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        boolean[] seen = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freqMap[c]);
                seen[c] = true;
                index++;
            }
        }
        return result;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] frequencyData = getFrequencyArray(input);
        
        System.out.println("\nCharacter Frequency:");
        for (String[] row : frequencyData) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}