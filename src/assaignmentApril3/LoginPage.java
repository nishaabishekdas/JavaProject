package assaignmentApril3;

import java.util.Scanner;

public class LoginPage {
	String username = "pivotAdmin";
	String password = "Admin123";
	String enteredUsername;
	String enteredPassword;
	Scanner sc = new Scanner(System.in);

	void loginPageCheck() {
		int accountLock = 0;
		for (int count = 1; count <= 3; count++) {
			System.out.println("Enter the username:");
			enteredUsername = sc.next();
			System.out.println("Enter the Password:");
			enteredPassword = sc.next();
			if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
				System.out.println("You are logged into the application");
				break;
			} else {
				accountLock++;
				System.out.println("Incorrect user ID or password.Try Again!");
			}
		}
		if (accountLock == 3) {
			System.out.println("Account Locked");
		}
	}
}
