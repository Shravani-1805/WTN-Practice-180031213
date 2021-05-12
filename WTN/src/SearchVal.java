import java.io.*;
import java.util.*;
public class SearchVal {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int val=sc.nextInt();
		for(int i=0;i<num;i++) {
		if(arr[i]==val) {
			System.out.println("Index Value is "+i);
			return;
		}
		
		}	
		System.out.println("-1");
	}
}
