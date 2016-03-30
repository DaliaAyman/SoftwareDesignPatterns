
public class CottonJacketBuilder extends JacketsBuilder{

	@Override
	public void chooseMaterialQuality() {
		System.out.println("Cotton - choosing material quality");
	}

	@Override
	public void addLabel() {
		System.out.println("Cotton - adding label");
	}

	@Override
	public void addAccessories() {
		System.out.println("Cotton - adding accessories");
	}

	@Override
	public void finish() {
		System.out.println("Cotton - finishing");
	}
}
