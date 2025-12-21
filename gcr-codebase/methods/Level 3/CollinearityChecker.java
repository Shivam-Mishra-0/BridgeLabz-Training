//Creating a class name with CollinearityChecker.
import java.util.Scanner;
public class CollinearityChecker {
    public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeABPart = (y2 - y1) * (x3 - x2);
        double slopeBCPart = (y3 - y2) * (x2 - x1);

        return slopeABPart == slopeBCPart;
    }
    public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        return Math.abs(area) == 0;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinates for Point A (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter coordinates for Point B (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter coordinates for Point C (x3 y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        boolean collinearBySlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Slope Formula:");
        System.out.println("Are points collinear? " + collinearBySlope);
        boolean collinearByArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Area of Triangle Formula:");
        System.out.println("Are points collinear? " + collinearByArea);

        input.close();
    }
}