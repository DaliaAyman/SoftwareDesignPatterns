
public class CreditCardStrategy extends PaymentStrategy {

	private String name;
	private String expiryDate;
	private String cardNo;
	
	public CreditCardStrategy(String name, String expiryDate, String cardNo) {
		this.name = name;
		this.expiryDate = expiryDate;
		this.cardNo = cardNo;
	}
	
	@Override
	void pay(double amount) {
		System.out.println("Payment done by Credit card, amount = " + amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	
}
