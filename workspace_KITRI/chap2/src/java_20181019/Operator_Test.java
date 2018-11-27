package java_20181019;

public class Operator_Test {

	public static void main(String[] args) {
		int first = 100;
		int second = 200;
		System.out.println("first=" + first + "second=" + second);

		int result1 = first++;
		int result2 = --second;
		System.out.println("first=" + first + "second=" + second + " , result1=" + result1 + " , result2=" + result2);

		int third = 6;
		// third 가 5의 배수이면 : true/false
		boolean five = third % 5 == 0;
		System.out.println("5의 배수여부  = " + five);

		// third 변수가 3의 배수이면서 4의 배수가 아니어야함
		boolean tf = third % 3 == 0 && third % 4 != 0;
		System.out.println("3배수중 4의 배수 아닌지 여부 = " + tf);

		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;
		System.out.println("a" + a + "," + "b" + b);

		int x = 15;
		String result = x > 10 ? "크다" : "작다";
		System.out.println(result);
		int res = x >= 10 && x < 50 ? (int) 1.1 : 0;
		System.out.println(res);

		// 95 값이 4의 배수이면서 7의 배수 인지 판단 4-7의 배수만족:
		// 만족하지 않으면 : 배수 아닙니다.

		int val = 95;

		String fse = val % 4 == 0 && val % 7 == 0 ? "4-7의 배수만족" : "배수 아닙니다";
		System.out.println(fse);
		
		System.out.println(val +=2);

	}

}
