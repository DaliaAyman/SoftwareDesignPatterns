
public class ShopCloseCommand extends Command{
	Shop shop;
	
	public ShopCloseCommand(Shop shop) {
		this.shop = shop;
	}
	
	@Override
	public void execute() {
		System.out.println("shop closed command executed");
	}
	
}
