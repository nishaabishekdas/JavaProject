package loopPackage;

import java.util.Scanner;

public class ForLoopClass {
	int actualPin;
	int enteredPin;
	int withdrawAmount;
	int availableBalance;

	void comparePin() {
		int lockNumber = 0;
		Scanner sc = new Scanner(System.in);

		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter the PIN:");
			enteredPin = sc.nextInt();
			if (enteredPin == actualPin) {
				System.out.println("PIN verification successful");
				System.out.println("Enter the Withdrawal Amount:");
				withdrawAmount = sc.nextInt();
				if (withdrawAmount <= availableBalance) {
					System.out.println("Withdrwaw successful.Amount Withdraw is:" + withdrawAmount);
				} else {
					System.out.println("Not Enough Balance in Account");
				}
				break;
			} else {
				lockNumber++;
				System.out.println("Incorrect PIN.Try Again!!");
			}

		}
		if (lockNumber == 3) {
			System.out.println("Your Card is Blocked.Please unblock to continue!!");
		}
	}

}
