import java.util.Scanner;
import java.util.Random;

public class Switches {
	
	
	public static void main(String[] args) {
//		switch = Statement that allows a variable to be tested for equality against a list to values
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter a The First Tow Leater Of Day To See Your Luck Rate");
		System.out.println("Ex:\"Fr\" For Friday");
		System.out.println("0 Means You Are Not Luky To Day");
		System.out.println("10 Means You Are The Luckiest");
		System.out.print("Enter: ");
		String day = scanner.nextLine();
		
		int	LukyRate = random.nextInt(10);
		
		switch(day) {
			case "Su": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
			case "Mo": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
			case "Tu": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
			case "We": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
			case "Th": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
			case "Fr": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
			case "Sa": System.out.println("Your Luky Rate Today Is: "+LukyRate); 
			break;
		}
	}
}
