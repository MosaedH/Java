package StaticVarible;

public class Student {
	int no;
	static int count = 1;
	String name;
	static String college = "IT";
	
	Student(String name){
		this.no = count;
		this.name = name;
		count++;
	}

	
	public String toString() {
		return "Student [no=" + no + ", count=" + count + ", name=" + name + "]";
	}
	
	
}
