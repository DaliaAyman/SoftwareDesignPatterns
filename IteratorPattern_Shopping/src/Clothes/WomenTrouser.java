package Clothes;

public class WomenTrouser extends PieceOfCloth {
	public WomenTrouser(String name, double price){
		setName(name);
		setPrice(price);
		System.out.println("You ordered a women's trouser: " + getName() + ", with price = " + getPrice());
	}
	
}
