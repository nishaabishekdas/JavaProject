package assaignmentApril3;

public class ChocolateBox {
	int maxChocolate = 63;
	int chocolateFilled;
	Boolean isChoclateBoxOverflow;

	void chocolateAddingMechanism() {
		for (int chocolateCount = 27; chocolateCount <= maxChocolate; chocolateCount += 5) {
			// System.out.println("Chocolate in the box is:" + chocolateCount);
			chocolateFilled = chocolateCount;
			isChoclateBoxOverflow = true;

		}
		if (isChoclateBoxOverflow) {
			System.out.println("Chocolate Box contains " + chocolateFilled + " Chocolates!!");
		} else {
			System.out.println("ChocolateBox overflowed");
		}
	}
}
