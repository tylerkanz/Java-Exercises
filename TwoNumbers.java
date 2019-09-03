// Exercise 2.15 Arithmetic
// TwoNumbers.java
import java.util.Scanner;

public class TwoNumbers
{
	//main method begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		int product = number1 * number2;
		int diff = number1 - number2;
		int quo = number1 / number2;
		
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Difference is %d%n", diff);
		System.out.printf("Quotient is %d%n", quo);
	} //end method main
} //end class