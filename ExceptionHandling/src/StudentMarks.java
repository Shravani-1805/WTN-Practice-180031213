import java.io.*;
import java.util.*;
public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	/*	try {
			String name=sc.next();
			double sub1=sc.nextInt();
			double sub2=sc.nextInt();
			double sub3=sc.nextInt();
			
			double val=average(double sub1,double sub2, double sub3);
			System.out.println("Name: "+name+" Subject 1: "+sub1+" Subject 2: "+sub2+" Subject 3: "+sub3);
			System.out.println("Average marks of "+name+" is "+val);
		}
		catch(InvalidInputException ipe) {
			System.out.println(ipe);
		}
		public static double average(double sub1, double sub2, double sub3) throws Exception{
			return (sub1+sub2+sub3)/3;
			
		}
		*/
		
	}
}
class InvalidInputException extends Exception{
	public InvalidInputException(double sub1, double sub2, double sub3) {
		super();
	}
}
