public class OnlineOrder extends ShoppingProcessTemplate{

	@Override
	void select() {
		System.out.println("OnlineOrder-selected");
	}

	@Override
	void doPayment() {
		System.out.println("OnlineOrder-payment done");
	}

	@Override
	void doDelivery() {
		System.out.println("OnlineOrder-delivery done");
	}
	
}