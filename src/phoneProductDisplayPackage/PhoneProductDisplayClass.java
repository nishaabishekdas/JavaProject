package phoneProductDisplayPackage;

import java.util.Scanner;

public class PhoneProductDisplayClass {
	boolean errorMessageFlag = false;
	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] apple = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 11 Pro" };
	Scanner sc = new Scanner(System.in);

	void findProductNames() {

		System.out.println("Select a brand Name to display available product: \n Samsung \n Google \n Apple");
		String brand = sc.nextLine();
		switch (brand) {
		case "Samsung":
			System.out.println("Products available under brand name Samsung is:");
			for (int samProduct = 0; samProduct < samsung.length; samProduct++) {
				System.out.println(samsung[samProduct]);
			}
			System.out.println("Select a product");
			String samsungProductName = sc.nextLine();
			for (int samProduct = 0; samProduct < samsung.length; samProduct++) {
				if (samsung[samProduct].equals(samsungProductName)) {
					System.out.println("Product selected is " + samsung[samProduct]);
					errorMessageFlag = false;
					break;
				} else {
					errorMessageFlag = true;
				}
			}
			if (errorMessageFlag) {
				System.out.println("Please select a product from the list");
			}
			break;
		case "Google":
			System.out.println("Products available under brand name Google is:");
			for (int googleProduct = 0; googleProduct < google.length; googleProduct++) {
				System.out.println(google[googleProduct]);
			}
			System.out.println("Select a product");
			String googleProductName = sc.nextLine();
			for (int googleProduct = 0; googleProduct < google.length; googleProduct++) {
				if (google[googleProduct].equals(googleProductName)) {
					System.out.println("Product selected is " + google[googleProduct]);
					errorMessageFlag = false;
					break;
				} else {
					errorMessageFlag = true;
				}
			}
			if (errorMessageFlag) {
				System.out.println("Please select a product from the list");
			}
			break;
		case "Apple":
			System.out.println("Products available under brand name Apple is:");
			for (int appleProduct = 0; appleProduct < apple.length; appleProduct++) {
				System.out.println(apple[appleProduct]);
			}
			System.out.println("Select a product");
			String appleProductName = sc.nextLine();
			for (int appleProduct = 0; appleProduct < apple.length; appleProduct++) {
				if (apple[appleProduct].equals(appleProductName)) {
					System.out.println("Product selected is " + apple[appleProduct]);
					errorMessageFlag = false;
					break;
				} else {
					errorMessageFlag = true;
				}
			}
			if (errorMessageFlag) {
				System.out.println("Please select a product from the list");
			}
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
	}

}
