package recursionAndRecursive;

public class recursionAndRecursive {
	
	static int count = 0;
	//First
	static void fun() {
		count++;  //Base case is count < 5
		if (count < 5) {
			System.out.println("Hi");
			fun();
		}
		
	}
	
	// Sacaned
	static void funn() {
		//Base case is count == 5
		if (count == 5) {
			return;
		}
		count++;
		System.out.println("Hi");
		funn();
	}
	
	static int fact(int n) {
		if (n == 1 || n == 0) // base case
			return n;
		else
			return n * fact(n - 1);
		
		
	}
	
	static void sad(int n) {
		if (n < 1)
			return;
		else
			sad(n - 1);
			System.out.println("# " + n);
	}
	
	
	public static void main(String[] args) {
//		fun();
//		funn();
		
//		System.out.println(fact(10));
		
		sad(10);
	}

}
