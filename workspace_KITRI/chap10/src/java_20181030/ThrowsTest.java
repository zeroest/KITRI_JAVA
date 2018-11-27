package java_20181030;

class Test{
	void m1(int i) throws ArithmeticException {
		System.out.println(100/i);
	}
	void m2() {
			try {
				m1(0);
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
	}
	void m3() {
			try {
				m1(0);
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
	}
	
	void m4(int i) throws ClassNotFoundException {
		if(i==0) {
			//의도적 예외 발생
			//java.lang.ClassNotFoundException
			//Exception e = new ArithmeticException();
			throw new ClassNotFoundException("i가 0이면 수행 불가");
			
		}
		System.out.println(i);
	}
}

public class ThrowsTest {
	public static void main(String[] args) {
		
		Test t1 = new Test();
			t1.m2();
			t1.m3();
			//t1.m1(0);
			//자바에서 오라클 연결시 필요한 라이브러리 이름 : 설치
			try {
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				t1.m4(0);
			} catch (ClassNotFoundException e) {
				System.out.println(e.toString());
			}
			
			
			
			
	}
}
