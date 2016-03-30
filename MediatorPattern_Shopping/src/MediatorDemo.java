
public class MediatorDemo {
	public static void main(String[] args){
		ManagementOfBranchesMediator mediator = new ManagementOfBranchesMediator();
		HeliopolisBranchColleague heliopolis = new HeliopolisBranchColleague(mediator, "heliopolis");
		NasrCityBranchColleague nasrCity = new NasrCityBranchColleague(mediator, "nasr city");
		
		mediator.addColleague(heliopolis);
		mediator.addColleague(nasrCity);
		
		heliopolis.sendComplaint("There is an error here");
	}
}
