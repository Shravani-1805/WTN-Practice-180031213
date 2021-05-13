import java.io.*;
class Calculate{
static double powerInt(int num1,int num2) {
	return Math.pow(num1,num2);
}
static double powerDouble(double num1,double num2) {
	return Math.pow(num1,num2);
}
}
public class Calculator {
public static void main(String[] args) {
	System.out.println(Calculate.powerInt(23, 5));
	System.out.println(Calculate.powerDouble(23.3, 5.5));
	}
}
