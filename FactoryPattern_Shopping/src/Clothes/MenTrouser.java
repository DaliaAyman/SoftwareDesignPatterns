package Clothes;

public class MenTrouser extends PieceOfCloth {
	public MenTrouser(){
		setPrice(150);
		System.out.println("You ordered a men's trouser, with price = " + getPrice());
	}
}
