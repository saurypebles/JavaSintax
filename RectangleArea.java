import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int width = sc.nextInt();
		int height=sc.nextInt();
		sc.close();
		
		System.out.print("rectangle arrea: ");
		System.out.println(width*height);

	}

}
