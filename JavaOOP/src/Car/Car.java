package Car;

public class Car {
	
	private String name;
	private int maxSpeed;
	private float price;
	private int model;
	
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setModel(int m) {
		if (m >= 2015)
			model = m;
		else
			System.out.println("Your car is to old");
	}
	
	public int getModel() {
		return model;
	}
}
