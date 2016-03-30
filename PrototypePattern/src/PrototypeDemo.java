
public class PrototypeDemo {

	public static void main(String[] args) {
		EmployeeCache.loadCache();
		
		Employee clonedEmployee = (Employee) EmployeeCache.getEmployee("1");

		Employee clonedEmployee2 = (Employee) EmployeeCache.getEmployee("2");

		Employee clonedEmployee3 = (Employee) EmployeeCache.getEmployee("3");
		
		System.out.println("Employee1: " + clonedEmployee.getType());
		System.out.println("Employee2: " + clonedEmployee2.getType());
		System.out.println("Employee3: " + clonedEmployee3.getType());
	}

}
