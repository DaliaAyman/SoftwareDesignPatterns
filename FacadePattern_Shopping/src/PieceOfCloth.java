import java.text.*;
import java.util.*;

public class PieceOfCloth { //Originator
	private String id;
	private String lastEdited;
	private double price;
	private boolean available;
	
	public void setState(String id, String lastEdited, double price){
		this.id = id;
		this.lastEdited = lastEdited;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastEdited() {
		return lastEdited;
	}
	public String setLastEditedDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		//System.out.println(dateFormat.format(cal.getTime()));
		return dateFormat.format(cal.getTime());
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}