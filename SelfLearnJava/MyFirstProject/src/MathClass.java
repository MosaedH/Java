import java.util.Scanner; //for hypotenuse
public class MathClass {

	public static void main(String[] args) {
		/*
		double x = 3.50;
		double y = -10.30;
		
		double z = Math.max(x, y); // The larger is x it's value equal to 3.14
		double v = Math.min(x, y); // The smallest is y it's value equal to -10
		double b = Math.abs(y); // return a value with out negative value "-"
		double r = Math.round(x); // The default rounding mouthed
		double rup = Math.ceil(y); // This mouthed will always rounding up
		double rdown = Math.floor(x); // This mouthed will always rounding down
		
		System.out.println(z);
		System.out.println(v);
		System.out.println(b);
		System.out.println(r);
		System.out.println(rup);
		System.out.println(rdown);
		*/
		
		// Project that will find hypotenuse of triengal
		
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		// The calculations
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: "+z);

		scanner.close(); // Important
	}

}
