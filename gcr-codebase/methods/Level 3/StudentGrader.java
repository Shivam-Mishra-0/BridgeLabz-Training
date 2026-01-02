//Creating a class name with StudentGrader.
import java.util.Scanner;
public class StudentGrader {
    public static int[][] generatePCMScores(int numberStudents) {
        int[][] scores = new int[numberStudents][3]; 
        for (int i = 0; i < numberStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        int numberStudents = scores.length;
        double[][] stats = new double[numberStudents][3]; 

        for (int i = 0; i < numberStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("ID\tPhys\tChem\tMath\tTotal\tAvg\tPerc(%)");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t"); 
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t"); // PCM
            System.out.print((int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%"); // Stats
            System.out.println();
        }
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudents = input.nextInt();
        int[][] studentScores = generatePCMScores(numberStudents);
        double[][] calculations = calculateStats(studentScores);
        displayScorecard(studentScores, calculations);
        input.close();
    }
}