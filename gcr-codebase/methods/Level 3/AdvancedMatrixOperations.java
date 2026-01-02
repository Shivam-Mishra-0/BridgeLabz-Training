//Creating a class name with AdvancedMatrixOperations.
import java.util.Scanner;
public class AdvancedMatrixOperations 
{	public static double[][] createRandomMatrix(int rows, int cols) 
	{	double[][] matrix = new double[rows][cols];
        		for (int i = 0; i < rows; i++) 
	          {	for (int j = 0; j < cols; j++) 
                		{	matrix[i][j] = Math.floor(Math.random() * 9) + 1;
            		}
        		}
        		return matrix;
    	}
    	public static double[][] transpose(double[][] matrix) 
	{	int rows = matrix.length;
        		int cols = matrix[0].length;
        		double[][] result = new double[cols][rows];
        		for (int i = 0; i < rows; i++) 
            	{	for (int j = 0; j < cols; j++) 
                		{	result[j][i] = matrix[i][j];
            		}
        		}
        		return result;
    	}
    	public static double determinant2x2(double[][] m) 
        	{	return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    	}
    	public static double determinant3x3(double[][] m) 
        	{	return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
               	m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
               	m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    	}

    	public static double[][] inverse2x2(double[][] m) 
        	{	double det = determinant2x2(m);
        		if (det == 0) return null;
        
        		double[][] inv = {
            		{ m[1][1] / det, -m[0][1] / det },
            		{ -m[1][0] / det, m[0][0] / det }
        		};
        		return inv;
    	}
    	public static double[][] inverse3x3(double[][] m) 
        	{	double det = determinant3x3(m);
        		if (det == 0) return null;

        		double[][] inv = new double[3][3];
        		inv[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        		inv[0][1] = (m[0][2] * m[2][1] - m[0][1] * m[2][2]) / det;
        		inv[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;
        
       	 	inv[1][0] = (m[1][2] * m[2][0] - m[1][0] * m[2][2]) / det;
        		inv[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        		inv[1][2] = (m[1][0] * m[0][2] - m[0][0] * m[1][2]) / det;
        
        		inv[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        		inv[2][1] = (m[2][0] * m[0][1] - m[0][0] * m[2][1]) / det;
        		inv[2][2] = (m[0][0] * m[1][1] - m[1][0] * m[0][1]) / det;

        		return inv;
    	}
    	public static void displayMatrix(double[][] matrix) 
        {	for (double[] row : matrix) 
            	{	for (double val : row) 
                	{	System.out.println(val);
            		}
            		System.out.println();
        	}
   	 }
	 public static void main(String[] args) 
       	{	Scanner input = new Scanner(System.in);
		System.out.println("--- 3x3 Matrix Analysis ---");
        	double[][] mat3 = createRandomMatrix(3, 3);
        	displayMatrix(mat3);

        	double[][] trans3 = transpose(mat3);
        	System.out.println("\nTranspose:");
        	displayMatrix(trans3);

        	double det3 = determinant3x3(mat3);
        	System.out.println("\nDeterminant: " + det3);

        	if (det3 != 0) 
            	{	System.out.println("\nInverse:");
            		displayMatrix(inverse3x3(mat3));
        	} 
		else 
            	{	System.out.println("\nInverse does not exist (Determinant is 0).");
        	}
		input.close();
    	}
}