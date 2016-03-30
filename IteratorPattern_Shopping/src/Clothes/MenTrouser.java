package Clothes;

public class MenTrouser extends PieceOfCloth {
	
	public MenTrouser(String name, double price){
		setName(name);
		setPrice(price);
		System.out.println("You ordered a men's trouser: " + getName()  + ", with price = " + getPrice());
	}
}
