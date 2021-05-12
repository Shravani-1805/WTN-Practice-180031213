package constructordemo;
class Employee1{
	int empid;
	String empname;
	int empsal;
	Employee1(){
		System.out.println("Default Constructor");
	}
	Employee1(int empid,String empname){
		this.empid=empid;
		this.empname=empname;
	}
	Employee1(int empid,String empname,int empsal){
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
	}
	void display() {
		System.out.println("empid:"+empid);
		System.out.println("empname:"+ empname);
		System.out.println("Salary is "+empsal);
	}
}
public class ConstructorOverloadDemo {
	public static void main(String[] args) {
		Employee1 emp1=new Employee1();
		emp1.display();
		Employee1 emp2=new Employee1(01,"Louis");
		emp2.display();
		Employee1 emp3=new Employee1(02,"Noah",30000);
		emp3.display();
	}
}
