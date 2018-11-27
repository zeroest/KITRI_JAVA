package java_20181026;

class A extends Object{
	double d1;
	
	//A(){}
	A(double d){
		//super();
		System.out.println("A생성자 호출");
		d1 = 10*10;
		//a=1.0;
		System.out.println(d);
	}
}

class B extends A{
	B(double d) {
		super(d);
		System.out.println("B생성자 호출");
	}
	
	double d2;
	/*B() {
		super(3.14); //A()생성자호출 => A(double) 생성자호출 변경
		System.out.println("B생성자 호출");
		d2 = 10*10*10;
		//System.out.println(a);
	}*/
}

public class SuperTest {
	public static void main(String[] args) {

		A a1 = new A(3.14);
		System.out.println(a1.d1);
		//System.out.println(a1.d2);

		B b1 = new B(1.1);//Object,A,B
		System.out.println(b1.d1);
		System.out.println(b1.d2);
		
	}
}
