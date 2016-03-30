
public class CancelledOrderState implements OrderState{

	@Override
	public void doAction(User context) {
		System.out.println("User is a the order cancelled state");
		context.setOrderState(this);
	}
	
	public String toString(){
		return "Order cancelled State";
	}
}
