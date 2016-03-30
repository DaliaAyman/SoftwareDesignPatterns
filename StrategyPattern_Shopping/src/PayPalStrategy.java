
public class PayPalStrategy extends PaymentStrategy {

	private String email;
	private String password;
	
	public PayPalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}
	@Override
	void pay(double amount) {
		System.out.println("Payment done by PayPal, amount = " + amount);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
