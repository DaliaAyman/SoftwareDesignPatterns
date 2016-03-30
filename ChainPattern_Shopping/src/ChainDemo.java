
public class ChainDemo {
	private static ComplaintHandler getChainOfHandlers(){
		ComplaintHandler shopWorker = new ShopWorker(ComplaintHandler.WORKER);
		ComplaintHandler shopManager = new ShopManager(ComplaintHandler.MANAGER);
		ComplaintHandler director = new Director(ComplaintHandler.DIRECTOR);
		ComplaintHandler owner = new ShoppingMallOwner(ComplaintHandler.OWNER);
		
		shopWorker.setNextHandler(shopManager);
		shopManager.setNextHandler(director);
		director.setNextHandler(owner);
		
	    return shopWorker;	
	}

	public static void main(String[] args) {
	      ComplaintHandler handlerChain = getChainOfHandlers();

	      handlerChain.handleComplaint(ComplaintHandler.WORKER, 
	    		  "This is a complaint to the worker");

	      System.out.println();
	      
	      handlerChain.handleComplaint(ComplaintHandler.MANAGER, 
	    		  "This is a complaint to the manager");

	      System.out.println();
	      
	      handlerChain.handleComplaint(ComplaintHandler.DIRECTOR, 
	    		  "This is a complaint to the director");

	      System.out.println();
	      
	      handlerChain.handleComplaint(ComplaintHandler.OWNER, 
	    		  "This is a complaint to the owner");
	   }
}
