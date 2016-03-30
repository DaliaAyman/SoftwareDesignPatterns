
public abstract class ShoppingCartComponent {
	
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	public void add(ShoppingCartComponent component){
		throw new UnsupportedOperationException();
	}
	
	public void remove(ShoppingCartComponent component){
		throw new UnsupportedOperationException();
	}
	
	public ShoppingCartComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
}
