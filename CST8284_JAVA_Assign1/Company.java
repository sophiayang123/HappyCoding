/*
Represents an abstraction of a Company
*/
public class Company {
	private Employee[] employee;
	private static int numberEmployees;
	private static final int maxnumEmployees=10;
	
	public Company() {
		employee = new Employee[10];
	}
	
	public void addEmployee(String name, int employeeNumber, OurDate startDate, double salary) {
		if(!isMaximumEmployees()) {
			employee[currentNumberEmployees()] = new Employee(name,employeeNumber,startDate,salary);
		}
	}
	
	public int currentNumberEmployees() {
		for(int i=0; i< employee.length; i++) {
			if(employee[i]!=null)
				numberEmployees++;
		} 
		return numberEmployees;
	}
	
	public boolean isMaximumEmployees() {
		if(numberEmployees> maxnumEmployees) 
			return false;
		else
			return true;
	}
	
	public Employee[] getEmployees() {
		return employee;
	}
	
//	public Employee findSeniorEmployee() {
//		Employee ep = employee[0];
//		for(int i=0; i< currentNumberEmployees(); i++) {
//			if(ep.getStartDate() ) {
//				
//			}
//		}
//	}
	
}
