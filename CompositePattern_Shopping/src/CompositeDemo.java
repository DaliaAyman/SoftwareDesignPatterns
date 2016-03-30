
public class CompositeDemo {
	
	public static void main(String[] args) {
		ShoppingCartComponent clothesCart = new ShoppingCartComposite("clothes", 500);
		clothesCart.add(new ShoppingCartItemLeaf("dress", 100));
		clothesCart.add(new ShoppingCartItemLeaf("t-shirt", 100));
		clothesCart.add(new ShoppingCartItemLeaf("trouser", 100));
		clothesCart.add(new ShoppingCartItemLeaf("jupe", 100));
		clothesCart.add(new ShoppingCartItemLeaf("shirt", 100));
		
		ShoppingCartComponent accessoriesCart = new ShoppingCartComposite("accessories", 50);
		accessoriesCart.add(new ShoppingCartItemLeaf("necklace", 50));
		
		ShoppingCartComponent allCart = new ShoppingCartComposite("allCart", 550);
		allCart.add(clothesCart);
		allCart.add(accessoriesCart);
		
		allCart.print();
	}

}
