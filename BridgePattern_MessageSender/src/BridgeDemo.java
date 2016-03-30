
public class BridgeDemo {

	public static void main(String[] args){
		String message = "This is a short msg";
		
		Message shortMessage = new ShortMessage(new SMSMessageSender());
		shortMessage.sendMessage(message);
	}
}
