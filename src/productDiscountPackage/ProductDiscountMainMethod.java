package productDiscountPackage;

public class ProductDiscountMainMethod {
	public static void main(String args[]) {
		ProductDiscount discount = new ProductDiscount();
		//Price of product without promo code
		discount.priceOfProduct = 500;
		discount.discountCalculator();
		//price of product with 20% discount
		discount.promoCode="Promo20";
		discount.priceOfProduct = 300;
		discount.discountCalculator();
		//price of product with 10% discount
		discount.promoCode="Promo10";
		discount.priceOfProduct = 200;
		discount.discountCalculator(); 
		//price of product with 5% discount 
		discount.promoCode="Promo5";
		discount.priceOfProduct = 600;
		discount.discountCalculator();

	}
}
