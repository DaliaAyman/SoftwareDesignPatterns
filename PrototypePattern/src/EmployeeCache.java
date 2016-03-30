import java.util.Hashtable;


public class EmployeeCache {
	private static Hashtable<String, Employee> employeesMap = new Hashtable<String, Employee>();
	
	public static Employee getEmployee(String employeeId){
		Employee cachedEmployee = employeesMap.get(employeeId);
		
		return (Employee)cachedEmployee.clone();
	}
	
	public static void loadCache(){
		ShopWorker w1 = new ShopWorker();
		w1.setId("1");
		employeesMap.put(w1.getId(), w1);
		
		ShopWorker w2 = new ShopWorker();
		w2.setId("2");
		employeesMap.put(w2.getId(), w2);
		
		ShopManager m1 = new ShopManager();
		m1.setId("3");
		employeesMap.put(m1.getId(), m1);
	}
}
