
public class RealImage implements Image{

	private String imageURL;
	
	public RealImage(String url){
		this.imageURL = url;
	}
	
	@Override
	public void display() {
		System.out.println("Displaying " + imageURL + " into webpage");
	}
	
}
