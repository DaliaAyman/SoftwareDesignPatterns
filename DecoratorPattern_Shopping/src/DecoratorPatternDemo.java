
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		ShoppingMall egyptShoppingMall = new EgyptMall();
		ShoppingMall taxDecorator = new SalesTaxDecorator(egyptShoppingMall);
		
		taxDecorator.calculatePrice();
	}

}
