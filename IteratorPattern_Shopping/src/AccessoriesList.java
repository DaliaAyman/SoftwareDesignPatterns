import Clothes.Accessory;
import Clothes.PieceOfCloth;
import Iterators.AccessoriesListIterator;
import Iterators.Iterator;


public class AccessoriesList implements ClothesStore{

	PieceOfCloth[] accessoriesArray = new PieceOfCloth[3];
	
	public AccessoriesList(){
		PieceOfCloth c1 = new Accessory("bracelet", 30);
		PieceOfCloth c2 = new Accessory("ring", 20);
		PieceOfCloth c3 = new Accessory("necklace", 70);
		accessoriesArray[0] = c1;
		accessoriesArray[1] = c2;
		accessoriesArray[2] = c3;
		
	}
	
	@Override
	public Iterator getIterator() {
		return new AccessoriesListIterator(accessoriesArray);
	}
	
}
