
public class SingletonDemo {
	
	public static void main(String[] args) {
		ShoppingMallOwnerSingleton owner = ShoppingMallOwnerSingleton.getInstance();

		owner.showMessage();
	}

}
