
public interface Visitor {
	public abstract void visitShoppingCartItemLeaf(ShoppingCartItemLeaf c);
	public abstract void visitShoppingCartItemComposite(ShoppingCartComposite c);
	
}
