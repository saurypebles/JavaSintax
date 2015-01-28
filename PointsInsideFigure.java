import java.util.Scanner;

public class PointsInsideFigure {
	
	double xValue;
	double yValue;
	
	public  PointsInsideFigure()
	{
		Point p=new Point();
		
		xValue=p.xValue;
		yValue=p.yValue;
	}
	
	

	public static void main(String[] args) {
		
			PointsInsideFigure p=new PointsInsideFigure();	
				
		boolean door= p.xValue>17.5 && p.xValue <20 && p.yValue >8.5 && p.yValue <=13.5;
		
		boolean house = p.xValue>=12.5 && p.xValue<=22.5 && p.yValue>=6 && p.yValue<=13.5;
						
		if(house && !door )
		{System.out.println("Inside");}
		else
		{System.out.println("Outside");}

	}

}
