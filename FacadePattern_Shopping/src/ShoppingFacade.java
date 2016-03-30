
public class ShoppingFacade {
	InventoryService inventory;
	ShippingService shipping;
	PaymentService payment;
	
	PieceOfCloth p;
	public ShoppingFacade(PieceOfCloth p) {
		this.p = p;
		
		inventory = new InventoryService();
		shipping = new ShippingService();
		payment = new PaymentService();
	}
	
	public void doAction(){
		if(inventory.isAvailable(p)){
			shipping.shipProduct();
			payment.makePayment();
		}
	}
}
