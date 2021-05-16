import java.io.*;
import java.util.*;
public class FindElement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter the number of elements in the array: ");
	int num=sc.nextInt();
	System.out.print("Enter the elements in the array: ");
	int arr[]=new int[num];
	
	try {	
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the index of the array element you want to access: ");
		int find=sc.nextInt();
				System.out.println("The array element at index "+find+" = "+arr[find]);
				System.out.println("The array element successfully accessed.");
		}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae);
	}
	catch(InputMismatchException ipe) {
		System.out.println(ipe);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
