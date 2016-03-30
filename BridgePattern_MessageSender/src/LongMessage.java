
public class LongMessage extends Message{

	public LongMessage(MessageSender messageSender) {
		super.messageSender = messageSender;
	}

	@Override
	public void sendMessage(String msg) {
		if(msg.length() > 25){
			messageSender.sendMessage(msg);
		}else{
			System.out.println("Sorry can't send the message");
		}
	}
	
	
}
