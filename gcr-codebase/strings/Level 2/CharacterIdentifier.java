//Creating a class name with CharacterIdentifier.
import java.util.Scanner;
public class CharacterIdentifier {
  public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } 
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } 
        else {
            return "Not a Letter";
        }
    }
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] data = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            data[i][0] = String.valueOf(ch); 
            data[i][1] = checkCharType(ch);  
        }
        return data;
    }
    public static void displayResults(String[][] results) {
        System.out.println("Character\tType");
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t\t" + results[i][1]);
        }
    }
	  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to analyze:");
        String userInput = input.nextLine();
        String[][] results = findVowelsAndConsonants(userInput);
        displayResults(results);

        input.close();
    }
}