//Creating a class name with StudentWithPens indicating to purpose is to calculate quantity of pens among the students.
public class StudentWithPens
{
	public static void main(String args[])
	{	
		//Create a integer vairable name with students, pens and assign the value 3, 14.
		int students = 3, pens = 14;

		//Create a int variable name with quantity and remaining . Modulus operator ( % ) , Division Operator ( / ).
		//First : We will calculate quantity of pens by dividing 14 by 3 = 4.
		//Second : We will calculate remaining by using modulus operator from 14 by 3 = 2 .
		int quantity = 14 / 3;

		int remaining = 14 % 3 ;

		//Print the quantity and remaining.
		System.out.println(" The Pen Per Student is " + quantity + " and the remaining pen not distributed is " + remaining);
	}
}
	
