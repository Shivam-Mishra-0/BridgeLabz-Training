//Creating a class name with GeometryUtility.
import java.util.Scanner;
public class GeometryUtility {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return null; 
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return new double[]{m, b};
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x1 y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2 y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance: " + distance);
        double[] lineParams = findLineEquation(x1, y1, x2, y2);
        
        if (lineParams == null) {
            System.out.println("Equation: x = " + x1 + " (Vertical Line)");
        } else {
            double m = lineParams[0];
            double b = lineParams[1];
            System.out.println("Line Equation: y = " + m + " " + b);
            System.out.println("Slope (m),  Y-intercept (b): " + m + " " + b);
        }

        input.close();
    }
}