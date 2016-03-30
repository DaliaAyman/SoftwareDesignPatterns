
public class AdapterDemo {
	
	public static void main(String[] args) {
		PieceOfCloth c = new CurrencyAdapter();
		double priceEGP = c.adjustCurrency(50);
	}

}
