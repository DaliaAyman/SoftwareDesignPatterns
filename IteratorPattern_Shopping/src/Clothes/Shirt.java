package Clothes;

public class Shirt extends PieceOfCloth {
	public Shirt(String name, double price){
		setName(name);
		setPrice(price);
		System.out.println("You ordered a shirt: " + getName() + ", with price = " + getPrice());
	}
}
