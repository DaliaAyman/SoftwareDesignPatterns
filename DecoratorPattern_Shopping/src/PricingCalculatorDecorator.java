public abstract class PricingCalculatorDecorator implements ShoppingMall {
	
	protected ShoppingMall shoppingMall;
	
	public PricingCalculatorDecorator(ShoppingMall shoppingMall){
		this.shoppingMall = shoppingMall;
	}
	
	public double calculatePrice(){
		return shoppingMall.calculatePrice();
	}
}
