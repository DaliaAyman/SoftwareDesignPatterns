
public class MementoDemo {

	public static void main(String[] args) {
		PieceOfCloth originatorCloth = new PieceOfCloth();
		CareTaker careTaker = new CareTaker();
		
		originatorCloth.setState("Id1", originatorCloth.setLastEditedDate(), 200);
		
		careTaker.add(originatorCloth.saveStateToMemento());
		
		originatorCloth.setState("Id2", originatorCloth.setLastEditedDate(), 300);
		
		careTaker.add(originatorCloth.saveStateToMemento());
		
		originatorCloth.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: Id: " + originatorCloth.getId()
				+ ", lastEdited: " + originatorCloth.getLastEdited()
				+ ", price: " + originatorCloth.getPrice());
		
		System.out.println("");
		
		originatorCloth.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: Id: " + originatorCloth.getId()
				+ ", lastEdited: " + originatorCloth.getLastEdited()
				+ ", price: " + originatorCloth.getPrice());
	}

}
