package java_20181025;

class Sample {
	int a = 10;
}

class Test {

	void add1(int i) {
		System.out.println("add1메소드 = " + i++);
	}

	void add2(Sample s) {
		System.out.println("add2메소드= " + s.a++);

	}
}

public class CallByValueTest {

	public static void main(String[] args) {

		Test t = new Test();

		// 기본형변수 전달
		/*
		 * int j = 10; t.add1(j); System.out.println("add1호출 후의 j= "+j);
		 */

		Sample sam = new Sample();
		t.add2(sam);
		System.out.println("add2호출 후의 sam.a= " + sam.a);
		t.add2(sam);

		Sample sa = sam;

		System.out.println(sa.a);

	}
}
