
public class WoolJacketBuilder extends JacketsBuilder {

	@Override
	public void chooseMaterialQuality() {
		System.out.println("Wool - choosing material quality");
	}

	@Override
	public void addLabel() {
		System.out.println("Wool - adding label");
	}

	@Override
	public void addAccessories() {
		System.out.println("Wool - adding accessories");
	}

	@Override
	public void finish() {
		System.out.println("Wool - finishing");
	}

}
