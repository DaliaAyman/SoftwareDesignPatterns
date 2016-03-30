import java.util.ArrayList;


public class ManagementOfBranchesMediator implements Mediator{

	private ArrayList<BranchesColleague> colleagues;
	
	public ManagementOfBranchesMediator() {
		colleagues = new ArrayList<>();
	}
	public void addColleague(BranchesColleague colleague){
		colleagues.add(colleague);
	}
	
	@Override
	public void sendComplaint(String msg, BranchesColleague originator) {
		for(BranchesColleague colleague: colleagues){
			if(colleague != originator){
				colleague.receive(msg);
			}
		}
	}

}
