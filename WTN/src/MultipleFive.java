import java.io.*;
import java.util.*;
public class MultipleFive {
	public static void main(String args[]) {
	int count=0;
	int val =0;
	while(count!=5) {
		val=val+1;
		if((val%2==0) && (val%3==0) && (val%5==0)) {
			System.out.print(val+" ");
			count=count+1;
		}
		
	}
}
}