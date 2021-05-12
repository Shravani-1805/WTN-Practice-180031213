import java.io.*;
import java.util.*;
public class SumAvg {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int average=0;
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			sum=arr[i]+sum;
		}
		average=sum/num;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
	}
}
