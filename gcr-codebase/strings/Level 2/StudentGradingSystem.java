//Creating a class name with StudentGradingSystem.
import java.util.Scanner;
public class StudentGradingSystem {
    public static int[][] generatePCMScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return stats;
    }
    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 80) grades[i][0] = "A";
            else if (p >= 70) grades[i][0] = "B";
            else if (p >= 60) grades[i][0] = "C";
            else if (p >= 50) grades[i][0] = "D";
            else if (p >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("Phys\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + 
                               (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%\t" + grades[i][0]);
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generatePCMScores(n);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}