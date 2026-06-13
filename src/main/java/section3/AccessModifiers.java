package section3;

class Employee{
	
	private int empID;
	private String empName;
	private double salary;
	
	Employee(int empID,String empName, double salary ){
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	int getempId() {
		return empID;
	}
	String getempName() {
		return empName;
	}
	double getsalary() {
		return  salary;
	}	
     void display() {
	System.out.println(getempId());
	System.out.println(getempName());
	System.out.println(getsalary());	
	
}
}
public class AccessModifiers {

	public static void main(String[] args) {
		// Use private variables with getters/setters
   Employee obj = new Employee(1, "Tanish", 80000.00);
   obj.display();
	}

}
