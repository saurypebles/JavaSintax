import java.util.Scanner;


public class SmallestOfTreeNumbers {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			double firstNumber = sc.nextDouble();
			double secondNumber = sc.nextDouble();
			double thirdNumber = sc.nextDouble();
			sc.close();
			
			double result= Math.min(thirdNumber, Math.min(firstNumber, secondNumber));
			
			System.out.print("smallest:");
			System.out.println(result);
	}

}
