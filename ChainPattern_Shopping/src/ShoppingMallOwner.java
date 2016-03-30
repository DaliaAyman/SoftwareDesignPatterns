
public class ShoppingMallOwner extends ComplaintHandler{

	public ShoppingMallOwner(int priority) {
		this.priority = priority;
	}
	@Override
	protected void write(String msg) {
		System.out.println("Shoping mall owner handled the msg: " + msg);
	}
	
}
