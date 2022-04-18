package Circle;

public class Main {

	public static void main(String[] args) {
		CircleClass c1 = new CircleClass(), c2 = new CircleClass();
		c1.setColor("Black");
		c1.setRadius(3.0);
		System.out.println(c1.getArea());
		
		
		c2.setRadius(2.0);
		c2.setColor("Blue");
		System.out.println(c2.getCrircumference());
		
		System.out.println("C1 info: " + c1.toString());
		System.out.println("C2 info: " + c2.toString());
		
	}

	

}
