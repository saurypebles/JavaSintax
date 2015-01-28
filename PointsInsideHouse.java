import java.util.Scanner;

public class PointsInsideHouse {
	
	public double xValue;
	public double yValue;
	
	public PointsInsideHouse()
	{
		
		 Point p=new Point();
		 xValue=p.xValue;
		 yValue=p.yValue;
				
	}
	

	public static void main(String[] args) {
		
			
		PointsInsideHouse p=new PointsInsideHouse();
		 
		
		boolean door= p.xValue>17.5 && p.xValue <20 && p.yValue >8.5 && p.yValue <=13.5;
		
		boolean house = p.xValue>=12.5 && p.xValue<=22.5 && p.yValue>=6 && p.yValue<=13.5;
		
		boolean roofl= p.xValue>=12.5 && p.xValue<=17.5 && p.yValue<=8.5 && p.xValue+p.yValue>=21;
		
		boolean roofr= p.xValue<=22.5 && p.xValue>=17.5 && p.yValue<=8.5 && p.xValue+p.yValue>=14;
		
		if(house && !door || roofl || roofr )
		{System.out.println("Inside");}
		else
		{System.out.println("Outside");}

	}

}
