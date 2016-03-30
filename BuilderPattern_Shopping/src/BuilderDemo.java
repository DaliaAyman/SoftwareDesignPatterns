
public class BuilderDemo {
	
	public static void main(String[] args) {
		JacketsBuilder b = new WoolJacketBuilder();
		ClothesMaker w = new ClothesMaker(b);
		w.constructJacketBuilder();
	}
}
