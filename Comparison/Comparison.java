// Exercise 2.24 
// Comparison.java
import java.util.Scanner;

public class Comparison
{
	//main method begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int number2 = input.nextInt();
		System.out.print("Enter the third integer: ");
		int number3 = input.nextInt();
		System.out.print("Enter the fourth integer: ");
		int number4 = input.nextInt();
		System.out.print("Enter the fifth integer: ");
		int number5 = input.nextInt();
		System.out.print("Enter the sixth integer: ");
		int number6 = input.nextInt();
		
		if ((number1 > number2) && (number1 > number3) && (number1 > number4) && (number1 > number5) && (number1 > number6))
			System.out.printf("The Largest Number is %d%n", number1);
		if ((number2 > number1) && (number2 > number3) && (number2 > number4) && (number2 > number5) && (number2 > number6))
			System.out.printf("The Largest Number is %d%n", number2);
		if ((number3 > number2) && (number3 > number1) && (number3 > number4) && (number3 > number5) && (number3 > number6))
			System.out.printf("The Largest Number is %d%n", number3);
		if ((number4 > number2) && (number4 > number3) && (number4 > number1) && (number4 > number5) && (number4 > number6))
			System.out.printf("The Largest Number is %d%n", number4);
		if ((number5 > number2) && (number5 > number3) && (number5 > number4) && (number5 > number1) && (number5 > number6))
			System.out.printf("The Largest Number is %d%n", number5);
		if ((number6 > number2) && (number6 > number3) && (number6 > number4) && (number6 > number5) && (number6 > number1))
			System.out.printf("The Largest Number is %d%n", number6);
		if ((number1 < number2) && (number1 < number3) && (number1 < number4) && (number1 < number5) && (number1 < number6))
			System.out.printf("The Smallest Number is %d%n", number1);
		if ((number2 < number1) && (number2 < number3) && (number2 < number4) && (number2 < number5) && (number2 < number6))
			System.out.printf("The Smallest Number is %d%n", number2);
		if ((number3 < number2) && (number3 < number1) && (number3 < number4) && (number3 < number5) && (number3 < number6))
			System.out.printf("The Smallest Number is %d%n", number3);
		if ((number4 < number2) && (number4 < number3) && (number4 < number1) && (number4 < number5) && (number4 < number6))
			System.out.printf("The Smallest Number is %d%n", number4);
		if ((number5 < number2) && (number5 < number3) && (number5 < number4) && (number5 < number1) && (number5 < number6))
			System.out.printf("The Smallest Number is %d%n", number5);
		if ((number6 < number2) && (number6 < number3) && (number6 < number4) && (number6 < number5) && (number6 < number1))
			System.out.printf("The Smallest Number is %d%n", number6);		
		
	} //end method main
} //end class