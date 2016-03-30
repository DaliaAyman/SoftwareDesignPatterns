
public class ShoppingMallOwnerSingleton {
	
	   private static ShoppingMallOwnerSingleton instance = new ShoppingMallOwnerSingleton();

	   private ShoppingMallOwnerSingleton(){}

	   public static ShoppingMallOwnerSingleton getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Only one shopping owner.");
	   }
}
