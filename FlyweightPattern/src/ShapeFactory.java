import java.util.HashMap;


public class ShapeFactory {
	private static final HashMap<String, Shape> rectanglesMap = new HashMap();

	   public static Shape getRectangle(String color, double w, double h) {
		   Rectangle r = (Rectangle)rectanglesMap.get(color);

	      if(r == null) {
	    	 r = new Rectangle(w,h, color);
	         rectanglesMap.put(color, r);
	         System.out.println("Creating Rectangle");
	      }else{
	    	  System.out.println("Already created");
	      }
	      return r;
	   }
}
