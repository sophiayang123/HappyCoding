import java.util.Scanner;
public class CompanyConsole {
	private static final int addEmployee =1;
	private static final int displayEmployees =2;
	private static final int displaySeniorEmployee =3;
	private static final int exit = 9;
	private Company startUp;
	private Scanner in;
	
	public CompanyConsole() {
		
	}
	public void meun() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<70; i++) {
			System.out.print("*");
		}
		System.out.println("1. ADD EMPLOYEE"+"/n"+"2. DISPLAY EMPLOYEES"+"/n"+"3. DISPLAY SENIOR EMPLOYEE"+"/n"+"9. EXIT");
		for(int i=0; i<70; i++) {
			System.out.print("*");
		}
	}
	private void addEmployee() {
		
	}
	private void displayEmployees() {
		
	}
	private void displaySeniorEmployee() {
		
	}
	
	public static void main(String[] args) {
		CompanyConsole cc = new CompanyConsole();


	}

}
