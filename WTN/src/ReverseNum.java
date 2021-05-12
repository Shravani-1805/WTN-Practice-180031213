import java.io.*;
import java.util.*;
public class ReverseNum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int val=0;
		while(num!=0) {
			int store=num%10;
			val=val*10+store;
			num=num/10;
		}
		System.out.println(val);
	}
}
