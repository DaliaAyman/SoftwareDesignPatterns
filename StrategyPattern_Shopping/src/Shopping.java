
public class Shopping {

	double amountOfBuyings;
	PaymentStrategy strategy;
	
	public Shopping(double amount) {
		this.amountOfBuyings = amount;
	}
	public void setStrategy(PaymentStrategy s){
		this.strategy = s;
	}
	
	public double getAmountOfBuyings() {
		return amountOfBuyings;
	}
	public void setAmountOfBuyings(double amountOfBuyings) {
		this.amountOfBuyings = amountOfBuyings;
	}
	
	
	public static void main(String[] args) {
		Shopping s1 = new Shopping(100);
		if(s1.amountOfBuyings > 200){
			s1.setStrategy(new PayPalStrategy("email", "pass"));
		}else{
			s1.setStrategy(new CreditCardStrategy("name", "expiry date", "cardNo"));
		}
		
		s1.strategy.pay(s1.amountOfBuyings);
	}

}
