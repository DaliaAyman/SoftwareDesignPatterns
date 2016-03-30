
public class ShopManager extends Employee {

	public ShopManager(){
		setType("manager");
	}
	
	@Override
	void doStuff() {
		System.out.println("Shop manager is doing his job.");
	}

}
