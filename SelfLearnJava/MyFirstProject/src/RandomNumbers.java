/*
 * This Class will be useful in Gaming project ✔
 * NOTE: This is not true Random number, it pseudo random number 
 * pseudo : Pseudorandom number generator
 * Info: https://ar.wikipedia.org/wiki/%D9%85%D9%88%D9%84%D8%AF_%D8%A3%D8%B9%D8%AF%D8%A7%D8%AF_%D8%B4%D8%A8%D9%87_%D8%B9%D8%B4%D9%88%D8%A7%D8%A6%D9%8A%D8%A9
 */
import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt()+1;
		int limte = random.nextInt(10); //Limited a number between 0-6
		double doublee = random.nextDouble(5); //Limited
		boolean bolean = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(limte);
		System.out.println(doublee);
		System.out.println(bolean);
	}

}
