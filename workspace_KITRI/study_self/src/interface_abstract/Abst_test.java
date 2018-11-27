package interface_abstract;

public class Abst_test {

	public static void main(String[] args) {
		//A insa = new A();
		
		//insa.b();
		
		A.b();

		B insb = new B();
		insb.setOprands(10,20,30);
		B.b();
		insb.sum();
		insb.avg();
	}
	
}


abstract class A{
	
	int first;
	int second;
	int third;
	
	abstract void setOprands(int first, int second, int third);
	abstract void sum();
	abstract void avg();
	static void b() {
		System.out.println("일반 메소드 b()");
	}
	
}

class B extends A{
	
	void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
		System.out.println("숫자입력완료");
	}
	void sum() {
		System.out.println(first+second+third);
	}
	void avg() {
		System.out.println((first+second+third)/3);
	}
}
