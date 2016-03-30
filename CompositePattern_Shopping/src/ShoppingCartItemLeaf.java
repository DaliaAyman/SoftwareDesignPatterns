import java.util.ArrayList;
import java.util.Iterator;


public class ShoppingCartItemLeaf extends ShoppingCartComponent{
	
	String description;
	double price;
	
	public ShoppingCartItemLeaf(String desc, double price){
		this.description = desc;
		this.price = price;
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
		
	}
}
