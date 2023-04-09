package multiplicationTablePackage;

import java.util.Scanner;

public class MultiplicationTable {
	int multiNumber;
	Scanner sc = new Scanner(System.in);

	void multiplicationTable() {
		System.out.println("Enter a number");
		int multiResult = sc.nextInt();
		int multiSwapResult = multiResult;
		for (int count = 1; count <= 10; count++) {
			multiResult = multiSwapResult * count;
			System.out.println(multiSwapResult + "*" + count + "=" + multiResult);
		}

	}
}
