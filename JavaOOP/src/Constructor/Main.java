package Constructor;

public class Main {

	public static void main(String[] args) {
		Product p0 = new Product();
		Product p1 = new Product(1, "orange", "fruts", (float) 3.5 , 100, (float) 0.0 );
		Product p2 = new Product(2, "T-shirt", "male t-shirt", 40 , 30 , (float) 0.05, "red");
		System.out.println(p0.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		Product p3 = new Product(p1);
		System.out.println(p3.toString());
	}
	

}
