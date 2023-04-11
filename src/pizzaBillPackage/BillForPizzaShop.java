package pizzaBillPackage;

import java.util.Scanner;

public class BillForPizzaShop {
	int extraCheese = 1;
	//String orderItem = "Cheese Pizza";
	String[] sizeOfPizza = { "small", "medium", "large" };
	int[] pepperoniToppingsPrize = { 2, 3, 3 };
	int[] prizeOfPizza = { 15, 20, 25 };
	Scanner sc = new Scanner(System.in);

	void pizzaPrizeFinder() {
		System.out.println("Enter the size of Cheese Pizza");
		String size = sc.next();
		for (int i = 0; i < sizeOfPizza.length; i++) {
			if (sizeOfPizza[i].equals(size)) {
				System.out.println("Do you need pepperoni Topings?");
				String topings = sc.next();
				System.out.println("Do you need Extra Cheese?");
				String cheeseNeeded = sc.next();
				if (topings.equals("yes") && cheeseNeeded.equals("yes")) {
					float totalPrize = pepperoniToppingsPrize[i] + prizeOfPizza[i] + extraCheese;
					System.out.println("Your final bill is" + totalPrize);
					break;
				} else if (topings.equals("yes") && cheeseNeeded.equals("no")) {
					float totalPrize = pepperoniToppingsPrize[i] + prizeOfPizza[i];
					System.out.println("Your final bill is" + totalPrize);
					break;
				} else if (topings.equals("no") && cheeseNeeded.equals("yes")) {
					float totalPrize = prizeOfPizza[i] + extraCheese;
					System.out.println("Your final bill is" + totalPrize);
					break;
				} else {
					float totalPrize = prizeOfPizza[i];
					System.out.println("Your final bill is" + totalPrize);
				}
			} 

		}
	}
}
