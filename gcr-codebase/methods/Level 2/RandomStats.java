//Creating a class name with RandomStats.
import java.util.Scanner;
public class RandomStats  
{	public static int[] generate4DigitRandomArray(int size)
	{	int[] numbers = new int[size];
        	for (int i = 0; i < size; i++) 
        	{	numbers[i] = (int)(Math.random() * 9000) + 1000;
        	}
        	return numbers;
	}
	public double[] findAverageMinMax(int[] numbers) 
        {	if (numbers.length == 0) return new double[3];

        	int min = numbers[0];
        	int max = numbers[0];
        	double sum = 0;

        	for (int num : numbers) 
            	{	sum += num;
            		min = Math.min(min, num);
            		max = Math.max(max, num);
        	}
		double average = sum / numbers.length;
        	return new double[]{average, (double)min, (double)max};

	}
   	public static void main(String [] args)
	{	Scanner input = new Scanner(System.in);
	
		RandomStats randomStats = new RandomStats();
        	int[] randomNumbers = randomStats.generate4DigitRandomArray(5);
        	System.out.println("Generated 4-digit random numbers:");
        	for (int num : randomNumbers) 
            	{	System.out.print(num + " ");
        	}
        	System.out.println();
        	double[] stats = randomStats.findAverageMinMax(randomNumbers);

	        System.out.printf("Average Value: ", stats[0]);
        	System.out.println("Minimum Value: " + (int)stats[1]);
        	System.out.println("Maximum Value: " + (int)stats[2]);

		input.close();  
    	}
}