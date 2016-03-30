
public class EmailMessageSender implements MessageSender{

	@Override
	public void sendMessage(String msg) {
		System.out.println("Message sent via E-mail: " + msg);
	}

	
}
