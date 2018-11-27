package java_20181018;

public class VariableTest {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10> 5;
		
		System.out.printf("%b : %b : %b \n",b1,b2,b3);
		
		char c1 ='a';
		char c2 = '가';
		char c3 = '\n';
		System.out.printf("%c : %c : %c",c1,c2,c3);
		
		String s1 = "hello, world!";
		String s2 = "자바";
		
		System.out.printf("여기s1%s 여기s2%s\n",s1,s2);

		if(1000< Byte.MAX_VALUE) {
			System.out.println("출력가능");
		}else {
			System.out.println("출력불가");
		}
		byte by1 = 100;
		short by2 = 1000;
		byte by3 = 2;
		System.out.printf("%d : %d : %d\n", by1, by2, by3);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		if(1000< Byte.MAX_VALUE)
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}

}
