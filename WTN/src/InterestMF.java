import java.io.*;
import java.util.*;
public class InterestMF {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int age=sc.nextInt();
	if((s.equals("Female")) && (age>=1 && age<=58)) {
		System.out.println("Percentage of Interest is 8.2%");
	}
	else if((s.equals("Female")) && (age>=59 && age<=100)) {
		System.out.println("Percentage of Interest is 9.2%");
	}
	else if((s.equals("Male")) && (age>=1 && age<=58)) {
		System.out.println("Percentage of Interest is 8.4%");
	}
	else if((s.equals("Male")) && (age>=59 && age<=100)) {
		System.out.println("Percentage of Interest is 10.5%");
	}
	else {
		System.out.println("Invalid Input");
	}
	}
}
