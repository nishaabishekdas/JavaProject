package learnOperator;

public class ArithmeticOperators {
	int num1;
	int num2;

	void sumOperator() {
		int sum = num1 + num2;
		System.out.println("Sum of num1 and num2 is:" + sum);
	}

	void differenceOperator() {
		int sub = num1 - num2;
		System.out.println("Difference of num1 and num2 is:" + sub);
	}

	void multiplicationOperator() {
		int multi = num1 * num2;
		System.out.println("Multiplication of num1 and num2 is:" + multi);
	}

	void modeOperation() {
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Quotient is:" + quotient + "Remainder is:" + remainder);

	}
}