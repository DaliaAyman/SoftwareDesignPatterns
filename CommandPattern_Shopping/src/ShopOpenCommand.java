
public class ShopOpenCommand extends Command{
	Shop shop;
	
	public ShopOpenCommand(Shop shop) {
		this.shop = shop;
	}
	@Override
	public void execute() {
		System.out.println("shop open command executed");
	}
	
}
