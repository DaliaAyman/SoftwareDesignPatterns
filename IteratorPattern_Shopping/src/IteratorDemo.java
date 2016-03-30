import Clothes.PieceOfCloth;
import Iterators.ClothesListIterator;
import Iterators.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		AccessoriesList acl = new AccessoriesList();
		WomenClothesList wcl = new WomenClothesList();
		System.out.println();
		for(Iterator iter = acl.getIterator(); iter.hasNext();){
			PieceOfCloth c = iter.next();
			System.out.println("Accessories: Name: " + c.getName() + ", Price: " + c.getPrice());
		}
		System.out.println();
		for(Iterator iter = wcl.getIterator(); iter.hasNext();){
			PieceOfCloth c = iter.next();
			System.out.println("Clothes: Name: " + c.getName() + ", Price: " + c.getPrice());
		}
	}

}
