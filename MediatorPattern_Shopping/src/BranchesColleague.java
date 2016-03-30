
public abstract class BranchesColleague {
	Mediator mediator;
	String name;
	
	public BranchesColleague(Mediator m, String name) {
		mediator = m;
		this.name = name;
	}
	public abstract void sendComplaint(String msg);
	public abstract void receive(String msg);
}
