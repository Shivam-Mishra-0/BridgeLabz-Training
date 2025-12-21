//Creating a class name with FactorAnalyzer.
import java.util.Scanner;
import java.util.Arrays;
public class FactorAnalyzer {
    public static int[] getFactorsArray(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        if (factors.length == 0) return 0;
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static double findProductOfCubes(int[] factors) {
        double productOfCubes = 1;
        for (int f : factors) {
            productOfCubes *= Math.pow(f, 3);
        }
        return productOfCubes;
    }
	public static void main(String[] args) 
        	{	Scanner input = new Scanner(System.in);
        		System.out.print("Enter a number to find its factors: ");
        		int number = input.nextInt();
	        	int[] factors = getFactorsArray(number);
        
        		System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        		System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        		System.out.println("Sum of Factors: " + findSum(factors));
        		System.out.println("Product of Factors: " + findProduct(factors));
        		System.out.printf("Product of Cubes of Factors: %.0f%n", findProductOfCubes(factors));
        		input.close();
    	}
}