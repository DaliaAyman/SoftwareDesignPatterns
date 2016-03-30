package ClothesStores;

import Clothes.MenTrouser;
import Clothes.PieceOfCloth;

public class MenStore extends ClothesStore {

	@Override
	public PieceOfCloth orderPieceOfCloth(String p) {
		PieceOfCloth c = createPieceOfCloth(p);
		return c;
	}

	@Override
	public PieceOfCloth createPieceOfCloth(String p) {
		PieceOfCloth c;
		
		switch (p) {
		case "trousers":
			c = new MenTrouser();
			break;

		default:
			c = null;
			System.out.println("wrong order!");
			break;
		}
		return c;
	}

}
