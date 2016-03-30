

public class SalesTaxDecorator extends PricingCalculatorDecorator{

	public SalesTaxDecorator(ShoppingMall shoppingMall){
		super(shoppingMall);
	}
	
	@Override
	public double calculatePrice() {
		addSales();
		return shoppingMall.calculatePrice();
	}
	
	private void addSales(){
		System.out.println("added Sales");
	}
}
