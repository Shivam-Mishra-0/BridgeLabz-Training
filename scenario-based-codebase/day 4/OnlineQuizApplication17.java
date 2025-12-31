/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.*;

public class OnlineQuizApplication17
{	public static void main( String args[] )
	{	Scanner input = new Scanner( System.in );
		String[] questions = {
			"""
            +===================================================+
            | Q1) Which of the following is true about the      |
            |     default size of an array in Java?             |
			|                                                   |
            |  a. Arrays do not have a default size.            |
            |  b. The size depends on the available JVM memory. |
            |  c. The default size is 0.                        |
            |  d. The default size is 10.                       |
            +===================================================+""",
			"""
			+===================================================+
            | Q2. In Java, what does the '==' operator compare  |
            |     when used with two object references?         |
			|                                                   |
            |  a. It compares the hash codes of the objects.    |
            |  b. It compares the internal attributes of the    |
            |     objects.                                      |
            |  c. It automatically calls the .equals() method.  |
            |  d. It compares the memory addresses (references) |
            |     of the objects.                               |
            +===================================================+""",
			"""
			+===================================================+
            | Q3. What is the default value of a String variable|
            |     that is declared as a class member but not    |
            |     initialized?                                  |
			|                                                   |
            |  a. 0                                             |
            |  b. ""                                            |
            |  c. undefined                                     |
            |  d. null                                          |
            +===================================================+""",
			"""
			+===================================================+
            | Q4. Which escape sequence would you use to move   |
            |     the cursor to a new line in a console output? |
			|                                                   |
            |  a. \\r                                            |
            |  b. \\n                                            |
            |  c. \\b                                            |
            |  d. \\t                                            |
            +===================================================+""",
			"""
			+===================================================+
            | Q5. What is the purpose of the '.2' in the format |
            |     specifier '%.2f' when using System.out.printf?|
			|                                                   |
            |  a. It allocates 2 spaces for the entire number.  |
            |  b. It multiplies the number by 2.                |
            |  c. It limits the output to 2 total digits.       |
            |  d. It formats the number to 2 decimal places.    |
            +===================================================+"""
			};
			System.out.println(questions);
			char[] answers = {'a', 'd', 'd', 'b', 'd'};
			int score = 0;

			for (int i = 0; i < questions.length; i++) 
			{	System.out.println(questions[i]);
    
				System.out.print("| Enter your answer (a/b/c/d): ");
				char userChoice = input.next().toLowerCase().charAt(0);
   
				boolean isCorrect = false;
				switch (i) {
				case 0: isCorrect = (userChoice == 'a'); break;
				case 1: isCorrect = (userChoice == 'd'); break;
				case 2: isCorrect = (userChoice == 'd'); break;
				case 3: isCorrect = (userChoice == 'b'); break;
				case 4: isCorrect = (userChoice == 'd'); break;
			}
			if (isCorrect) 
			{	score++;
				System.out.println("| Correct! Well done.                             |");
			} 
			else 
			{	System.out.printf("| Wrong! The correct answer was: %-17s|\n", answers[i]);
			}
			System.out.println("+===================================================+\n");
		}

		System.out.println("+===================================================+");
		System.out.printf("| Your Final Score: %d / %d                          |\n", score, questions.length);
		System.out.println("+===================================================+");

		input.close();
	}
}