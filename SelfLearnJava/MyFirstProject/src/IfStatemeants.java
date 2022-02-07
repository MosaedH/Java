import java.util.Scanner;
public class IfStatemeants {
	
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you? ");
		int adult = scanner.nextInt();
		
		if(adult>=75) {
			System.out.print("Ok Boomer!");
		}else if(adult>=18) {
			System.out.print("You are adult, Welcome");
		}else {
			System.out.print("You are not Adult!!, What you want here, get out from here now!!");
		}
			
	
	}
	
}
