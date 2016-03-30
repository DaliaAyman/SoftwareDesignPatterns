package Clothes;

public class Shirt extends PieceOfCloth {
	public Shirt(){
		setPrice(100);
		System.out.println("You ordered a shirt, with price = " + getPrice());
	}
}
