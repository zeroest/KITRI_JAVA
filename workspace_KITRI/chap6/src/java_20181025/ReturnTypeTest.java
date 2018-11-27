package java_20181025;

class A {

	int m1() {
		int i = 10;
		return i * i;
	}

	String m2() {
		return "java";
	}

	void m3() {
		int i = 20;
		System.out.println(i * i);
	}
	
	void m4() {
		System.out.println("---------------------------------");
		int i = 10;
		if(i>=10) {
			System.out.println(i*i);
		}else {
			return;
		}
		System.out.println("m4 메소드 완료");
	}
	
	int m5(int i) {//매개변수
		int j = 10;//지역변수
		return i*i;
	}
	
	/*static int[] m5() {
		int j[] = {1,0,3,0,5,0,7,0,9,0};
		return j;
	}*/
	
}

public class ReturnTypeTest {

	public static void main(String[] args) {

		A a = new A();

		System.out.println(a.m1());
		System.out.println(a.m2());
		a.m3();
		a.m4();
		System.out.println(a.m5(5));
		
		/*int[] r11 = A.m5();
		for(int i = 0 ; i<r11.length ; i++) {
			System.out.println(r11[i]);
		}*/

	}
}