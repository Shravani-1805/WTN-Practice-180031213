import java.io.*;
import java.util.*;
public class MsgRec {
public static void main(String args[]) {
	int val=args.length;
	if(val==0) {
		System.out.println("No values");
	}
	else {
		System.out.println(args[0]);
		for (int i=1;i<val;i++) {
			System.out.println(","+args[i]);
		}
	}
}
}
