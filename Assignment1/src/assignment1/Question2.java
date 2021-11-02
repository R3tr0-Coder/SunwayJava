package assignment1;

// Ryan Cheah Wei Ren
// 20018222
// 31/10/2020
// assignment 1, question 2 answers

import java.util.Scanner;
/*define three int numbers
prompt the user to input num1, num2, num3
get num1,num2,num3
use if else to sort these three numbers
from A to Z
sort these three numbers in ascending order
then display them
program 10 marks
documentation 10 marks (take screenshots of output and explain what happens, draw UML class diagram)
*/
public class Question2 {
    
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

		// Prompt the user to enter three integers
		System.out.print("Enter three integers\nInteger 1: ");
		int number1 = input.nextInt();
                System.out.print("Integer 2: ");
		int number2 = input.nextInt();
                System.out.print("Integer 3: ");
		int number3 = input.nextInt();

		// Sort numbers
		int temp;
                
		if (number2 < number1 || number3 < number1)
		{
                    if (number2 < number1)
                    {
                        temp = number1;
                        number1 = number2;
                        number2 = temp; 
                    }
                    
                    if (number3 < number1)
                    {
			temp = number1;
			number1 = number3;
			number3 = temp;
                    }
		}
                
		if (number3 < number2)
		{
			temp = number2;
			number2 = number3;
			number3 = temp;
		}

		// Display numbers in accending order
		System.out.println(number1 + " " + number2 + " " + number3);
    }
}