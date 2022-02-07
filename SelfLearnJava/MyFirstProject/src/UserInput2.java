import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// You are ready to use Scanner
		
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Where are you from? ");
		String from = scanner.nextLine();
		System.out.println("---------- Info about you ----------");
		System.out.println("\tHi "+name+"\n\tYou are"+age+"years old"+"\n\tYou are from"+from);
	}

}
