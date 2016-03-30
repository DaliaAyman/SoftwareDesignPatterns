
public class Rectangle implements Shape{

	private double width;
	private double height;
	private String color;
	
	public Rectangle(double w, double h, String c) {
		width = w;
		height = h;
		color = c;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing rectangle: width= " + getWidth() + ", height= "
				+ getHeight() + ", Color= " + getColor());
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
}
