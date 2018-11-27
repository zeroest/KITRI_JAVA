package java_20181029;

class Parent{
	int su = 10;
	void print() {
		System.out.println(su);
	}
	 void mp() {
		 System.out.println("Parent");
	 }
}

class Child extends Parent{
	int su = 20;
	void print() {
		System.out.println(su);
	}
	void mc() {
		System.out.println("Child");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.print();
		p1.mp();
		//p1.mc(); //메모리 생성x
		
		System.out.println(p1 instanceof Child);
		if(p1 instanceof Child) {
			Child c22 = (Child) p1;
			c22.mc(); // => 컴파일 타임에 오류가 없으나 런타임 에러
		}
			
		System.out.println("===========");
		Child c1 = new Child();
		System.out.println(c1.su);
		c1.print();
		c1.mp();
		c1.mc();
		
		System.out.println("===========");

		Parent p2 = new Child();
		System.out.println(p2.su);
		p2.print();
		p2.mp();
		//p2.mc(); // 메모리 child 저장
		System.out.println("===========");

		Child c2 = (Child)p2;
		System.out.println(c2.su);
		c2.print();
		c2.mp();
		c2.mc();
		
		System.out.println(p2 instanceof Child);
		if(p2 instanceof Child) {
			System.out.println("p2는 Child 객체입니다");
			((Child)p2).mc();//임시적 하위객체 메소드 호출
		}
		
		
		
		Parent[] list = new Parent[2];
		list[0] = new Parent();
		list[1] = new Child();
		
		
		
		
	}
	
}
