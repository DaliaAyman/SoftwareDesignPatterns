import java.util.ArrayList;
import Clothes.MenTrouser;
import Clothes.PieceOfCloth;
import Clothes.Shirt;
import Iterators.ClothesListIterator;
import Iterators.Iterator;

public class MenClothesList implements ClothesStore {

	ArrayList<PieceOfCloth> menList;
	
	public MenClothesList() {
		menList = new ArrayList<>();
		menList.add(new MenTrouser("trouser1", 200));
		menList.add(new Shirt("shirt 1", 100));
	}
	
	@Override
	public Iterator getIterator() {
		return new ClothesListIterator(menList);
	}
	
}