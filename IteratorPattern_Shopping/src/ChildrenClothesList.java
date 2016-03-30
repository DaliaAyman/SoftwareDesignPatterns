import java.util.ArrayList;

import Clothes.PieceOfCloth;
import Clothes.Shirt;
import Iterators.ClothesListIterator;
import Iterators.Iterator;


public class ChildrenClothesList implements ClothesStore{
	ArrayList<PieceOfCloth> childrenList;
	
	public ChildrenClothesList(String name, double price){
		childrenList = new ArrayList<>();
		childrenList.add(new Shirt("shirt 1", 100));
		childrenList.add(new Shirt("shirt 2", 90));
	}
	
	@Override
	public Iterator getIterator() {
		return new ClothesListIterator(childrenList);
	}

	
}
