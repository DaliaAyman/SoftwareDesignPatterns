
public class Director extends ComplaintHandler {

	public Director(int priority) {
		this.priority = priority;
	}
	@Override
	protected void write(String msg) {
		System.out.println("Director handled the msg: " + msg);
	}

}
