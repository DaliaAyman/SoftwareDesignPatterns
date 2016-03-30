
public class SMSMessageSender implements MessageSender{

	@Override
	public void sendMessage(String msg) {
		System.out.println("Message sent via SMS: " + msg);
	}

	
}
