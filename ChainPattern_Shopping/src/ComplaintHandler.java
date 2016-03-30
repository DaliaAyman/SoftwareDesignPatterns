
public abstract class ComplaintHandler {
	protected ComplaintHandler nextHandler;
	public static int WORKER = 0;
	public static int MANAGER = 1;
	public static int DIRECTOR = 2;
	public static int OWNER = 3;
	protected int priority;
	
	public void handleComplaint(int priority, String msg){
		if(this.priority <= priority){
			write(msg);
		}
		if(nextHandler != null){
			nextHandler.handleComplaint(priority, msg);
		}
	}
	
	abstract protected void write(String msg);

	public void setNextHandler(ComplaintHandler complaintHandler){
		nextHandler = complaintHandler;
	}
}
