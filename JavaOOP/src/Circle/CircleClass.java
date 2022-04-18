package Circle;

public class CircleClass {

	private double radius;
	private String color;
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getCrircumference() {
		return Math.PI * 2 * radius;
	}
	@Override
	public String toString() {
		return "CircleClass [radius=" + radius + ", color=" + color + ", Area=" + getArea()
				+ ", Crircumference=" + getCrircumference() + "]";
	}
	
	

	
}
