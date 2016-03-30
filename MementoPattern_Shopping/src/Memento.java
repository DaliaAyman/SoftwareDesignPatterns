public class Memento {

	private String id;
	private String lastEdited;
	private double price;
	private boolean available;
	
	public Memento(String id, String lastEdited, double price) {
		this.id = id;
		this.lastEdited = lastEdited;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getLastEdited() {
		return lastEdited;
	}

	public double getPrice() {
		return price;
	}
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}