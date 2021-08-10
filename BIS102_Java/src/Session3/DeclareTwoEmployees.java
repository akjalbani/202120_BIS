package Session3;

public class DeclareTwoEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee clerk = new Employee();
		Employee driver = new Employee();
		// these are for first Emp
		clerk.setEmpNum(100);
		clerk.setEmpFirstName("Mark");
		clerk.setEmpLastName("Taylor");
		clerk.setEmpSalary(1000.00);
			
		System.out.println("-----Empoyee Details -----");
		System.out.println("Employee ID= "+ clerk.getEmpNum());
		System.out.println("Employee First Name= "+clerk.getEmpFirstName());
		System.out.println("Employee Last Name= "+clerk.getEmpLastName());
		System.out.println("Employee Salary="+ clerk.getEmpSalary());
		
		driver.setEmpNum(500);
		driver.setEmpFirstName("Phil");
		driver.setEmpLastName("Taylor");
		driver.setEmpSalary(200.00);
			
		
		System.out.println("Employee ID= "+ driver.getEmpNum());
		System.out.println("Employee First Name= "+driver.getEmpFirstName());
		System.out.println("Employee Last Name= "+driver.getEmpLastName());
		System.out.println("Employee Salary="+ driver.getEmpSalary());
		
		
	}

}
