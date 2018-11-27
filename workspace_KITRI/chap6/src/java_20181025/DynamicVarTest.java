package java_20181025;

class B {
	int sum(int... i) {
		int result = 0;

		for (int k = 0; k < i.length; k++) {
			result += i[k];
		}
		return result;
	}

	void sum2(int[] var) {
		int result = 0;
		for (int i = 0; i < var.length; i++) {
			result += var[i];
		}
		System.out.println(result);
	}
}

class C{
	void m1() {
		System.out.println("m1실행합니다.");
	}

	void m2() {
		//m1메소드 실행 결과 필요
		m1();
		System.out.println("m2실행합니다.");
	}


}

public class DynamicVarTest {

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.sum('d', 1, 2, 3));
		b.sum2(new int[] { 100, 200, 300, 'd' });
		
		C c = new C();
		c.m2();
	}
}
