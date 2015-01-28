//import java.util.Scanner;

  
 
public class Triangle {
	
	public Point a,b,c;
	double ab;
	double ac;
	double bc;
	
	Triangle(Point pointOne,Point pointTwo, Point pointThree){
	
		a=pointOne;
		b=pointTwo;
		c=pointThree;
		
		ab=pointOne.Distance(pointTwo);
		ac=pointOne.Distance(pointThree);
		bc=pointTwo.Distance(pointThree);
	}
	
	public double Arrea(){
		
		double halfperim=(this.ab+this.ac+this.bc)/2;
		return Math.sqrt(halfperim*(halfperim-ab)*(halfperim-ac)*(halfperim-bc));
	}
	
	public boolean isTriangle(){
		
		double ka, kb, kc;
		
		ka=(b.yValue-c.yValue)/(b.xValue-c.xValue);
		kb=(c.yValue-a.yValue)/(c.xValue - a.xValue);
		kc=(a.yValue -b.yValue)/(a.xValue - b.xValue);
		if(ka==kb || kb==kc||ka==kc)
		{return false;}
		else
		{return true;}
	}


	public static void main(String[] args) {
				

		Point a, b, c;
		a= new Point();
		b=new Point();
		c=new Point();
		
		Triangle tr=new Triangle(a,b,c);
		//System.out.printf("%f  %f  %f", tr.ab, tr.ac, tr.bc);
		
		if(tr.isTriangle())
		{
			System.out.print("arrea:");
			System.out.println(Math.round(tr.Arrea()));
		}
		else 
		{		System.out.println("0");
		}
		
		
	}

}
