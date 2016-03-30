

public class CurrencyConversionDecorator extends PricingCalculatorDecorator {

	public CurrencyConversionDecorator(ShoppingMall shoppingMall){
		super(shoppingMall);
	}
	
	@Override
	public double calculatePrice() {
		addCurrency();
		return shoppingMall.calculatePrice();
	}

	private void addCurrency(){
		System.out.println("Currency converted");
	}
}
