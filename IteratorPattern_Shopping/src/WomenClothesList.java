import java.util.ArrayList;

import Clothes.Dress;
import Clothes.PieceOfCloth;
import Clothes.WomenTrouser;
import Iterators.ClothesListIterator;
import Iterators.Iterator;


public class WomenClothesList implements ClothesStore{
	ArrayList<PieceOfCloth> womenList;
	
	public WomenClothesList(){
		womenList = new ArrayList<>();
		womenList.add(new Dress("dress 1", 300));
		womenList.add(new WomenTrouser("trouser women 1", 200));
	}
	
	@Override
	public Iterator getIterator() {
		return new ClothesListIterator(womenList);
	}

	
}
