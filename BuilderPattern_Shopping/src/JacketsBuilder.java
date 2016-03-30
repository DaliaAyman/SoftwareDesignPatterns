
public abstract class JacketsBuilder {
	Jacket jacket;
	
	public JacketsBuilder() {
		jacket = new Jacket();
	}
	
	public abstract void chooseMaterialQuality();
	public abstract void addLabel();
	public abstract void addAccessories();
	public abstract void finish();
	
	
	public Jacket getJacket(){
		return jacket;
	}
}
