package ClothesStores;

import Clothes.PieceOfCloth;

public abstract class ClothesStore {
	
	abstract public PieceOfCloth orderPieceOfCloth(String p);
	abstract public PieceOfCloth createPieceOfCloth(String p);
}
