package findingLargestNumber;

public class LargestNumber {
	int n1, n2, n3;

	void largestAmongThree() {
		if (n1 >= n2) {
			if (n2 == n3) {
				System.out.println("All numbers are equal");
			} else if (n1 > n3) {
				System.out.println("The Largest number is:" + n1);
			} else {
				System.out.println("The Largest number is:" + n3);
			}
		} else {
			if (n2 > n3) {
				System.out.println("The Largest number is:" + n2);
			} else {
				System.out.println("The Largest number is:" + n3);
			}
		}

	}

}
