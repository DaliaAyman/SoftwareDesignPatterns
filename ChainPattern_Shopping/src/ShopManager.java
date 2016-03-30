
public class ShopManager extends ComplaintHandler {

	public ShopManager(int priority) {
		this.priority = priority;
	}
	@Override
	protected void write(String msg) {
		System.out.println("Shop manager handled the msg: " + msg);
	}

}
