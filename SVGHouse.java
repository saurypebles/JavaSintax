import java.io.*;
import java.util.*;
public class SVGHouse {
	
	public static boolean isInside(Point p)
	{
		double xValue=p.xValue;
		double yValue=p.yValue;
		
		boolean door= xValue>17.5 && xValue <20 && yValue >8.5 && yValue <=13.5;
		
		boolean house = xValue>=12.5 && xValue<=22.5 && yValue>=6 && yValue<=13.5;
		
		boolean roofl= xValue>=12.5 && xValue<=17.5 && yValue<=8.5 && xValue+yValue>=21;
		
		boolean roofr= xValue<=22.5 && xValue>=17.5 && yValue<=8.5 && xValue+yValue>=14;
		
		return (house && !door || roofl || roofr );
	}

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		

		
		PrintStream fw = new PrintStream("house.htm", "UTF-8");
		fw.println("<!DOCTYPE html>");
		fw.println("<html>");
		fw.println("<head>");
		fw.println("<style>");
		fw.println("rect {stroke:#505050; fill: #B8B8B8;}");
		fw.println("polygon {stroke:#505050; fill: #B8B8B8 ;}");
		fw.println("line {stroke:#B8B8B8 ;stroke-dasharray: 1 2;stroke-linecap: round; stroke-opacity:0.5;}");
		fw.println("</style>");
		fw.println("</head>");
		fw.println("<body>");
		fw.println("<svg width=\"400\" height=\"400\">");
		fw.println("<rect x=\"100\" y=\"200\" height=\"100\" width=\"100\" />");
		fw.println("<rect x=\"250\" y=\"200\" height=\"100\" width=\"50\"/>");
		fw.println("<polygon points=\"100,200 300,200 200,100\" />");
		//fw.print("</svg>");
		String text="<text x=\"";
		String text1="\"  y=\"40\" >";
		String text2="</text>";
		int temp=0;
		double xAxis=10;
				for(int i=50;i<=300;i+=50)
				{temp=i-5;
					fw.println(text+temp+text1+xAxis+text2);
					xAxis+=2.5;
				}
				text="<text x=\"10\" y=\"";
				text1="\" >";
				
				
				
		double yAxis=3.5;
				for(int i=100;i<=350;i+=50)
				{
					fw.println(text+i+text1+yAxis+text2);
					yAxis+=2.5;
				}
		
		String line="<line x1=\"30\"  y1=\"";
		String line1="\"  x2=\"330\"";
		String line2="   y2=\"";		
				
		for(int i=100;i<=350;i+=50)
		{
			fw.println(line+i+line1+line2+i+"\"/>");
		}
		
		
		
		line="<line x1=\"";
		line1="\"   y1=\"50\" x2=\"";
		line2="\"   y2=\"350\"/>";
		for(int i=100;i<=300;i+=50)
		{
			fw.println(line+i+line1+i+line2);
		}
		
		String circle="<circle cx=\"";
		String circle1="\" cy=\"";
		String circle2="\"  r=\"2\" />";
		String circle3="\"  r=\"2\"";
				
		
		Scanner sc=new Scanner(System.in);
		int numberOfPoints=sc.nextInt();
		
		ArrayList listin= new ArrayList();
		ArrayList listout =new ArrayList();
		
		while(numberOfPoints>0)
		{
		
		
		Point checked = new Point();
		
		
		if(isInside(checked))
		{

			checked.xValue=(checked.xValue-12.5)*20+100;
			checked.yValue=(checked.yValue-3.5)*20+100;
			listin.add(checked);
		}
		else
		{
			checked.xValue=(checked.xValue-12.5)*20+100;
			checked.yValue=(checked.yValue-3.5)*20+100;
			listout.add(checked);
		}
			numberOfPoints--;
		
		}
		
		
		
		for(int i=0;i<listin.size();i++)
		{
			Point p= (Point)listin.get(i);
			fw.println(circle+p.xValue+circle1+p.yValue+circle3+" style=\"stroke:#000001; fill:#000001\"/>");
		}
		
		for(int i=0;i<listout.size();i++)
		{
			Point p= (Point)listout.get(i);
			fw.println(circle+p.xValue+circle1+p.yValue+circle3+" style=\"stroke:#505050; fill:#505050\"/>");
		}
		
		
		fw.println("</svg>"+"\n"+"</body>"+"\n"+"</html>");
		fw.close();
	System.out.println("Done");
	
	}
	
	
	

}
