package session4;
class Employee{
	private int empid;
	private String empname;
	private int empsal;
	public void setEid(int id) {
		empid=id;
	}
	public int getEid() {
		return empid;
	}
	public void setName(String n) {
		empname=n;
	}
	public String getName() {
		return empname;
	}
	public void setSalary(int s) {
		empsal=s;
	}
	public int getSalary() {
		return empsal;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(100);
		e.setName("Shravani");
		e.setSalary(30000);
		System.out.println("Employee Id:"+e.getEid());
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Salary:"+e.getSalary());

	}

}
