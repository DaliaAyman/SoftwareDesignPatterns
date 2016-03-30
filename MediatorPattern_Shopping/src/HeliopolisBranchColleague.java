
public class HeliopolisBranchColleague extends BranchesColleague{

	public HeliopolisBranchColleague(Mediator m, String name) {
		super(m, name);
	}

	public void sendComplaint(String msg){
		System.out.println( name + " sent messsage");
		mediator.sendComplaint(msg, this);
	}
	
	@Override
	public void receive(String msg) {
		System.out.println("HeliopolisBranchColleague received; message: " + msg);
	}
	
	
}
