//Creating a class name with StudentVote.
public class StudentVote {
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 1; 
        }
        return ages;
    }

    public static String[][] validateVoting(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                table[i][1] = "False (Invalid Age)"; 
            } else {
                table[i][1] = (ages[i] >= 18) ? "True" : "False"; 
            }
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]); 
        }
    }
	public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] eligibilityTable = validateVoting(ages);
        displayTable(eligibilityTable);
    }
}