package Clothes;

public class Dress extends PieceOfCloth {
	
	public Dress(){
		setPrice(250);
		System.out.println("You ordered a dress, with price = " + getPrice());
	}
}
