//creating a FactorOfNumber to find the factor of a number 
import java.util.Scanner;
class FactorOfNumber {
    public static int[] storeFactorInArray(int number){
	int initialSize =10;
	
	
	int countFactor = 0;
	for ( int i = 1 ; i <=number ;i++){
	    if( number % i ==0 ) 
		countFactor++;
	}
	
	int[] arr = new int[countFactor];
	
	int index = 0;
	for (int i =1 ;i <= number ;i++)
	{
	   
	    if( number % i == 0 )
	        arr[index++] = i;
	}
     	return arr;
    }


	//it returns the sum of the factors
	public static int sumOfFactor(int[] arr){
	    int sum = 0;
	    for(int i= 0;i<arr.length;i++){
		if( arr[i] ==0 ) 
		   break;
		sum += arr[i];
	    }
	    return sum;
	}

	//it returns the multiple of the factors
	public static int multipleOfFactor(int[] arr){
	    int multiple = 1;
	    for(int i= 0;i<arr.length;i++){
		if( arr[i] ==0 ) 
		   break;
		multiple *= arr[i];
	    }
	    return multiple;
	}
	
	

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	System.out.print("Enter number :");
	int number = sc.nextInt();
	
	//calling function to get maximum handshakes
	int[] arr = storeFactorInArray (number);
	
	//printing the output
	for(int i= 0 ;i < arr.length ;i++)
	    System.out.println(arr[i]); 
	
	int sumOfFactor = sumOfFactor(arr);
	System.out.println("the sum of the factor :" + sumOfFactor);

	int multiple  = multipleOfFactor(arr);
	System.out.println("the multiple of the factor :" + multiple);	

	System.out.println("the square of sum of the factor :" + Math.pow(sumOfFactor,2));
	
	  sc.close();  
    }
}	
