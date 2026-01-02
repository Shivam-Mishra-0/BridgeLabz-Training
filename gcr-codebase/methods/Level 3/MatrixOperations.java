//Creating a class name with MatrixOperations.
import java.util.Scanner;
public class MatrixOperations {
    public static double[][] createRandomMatrix(int rows, int columns) {
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.floor(Math.random() * 10) + 1;
            }
        }
        return matrix;
    }
    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int columns = A[0].length;
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int columns = A[0].length;
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length;
        int columnsA = A[0].length;
        int columnsB = B[0].length;
        double[][] result = new double[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.println(val);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for Matrix A: ");
        int rowA = sc.nextInt();
        System.out.print("Enter columns for Matrix A: ");
        int columnA = sc.nextInt();
        System.out.print("Enter rows for Matrix B: ");
        int rowB = sc.nextInt();
        System.out.print("Enter columns for Matrix B: ");
        int columnB = sc.nextInt();
        double[][] matrixA = createRandomMatrix(rowA, columnA);
        double[][] matrixB = createRandomMatrix(rowB, columnB);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        if (rowA == rowB && columnA == columnB) {
            System.out.println("\nResult of Addition (A + B):");
            displayMatrix(addMatrices(matrixA, matrixB));
            System.out.println("\nResult of Subtraction (A - B):");
            displayMatrix(subtractMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nAddition and Subtraction skipped: Matrices must have identical dimensions.");
        }
        if (columnA == rowB) {
            System.out.println("\nResult of Multiplication (A * B):");
            displayMatrix(multiplyMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nMultiplication skipped: Columns of A must match Rows of B.");
        }
        sc.close();
    }
}