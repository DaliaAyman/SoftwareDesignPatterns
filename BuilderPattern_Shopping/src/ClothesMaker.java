
public class ClothesMaker {
	public JacketsBuilder builder;
	
	public ClothesMaker(JacketsBuilder builder){
		this.builder = builder;
	}
	
	public void constructJacketBuilder(){
		builder.chooseMaterialQuality();
		builder.addLabel();
		builder.addAccessories();
		builder.finish();
	}
	
	public Jacket getJacket(){
		return builder.getJacket();
	}
}
