
public class StoreOrder extends ShoppingProcessTemplate{
	
	@Override
	void select() {
		System.out.println("StoreOrder-selected");
	}

	@Override
	void doPayment() {
		System.out.println("StoreOrder-payment done");
	}

	@Override
	void doDelivery() {
		System.out.println("StoreOrder-delivery done");
	}
}
