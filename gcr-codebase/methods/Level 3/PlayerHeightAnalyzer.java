//Creating a class name with PlayerHeightAnalyzer.
import java.util.Scanner;
public class PlayerHeightAnalyzer 
{	public static int findTallest(int[] heights) 
        {	int max = heights[0];
        	for (int h : heights) 
            	{	max = Math.max(max, h);
        	}
        	return max;
    	}
	public static int findShortest(int[] heights) 
        {	int min = heights[0];
        	for (int h : heights) 
            	{	min = Math.min(min, h);
        	}
        	return min;
    	}
	public static double findMean(int[] heights) 
	{	double total = (double) findSum(heights);
        	return total / heights.length;
    	}
	public static int findSum(int[] heights) 
        {	int total = 0;
        	for (int h : heights) 
            	{	total += h;
        	}
        	return total;
	}
    	public static void main(String[] args) 
        {	int[] heights = new int[11];
		Scanner input = new Scanner(System.in);
        	for (int i = 0; i < heights.length; i++) 
            	{	heights[i] = (int)(Math.random() * (250 - 150 + 1)) + 150;
        	}

        	System.out.println("Generated Player Heights (in cms):");
        	for (int h : heights) 
            	{	System.out.print(h + " ");
        	}
        	System.out.println("\n");

        	int sum = findSum(heights);
        	double mean = findMean(heights);
        	int shortest = findShortest(heights);
        	int tallest = findTallest(heights);

        	System.out.println("Sum of all heights: " + sum + " cms");
        	System.out.printf("Mean height: %.2f cms%n", mean);
        	System.out.println("Shortest player: " + shortest + " cms");
        	System.out.println("Tallest player: " + tallest + " cms");
		input.close();
    	}
}