import java.io.*;
import java.util.*;
public class AlpOrd {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char val1=sc.next().charAt(0);
	char val2=sc.next().charAt(0);
	if(val1>val2) {
		System.out.println(val2+" "+val1);
	}
	else {
		System.out.println(val1+" "+val2);
	}
}
}
