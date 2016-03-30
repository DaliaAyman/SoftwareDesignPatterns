package ClothesStores;

import Clothes.PieceOfCloth;
import Clothes.Shirt;

public class ChildrenStore extends ClothesStore {

	@Override
	public PieceOfCloth orderPieceOfCloth(String p) {
		PieceOfCloth c = createPieceOfCloth(p);
		return c;
	}

	@Override
	public PieceOfCloth createPieceOfCloth(String p) {
		PieceOfCloth c;
		switch (p) {
		case "shirt":
			c = new Shirt();
			break;

		default:
			c = null;
			System.out.println("wrong order!");
			break;
		}
		return c;
	}

}