package session4;
class Person{
	int pid;
	String name;
	Person(int pid,String name){
	this.pid=pid;
	this.name=name;
	}
	void display() {
		System.out.println("Person Id:"+pid);
		System.out.println("Person Name:"+name);	
	}
}
class Student extends Person{
	String address;
	Student(int pid,String name,String address){
		super(pid,name);
		this.address=address;	
	}
	void show() {
		System.out.println("Person Id:"+pid);
		System.out.println("Person Name:"+name);
		System.out.println("Person Address:"+address);
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(101,"Shravani","ABC");
		s.show();
		
	}

}
