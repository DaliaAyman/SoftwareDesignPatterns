
public class ShopManagerInvoker {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public ShopManagerInvoker() {
	}
	
	public void invokeAction(){
		command.execute();
	}
}
