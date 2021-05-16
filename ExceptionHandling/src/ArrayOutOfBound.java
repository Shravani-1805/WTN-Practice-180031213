import java.io.*;
import java.util.*;
public class ArrayOutOfBound {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter the number of elements in the array: ");
	int num=sc.nextInt();
	System.out.print("Enter the elements in the array: ");
	int arr[]=new int[num];
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.print("Enter the index of the array element you want to access: ");
	int find=sc.nextInt();
	try {	
				System.out.println("The array element at index "+find+" = "+arr[find]);
				System.out.println("The array element successfully accessed.");
			
		}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
