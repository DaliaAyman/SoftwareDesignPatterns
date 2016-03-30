

public class SeasonalDiscountDecorator extends PricingCalculatorDecorator {

	public SeasonalDiscountDecorator(ShoppingMall shoppingMall){
		super(shoppingMall);
	}
	
	@Override
	public double calculatePrice() {
		addSeasonalDiscount();
		return shoppingMall.calculatePrice();
	}
	
	private void addSeasonalDiscount(){
		System.out.println("added seasonal discount");
	}
}
