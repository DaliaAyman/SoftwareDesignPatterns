package Clothes;

public class Accessory extends PieceOfCloth {
	public Accessory(String name, double price){
		setName(name);
		setPrice(price);
		System.out.println("You ordered an accessory: " + getName() + " , with price = " + getPrice());
	}
}
