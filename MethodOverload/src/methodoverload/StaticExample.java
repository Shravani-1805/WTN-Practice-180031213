package methodoverload;

public class StaticExample {
	StaticExample(){
		System.out.println("Constructor");
	}
	static {
		System.out.println("Static Block 3");
	}
	static void show() {
		System.out.println("Static Method");
	}
	static {
		System.out.println("Static Block 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		StaticExample s1=new StaticExample();
		StaticExample.show();
	}
		static {
			System.out.println("Static Block 2");
		}

}
