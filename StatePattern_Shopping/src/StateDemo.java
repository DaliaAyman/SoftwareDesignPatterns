
public class StateDemo {

	public static void main(String[] args) {
		User context = new User();
		
		AddedToShoppingCartState addedToShoppingCartState = new AddedToShoppingCartState();
		addedToShoppingCartState.doAction(context);
		
		System.out.println(context.getOrderState().toString());
	}

}
