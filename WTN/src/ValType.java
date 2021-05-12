import java.io.*;
import java.util.*;
public class ValType {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Character c=new Character('\n');
	//c=sc.hasNextInt();
	//char ch=c;
	//String s=Character.toString(ch);
	System.out.println(Character.isLetter(c));
	System.out.println(Character.isDigit(c));
}
}
