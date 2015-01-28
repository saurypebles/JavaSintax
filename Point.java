import java.util.Scanner;


public class Point {

		double xValue;
		double yValue;
	 
public 	 Point(){
		 Scanner sc=new Scanner(System.in);
		 xValue=sc.nextDouble();
		 yValue=sc.nextDouble();
		 //sc.close();
	 }
	 
public	 Point(double x, double y){
	 	 xValue=x;
		 yValue=y;
	 }

public Point(String input)
{
	String [] points=input.split(" ");
	xValue=Double.parseDouble(points[0]);
	yValue=Double.parseDouble(points[1]);
	
}
	 
	public double Distance(Point p){
	
		return Math.sqrt((Math.pow(this.xValue - p.xValue,2))+(Math.pow(this.yValue -p.yValue, 2)));
	}
	
	public void Print(){
		System.out.println(this.xValue);
		System.out.println(this.yValue);
	}

	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a=new Point("12.9 11");
		
		Point nul=new Point(0.0,0.0);
		//p.Print();
		//nul.Print();
		System.out.println(a.Distance(nul));
	} */
}
