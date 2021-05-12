import java.io.*;
import java.util.*;
public class PalindromeNum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int val=0;
		while(num!=0) {
			int store=num%10;
			val=val*10+store;
			num=num/10;
		}
		if(num1==val) {
			System.out.println(num1 +" is a palindrome");
		}
		else {
			System.out.println(num1 +" is not a palindrome");
		}
	}
}
