package methodoverload;
class Student{
	int sid;
	String name;
	int marks;
	static String college="klu";
	Student(int id,String n,int m){
		sid=id;
		name=n;
		marks=m;
	}
	void display() {
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+name);
		System.out.println("Student marks:"+marks);
		System.out.println("Student college:"+college);
		
	}
	static {
		college="K L University";
	}
	
}
public class StaticDemo {
	public static void main(String args[]) {
		Student s=new Student(101,"Louis",40);
		s.display();
	}
}
