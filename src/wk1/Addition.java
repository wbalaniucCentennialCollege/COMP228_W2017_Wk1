package wk1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1, number2, sum;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		// Adding number1 with number2
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
	}
}
