
public class DalydressFactory extends ClothesFactory{
	
	public DalydressFactory() {
		System.out.println("Dalydress Factory");
	}

	@Override
	public CottonDress createCottonDress() {
		return new Cotton100Dress();
	}

	@Override
	public Jacket createJacket() {
		return new WollenJacket();
	}

}
