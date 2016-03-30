
public class ShopWorker extends Employee {
	public ShopWorker(){
		setType("worker");
	}

	@Override
	void doStuff() {
		System.out.println("Shop worker is doing his job.");
	}
}
