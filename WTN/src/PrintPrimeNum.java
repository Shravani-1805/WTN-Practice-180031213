import java.io.*;
import java.util.*;
public class PrintPrimeNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<=99;i++) {
			int count=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==1) {
				System.out.print(i+" ");
			}
		
		}

	}

}
