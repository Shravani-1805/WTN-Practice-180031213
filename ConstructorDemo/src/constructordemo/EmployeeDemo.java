package constructordemo;
class Employee{
	int empid;
	String empname;
	int empsal;
	Employee(int empid,String empname, int empsal){
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
	}
	void display() {
		System.out.println(empid+" " + empname+" " +"Salary is "+empsal);
	}
}
public class EmployeeDemo {
	public static void main(String[]  args) {
	Employee emp1=new Employee(01,"Louis",50000);
	emp1.display();
	Employee emp2=new Employee(02,"Noah",40000);
	emp2.display();
	}
}
