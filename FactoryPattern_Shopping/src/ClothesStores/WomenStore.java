package ClothesStores;

import Clothes.Dress;
import Clothes.PieceOfCloth;
import Clothes.WomenTrouser;

public class WomenStore extends ClothesStore{

	@Override
	public PieceOfCloth orderPieceOfCloth(String p) {
		PieceOfCloth c = createPieceOfCloth(p);
		return c;
	}

	@Override
	public PieceOfCloth createPieceOfCloth(String p) {
		PieceOfCloth c;
		
		switch (p) {
		case "dress":
			c = new Dress();
			break;
			
		case "trousers":
			c = new WomenTrouser();
			break;
			
		default:
			c = null;
			System.out.println("wrong order!");
			break;
		}
		return c;
	}
	
}
