import java.io.*;
import java.util.*;
public class MaxMin {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int max=0,min=0;
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		if(arr[0]>arr[1]) {
			max=arr[0];
			min=arr[1];
		}
		else {
			max=arr[1];
			min=arr[0];
		}
		for(int i=2;i<num;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			else {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
		}
		System.out.println("Maximum Number in the array: "+max);
		System.out.println("Minimum Number in the array: "+min);
	}
}
