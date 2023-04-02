package assaignmentApril3;

import java.util.Scanner;

public class PrimeNumber {
	int enteredPrimeNumber;
	boolean isPrime;
	Scanner sc = new Scanner(System.in);

	void primeNumberCheck() {
		System.out.println("Input a positive integer:");
		enteredPrimeNumber = sc.nextInt();
		if (enteredPrimeNumber > 2) {
			for (int i = 2; i < enteredPrimeNumber; i++) {
				if (enteredPrimeNumber % i == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Enterd number " + enteredPrimeNumber + "is a not a prime Number");
			} else {
				System.out.println("Enterd number " + enteredPrimeNumber + "is a prime Number");
			}
		} else if (enteredPrimeNumber == 0 || enteredPrimeNumber == 1) {
			System.out.println("The number entered is a composite number");
		} else {
			System.out.println("Negative values will not be considered!!");
		}
	}

}
