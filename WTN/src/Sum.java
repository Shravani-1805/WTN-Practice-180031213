import  java.io.*;
import java.util.*;
public class Sum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<num;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
