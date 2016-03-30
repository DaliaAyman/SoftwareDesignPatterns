
public class FacadeDemo {

	public static void main(String[] args) {
		PieceOfCloth p = new PieceOfCloth();
		p.setAvailable(true);
		ShoppingFacade shoppingFacade = new ShoppingFacade(p);
		shoppingFacade.doAction();
	}

}
