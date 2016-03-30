import ClothesStores.ClothesStore;
import ClothesStores.WomenStore;


public class App {
	public static void main(String[] args) {
		ClothesStore store = new WomenStore();
		store.orderPieceOfCloth("dress");
	}

}
