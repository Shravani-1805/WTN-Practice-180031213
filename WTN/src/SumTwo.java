import  java.io.*;
import java.util.*;
public class SumTwo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<num;i++) {
			int count=0;
			count=num%10;
			sum=sum+count;
			num=num/10;
			count=0;
		}
		System.out.println(sum);
	}
}
