//Creating a class name with Calculator indicating to purpose is to create a calulator using switch case.
import java.util.Scanner;
public class Calculator
{	public static void main(String args[])
	{	//Create a double vairable name with number1, number2, addition, subtraction, multiplication and division also a string variable name with op.
		double number1, number2, addition, subtraction, multiplication, division;
		String op;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number1,number2,op .
		System.out.println("Enter the number1 :");
		number1 = input.nextDouble();
		System.out.println("Enter the number2 :");
		number2 = input.nextDouble();
		System.out.println("Enter the op :");
		op = input.next();
		//Using Switch case calculate addition, subtraction, multiplication and division.		import java.util.Scanner;
        	switch (op) {
        		case "+":
                		addition = number1 + number2;
               			System.out.println("The sum of two number is " + addition);
                		break;
            		case "-":
            			subtraction = number1 - number2;
             		 	System.out.println("The difference of two number is " + subtraction);
              			break;
       		    	case "*":
              	  		multiplication = number1 * number2;
                		System.out.println("The multiplication of two number is " + multiplication);
                		break;
            		case "/":
                		if (number2 != 0) {
                    			System.out.println("The division is " + (number1 / number2));
                		}	
				 else 
				{	System.out.println("Error: Cannot divide by zero.");
                		}
                		break;
	    		default: 
				//print Invalid Operator	
				System.out.println("Invalid Operator" );
			}			
				
		input.close();
	}
}







				

