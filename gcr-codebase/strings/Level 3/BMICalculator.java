//Creating a class name with BMICalculator.
import java.util.Scanner;
public class BMICalculator {
	 public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.format("%.2f", bmi), status};
    }
    public static String[][] processBMIData(double[][] data) {
        String[][] summary = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = calculateBMIAndStatus(weight, height);

            summary[i][0] = String.valueOf(height); 
            summary[i][1] = String.valueOf(weight); 
            summary[i][2] = bmiInfo[0];             
            summary[i][3] = bmiInfo[1];             
        }
        return summary;
    }
    public static void displayResults(String[][] report) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : report) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] measurements = new double[10][2];
        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " Weight: ");
            measurements[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " Height: ");
            measurements[i][1] = sc.nextDouble();
        }
        String[][] results = processBMIData(measurements);
        displayResults(results);
    }
}