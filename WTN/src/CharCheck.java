import java.io.*;
import java.util.*;
public class CharCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(Character.isUpperCase(ch)==true) {
			ch=Character.toLowerCase(ch);
			System.out.println(ch);
		}
		else if(Character.isLowerCase(ch)==true) {
			ch=Character.toUpperCase(ch);
			System.out.println(ch);
		}
		else {
			System.out.println("invalid");
		}
	}
}
