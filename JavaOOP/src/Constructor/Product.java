package Constructor;

public class Product {
	private int nubmer;
	private String name;
	private String description;
	private float price;
	private int quantity;
	private float discount;
	private String color;

	public Product() {
		this.nubmer = 0;
		this.name = "No Name";
		this.description = "No description";
		this.price = 0.0f;
		this.quantity = 0;
		this.discount = 0.0f;
		this.color = "No color";
		
	}
	
	public Product(Product obj) {
		this.nubmer = obj.nubmer;
		this.name = obj.name;
		this.description = obj.description;
		this.price = obj.price;
		this.quantity = obj.quantity;
		this.discount = obj.discount;
		this.color = obj.color;
	}
	

	
	public Product(int num, String n, String d, float p, int q, float dis) {
		this.nubmer = num;
		this.name = n;
		this.description = d;
		this.price = p;
		this.quantity = q;
		this.discount = dis;
	}
	public Product(int num, String n, String d, float p, int q, float dis, String c) {
		this (num,n,d,p,q,dis);
		this.color = c;
	}

	public String toString() {
		return "Product [nubmer=" + nubmer + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + ", discount=" + discount + ", color=" + color + "]";
	}
	
	
}
