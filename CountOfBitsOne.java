import java.io.IOException;
import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
			
			System.out.println(Integer.bitCount(number));
			
	}

}
