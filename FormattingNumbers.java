import java.util.Scanner;
public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Scanner sc=new Scanner(System.in);
		 
		 	int intNumber;
		 	do
		 	{
		 		System.out.println("Integer number less than or equal to 500 and greater than  or equal to 0 ");
		 		intNumber =sc.nextInt();
		 	}
		 	while(intNumber<0||intNumber>500);
		 	
			double realNumberOne=sc.nextDouble();
			double realNumberTwo=sc.nextDouble();
			
			StringBuilder formated = new StringBuilder();
			int dif=10-Integer.toBinaryString(intNumber).length();
			for(int i=0;i<dif;i++)
			{formated.append('0');}
			formated.append(Integer.toBinaryString(intNumber));
			
		
		System.out.printf("|%-10S|", Integer.toHexString(intNumber));
		System.out.printf("%s", formated);
		System.out.printf("|%10.2f|", realNumberOne );
		System.out.printf("%-10.3f|", realNumberTwo);
		
		
		
		
	}

}
