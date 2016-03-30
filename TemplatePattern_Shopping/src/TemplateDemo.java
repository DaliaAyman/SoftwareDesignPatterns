
public class TemplateDemo {
	
	public static void main(String[] args){
		System.out.println("Online Order:");
		System.out.println("------------");
		ShoppingProcessTemplate tOnline = new OnlineOrder();
		tOnline.makeShoppingProcess();
		System.out.println();
		System.out.println("Store Order:");
		System.out.println("------------");
		ShoppingProcessTemplate tStore = new StoreOrder();
		tStore.makeShoppingProcess();
	}
}
