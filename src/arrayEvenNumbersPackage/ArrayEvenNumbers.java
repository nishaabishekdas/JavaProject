package arrayEvenNumbersPackage;

public class ArrayEvenNumbers {
	int sum = 0;
	int[] evenNumberArray = new int[100];

	void populateAnArray() {
		for (int i = 0; i < evenNumberArray.length; i++) {
			evenNumberArray[i] = i + 1;

		}
	}

	void findingEvenNumberInArray() {

		for (int i = 0; i < evenNumberArray.length; i++) {
			if (evenNumberArray[i] % 2 == 0) {
				sum += evenNumberArray[i];
			}
		}
		System.out.println("Sum of even number is:" + sum);
	}

}
