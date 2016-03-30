package Iterators;

import java.util.ArrayList;

import Clothes.PieceOfCloth;

public class ClothesListIterator implements Iterator {
	
	ArrayList<PieceOfCloth> arrayList;
	int index=0;
	
	public ClothesListIterator(ArrayList<PieceOfCloth> arrayList){
		this.arrayList = arrayList;
	}
	
	@Override
	public boolean hasNext() {
		if(index < arrayList.size()){
			return true;
		}
		return false;
	}

	@Override
	public PieceOfCloth next() {
		if(this.hasNext()){
			return arrayList.get(index++);
		}
		return null;
	}

}
