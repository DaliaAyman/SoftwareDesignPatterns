
public class ConcreteFactory extends ClothesFactory {

	public ConcreteFactory() {
		System.out.println("Concrete Factory");
	}
	
	@Override
	public CottonDress createCottonDress() {
		return new Cotton80Dress();
	}

	@Override
	public Jacket createJacket() {
		return new ChemicallyModifiedWollenJacket();
	}

}
