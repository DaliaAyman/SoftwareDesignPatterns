
public class ProxyImage implements Image{

	private RealImage realImage;
	private String imageURL;
	
	public ProxyImage(String url){
		this.imageURL = url;
	}
	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(imageURL);
		}
		realImage.display();
	}
	

}
