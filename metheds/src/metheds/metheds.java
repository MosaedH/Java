package metheds;
import java.util.Scanner;

public class metheds {
	
	public static int max(int n1, int n2, int n3) {
		
		int maxNumber=n1;
		if (maxNumber < n2)
			maxNumber = n2;
		if (maxNumber < n3)
			maxNumber = n3;
		
		return maxNumber;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter 3 values: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		System.out.println(max(x,y,z));
		

	}

}
