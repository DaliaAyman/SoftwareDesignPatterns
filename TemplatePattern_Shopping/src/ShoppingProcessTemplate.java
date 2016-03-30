
public abstract class ShoppingProcessTemplate {
	public final void makeShoppingProcess(){
		order();
		select();
		doPayment();
		giftWrap();
		doDelivery();
	}
	void order(){
		System.out.println("ordered");
	}
	abstract void select();
	abstract void doPayment();
	void giftWrap(){
		System.out.println("gift wrapped");
	}
	abstract void doDelivery();
	
}
