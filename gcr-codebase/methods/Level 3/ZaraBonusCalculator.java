//Creating a class name with ZaraBonusCalculator.
import java.util.Scanner;
public class ZaraBonusCalculator {
    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            data[i][0] = (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 11);
        }
        return data;
    }
    public static double[][] calculateBonuses(double[][] initialData) {
        int count = initialData.length;
        double[][] results = new double[count][2];

        for (int i = 0; i < count; i++) {
            double oldSalary = initialData[i][0];
            double yearsOfService = initialData[i][1];
            double bonusRate;
            if (yearsOfService > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            double bonusAmount = oldSalary * bonusRate;
            results[i][0] = oldSalary + bonusAmount;
            results[i][1] = bonusAmount;            
        }
        return results;
    }
    public static void displayReport(double[][] initial, double[][] results) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        System.out.printf( "Employee" + " " +  "Old Salary" + " " +  "Service" + " " +  "Bonus" + " " +  "New Salary");

        for (int i = 0; i < initial.length; i++) {
            double oldSal = initial[i][0];
            double service = initial[i][1];
            double newSal = results[i][0];
            double bonus = results[i][1];

            sumOldSalary += oldSal;
            sumNewSalary += newSal;
            totalBonus += bonus;
            System.out.printf("ID :" + " " + 
                              (i + 1) + " " +  oldSal + " " + service + " " + bonus + " " +  newSal);
        }
        System.out.printf("Total Old Salary Expenditure: " + sumOldSalary);
        System.out.printf("Total Bonus Payout:    " +  totalBonus);
        System.out.printf("Total New Salary Expenditure: " + sumNewSalary);
    }
	public static void main(String[] args) {
        double[][] initialData = generateEmployeeData(10);
        double[][] finalData = calculateBonuses(initialData);
        displayReport(initialData, finalData);
    }
}