
public class FlyweightPattern {

	public static void main(String[] args) {
		Shape r1 = (Rectangle)ShapeFactory.getRectangle("red", 5, 10);
		Shape r2 = (Rectangle)ShapeFactory.getRectangle("green", 6, 20);
		Shape r3 = (Rectangle)ShapeFactory.getRectangle("black", 7, 30);
		
		Shape r1a = (Rectangle)ShapeFactory.getRectangle("red", 5, 10);
		
		
	}

}
