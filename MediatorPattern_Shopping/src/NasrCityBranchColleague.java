
public class NasrCityBranchColleague extends BranchesColleague{

	public NasrCityBranchColleague(Mediator m, String name) {
		super(m, name);
	}

	public void sendComplaint(String msg){
		System.out.println(name + " sent messsage");
		mediator.sendComplaint(msg, this);
	}
	
	@Override
	public void receive(String msg) {
		System.out.println("NasrCityBranchColleague received; message: " + msg);
	}
	
	
}
