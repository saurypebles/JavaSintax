import  java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		int decimalNumber =sc.nextInt();
		sc.close();
		
		System.out.println(Integer.toHexString(decimalNumber).toUpperCase());
	}

}
