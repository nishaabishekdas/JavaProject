package productDiscountPackage;

public class ProductDiscount {
	double priceOfProduct;
	String promoCode;

	void discountCalculator() {
		double discountVariable = 0.0;
		if (promoCode == "Promo5") {
			discountVariable = (priceOfProduct * 50) / 100;
			priceOfProduct -= discountVariable;
			discountVariable = (priceOfProduct * 5) / 100;
			priceOfProduct -= discountVariable;
			System.out.println("The product got 50% as well as 5% discount");
			System.out.println("Price of Product after discount is" + priceOfProduct);
		} else if (promoCode == "Promo10") {
			discountVariable = (priceOfProduct * 50) / 100;
			priceOfProduct -= discountVariable;
			discountVariable = (priceOfProduct * 10) / 100;
			priceOfProduct -= discountVariable;
			System.out.println("The product got 50% as well as 10% discount");
			System.out.println("Price of Product after discount is" + priceOfProduct);
		} else if (promoCode == "Promo20") {
			discountVariable = (priceOfProduct * 50) / 100;
			priceOfProduct -= discountVariable;
			discountVariable = (priceOfProduct * 20) / 100;
			priceOfProduct -= discountVariable;
			System.out.println("The product got 50% as well as 20% discount");
			System.out.println("Price of Product after discount is" + priceOfProduct);
		} else {
			discountVariable = (priceOfProduct * 50) / 100;
			priceOfProduct -= discountVariable;
			System.out.println("Price of Product after discount is" + priceOfProduct);
		}
	}
}
