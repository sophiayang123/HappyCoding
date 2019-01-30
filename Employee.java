public class Employee {
	private String name;
	private int employeeNumber;
	private double salary;
	private OurDate startDate;
	
	public Employee() {
		this("unknow");			
	}
	public Employee(String name) {
		this(name,-9);
	}
	public Employee(String name, int employeeNumber) {
		this(name,employeeNumber,new OurDate());
	}
	public Employee(String name, int employeeNumber,OurDate startDate) {
		this(name,employeeNumber,startDate, -1);
	}
	public Employee(String name, int employeeNumber, OurDate startDate, double salary) {
		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setStartDate(startDate);
		this.setSalary(salary);
	}
	
	public String getName() {
		return name;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public OurDate getStartDate() {
		return startDate;
	}
	public double getSalary() {
		return salary;
	}
	private void setName(String name) {
		if(name.equals("unknow")) {
			throw new IllegalArgumentException("Invalid name ");
		}else
		    this.name = name;		
	}
	private void setEmployeeNumber(int employeeNumber) {
		if(employeeNumber<0 ) {
			throw new IllegalArgumentException("Invalid employeeNumber ");
		}else
			this.employeeNumber = employeeNumber;
	}
	
	private void setStartDate(OurDate startDate) {
		this.startDate.getDay();
		this.startDate.getMonth();
		this.startDate.getYear();
	}
	
	private void setSalary(double salary) {	
		if(salary<0 ) {
			throw new IllegalArgumentException("Invalid employeeNumber ");
		}else
			this.salary=salary;
	}
	
	@Override
	public String toString() {
		return name + "/t/t" + employeeNumber + "/t/t" + getStartDate() + "/t/t" + getSalary();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass()!=obj.getClass()) {
			return false;
		}else {
		Employee ep = (Employee) obj;
		return ( this.name.equals(ep.getName()) && this.employeeNumber == ep.getEmployeeNumber() && this.salary == ep.getSalary());
		}
		
	}
}
