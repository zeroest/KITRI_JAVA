package java_20181025;

class D{
	
	int add(int i, int j) {
		return i+j;
	}
	int add(int i, int j, int k) {
		return i+k+j;
	}
	
	double add(double i, double j) {
		return i+j;
	}
	
	String add(String i, String j) {
		return i+j;
	}
	
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		D d = new D();
		
		System.out.println(d.add(1, 2));
		System.out.println(d.add("java"," program"));
		System.out.println(d.add(1.1, 2.2));
	
	int first = Integer.parseInt("100");
	System.out.println(first);

	int second =  Integer.parseInt("a100",16);
	System.out.println(second);

	System.out.println(true);
	System.out.println(100);
	System.out.println(3.14);
	System.out.println("java");
	
	}
}
