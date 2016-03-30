
public class CommandDemo {
	public static void main(String[] args){
		ShopManagerInvoker invoker = new ShopManagerInvoker();
		Shop shop = new Shop(); //receiver
		ShopOpenCommand shopOpenCommand = new ShopOpenCommand(shop);
		
		invoker.setCommand(shopOpenCommand);
		invoker.invokeAction();
	}
}
