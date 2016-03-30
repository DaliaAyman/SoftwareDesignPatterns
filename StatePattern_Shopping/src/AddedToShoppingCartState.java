
public class AddedToShoppingCartState implements OrderState{

	@Override
	public void doAction(User context) {
		System.out.println("User is at the Added to shopping cart state");
		context.setOrderState(this);
	}
	
	public String toString(){
		return "Added to shopping cart State";
	}
}
