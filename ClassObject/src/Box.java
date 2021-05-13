import java.io.*;
public class Box{
	double width;
	double height;
	double depth;
	Box(double w,double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume() {
		double vol=height*width*depth;
		return vol;
	}


	public static void main(String[]  args) {
	Box box=new Box(20.2,10.1,30.3);
	System.out.println("Volume of the Box:"+box.volume());

	
	}
}
