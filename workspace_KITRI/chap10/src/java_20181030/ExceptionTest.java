package java_20181030;

class A{}
class B extends A{}
class C extends A{}

public class ExceptionTest {
	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();
		if(a2 instanceof B) {
			B b2 = (B)a2;
		}
		B b1 = (B)a1;
		
		
	//1. 입력변수 2개 이상, 2. 10진정수 변경 가능값, 3. 0이 아닌값
		int i = 0;
		int j = 0;
		
		try {
			i=Integer.parseInt(args[0]);
			j=Integer.parseInt(args[1]);
			System.out.println(i/j);
		} catch (NumberFormatException e) {
			System.out.println("숫자 제대로 안넣을래");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("매개변수 제대로 넣어라");
		} catch (ArithmeticException e2) {
			j = 1;
			System.out.println(i/j);
			System.out.println("0으로 나누지 마라");
		} catch (Exception e3) {
			e3.printStackTrace(); //예외발생원인 추적 출력
		} finally {
			System.out.println("항상출력됩니다.");
		}
		
		System.out.println("메인완료");
		
	}
}
