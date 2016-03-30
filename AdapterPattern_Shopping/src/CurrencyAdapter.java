
public class CurrencyAdapter extends PieceOfCloth{

	@Override
	public double adjustCurrency(double price) {
		double priceEGP = price * 8;
		
		Payment payment = new Payment();
		payment.requestCurrencyInEGP(priceEGP);
		return priceEGP;
	}
	
}
