
public class ShopWorker extends ComplaintHandler{

	public ShopWorker(int priority){
		this.priority = priority;
	}
	
	@Override
	protected void write(String msg) {
		System.out.println("Shop worker handled the msg: " + msg);
	}
	
}
