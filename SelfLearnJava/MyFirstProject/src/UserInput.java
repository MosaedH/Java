import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); // To make code work  you need to put this	
		System.out.print("Where you from? ");
		String from = scanner.nextLine();
		System.out.println("--------- infromation about you ---------");
		System.out.print(" Hi "+name+" \n You are "+age+" years old"+"\n You are from "+from);
	}

}
