package Clothes;

public class Dress extends PieceOfCloth {
	
	public Dress(String name, double price){
		setName(name);
		setPrice(price);
		System.out.println("You ordered a dress: " + getName() + " , with price = " + getPrice());
	}
}
