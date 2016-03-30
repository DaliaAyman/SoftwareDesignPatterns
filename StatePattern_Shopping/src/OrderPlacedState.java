
public class OrderPlacedState implements OrderState{

	@Override
	public void doAction(User context) {
		System.out.println("User is at the Order placed state");
		context.setOrderState(this);
	}

	public String toString(){
		return "Order placed State";
	}
}
