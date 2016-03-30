package Iterators;

import Clothes.PieceOfCloth;

public class AccessoriesListIterator implements Iterator {
	PieceOfCloth[] array;
	int index=0;
	
	public AccessoriesListIterator(PieceOfCloth[] array){
		this.array = array;
	}
	
	@Override
	public boolean hasNext() {
		if(index < array.length){
			return true;
		}
		return false;
	}

	@Override
	public PieceOfCloth next() {
		if(this.hasNext()){
			return array[index++];
		}
		return null;
	}

}