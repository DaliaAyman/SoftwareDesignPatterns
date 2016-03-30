
public class PrintItem implements Visitor{

	@Override
	public void visitShoppingCartItemLeaf(ShoppingCartItemLeaf c) {
		System.out.println("visit shopping cart item leaf");
	}

	@Override
	public void visitShoppingCartItemComposite(ShoppingCartComposite c) {
		System.out.println("visit shopping cart item composite");
	}
	
}
