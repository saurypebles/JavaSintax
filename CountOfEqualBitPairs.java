import java.util.Scanner;
public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		String binaryint =Integer.toBinaryString(number);
		int count=0;
		for(int i=0;i<binaryint.length()-1;i++)
		{if (binaryint.charAt(i)==binaryint.charAt(i+1))
			{count++;}	
		}
		System.out.println(count);
		
	}

}
