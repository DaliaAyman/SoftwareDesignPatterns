import java.util.ArrayList;
import java.util.Iterator;


public class ShoppingCartComposite extends ShoppingCartComponent{
	ArrayList<ShoppingCartComponent> shoppingCartComponents = new ArrayList<>();
	String description;
	double price;
	
	public ShoppingCartComposite(String desc, double price){
		this.description = desc;
		this.price = price;
	}
	

	@Override
	public void accept(Visitor v) {
		v.visitShoppingCartItemComposite(this);
	}
	
	public void add(ShoppingCartComponent component){
		shoppingCartComponents.add(component);
	}
	public void remove(ShoppingCartComponent component){
		shoppingCartComponents.remove(component);
	}
	
	public ShoppingCartComponent getChild(int i){
		return (ShoppingCartComponent)shoppingCartComponents.get(i);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print(){
		System.out.println();
		System.out.println("Description: " + getDescription());
		System.out.println("Price: " + getPrice());
		
		Iterator iterator = shoppingCartComponents.iterator();
		while(iterator.hasNext()){
			ShoppingCartComponent component = (ShoppingCartComponent)iterator.next();
			component.print();
		}
	}



}
