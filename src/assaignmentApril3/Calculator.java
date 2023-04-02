package assaignmentApril3;

import java.util.Scanner;

public class Calculator {
	int number;
	int operationInput;
	Scanner sc = new Scanner(System.in);

	void calculatorCheckMethod() {
		System.out.println("Enter the number:");
		number = sc.nextInt();
		System.out.println("Enter the operation needs to perform:\n 1.Square of a number \n 2.Cube of a number");
		operationInput = sc.nextInt();
		switch (operationInput) {
		case 1:
			number *= number;
			System.out.println("Sqaure of the number is " + number);
			break;
		case 2:
			number = number * number * number;
			System.out.println("Cube of the number is " + number);
			break;
		default:
			System.out.println("Invalid Operation");
		}

	}
}
