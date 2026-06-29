package java_program;

class employee{
	String emp_name;
	int salary;
	employee(String emp_name,int salary){
	this.emp_name = emp_name;
	this.salary = salary;
}
}
class manager extends employee{
	String department;
	manager(String emp_name,int salary,String department){
		super(emp_name,salary);
		this.department = department;
	
	}
	void display() {
	System.out.println("Employee name:"+emp_name);
	System.out.println("Salary:"+salary);
	System.out.println("department:"+department);
}}
public class program_2 {
	public static void main (String[]args) {
		manager mg = new manager("Shruhsti", 50000,"Finance");
		mg.display();
		
	}
}
