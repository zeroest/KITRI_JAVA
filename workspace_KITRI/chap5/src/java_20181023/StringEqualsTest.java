package java_20181023;

public class StringEqualsTest {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		System.out.println("(s1,s2 주소)동등성비교 "+(s1 == s2));
		System.out.println("(s3,s4 주소)동등성비교 "+(s3 == s4));
		System.out.println("(s1,s2 문자열)동등성비교 "+(s1.equals(s2)));
		System.out.println("(s3,s4 문자열)동등성비교 "+(s3.equals(s4)));
		
		String s5 = null;
		System.out.println(s5);//null
		System.out.println(s5.equals(s4));//NullPointerException
		//null 데이터 연산, 메소드 :nullpointerexception;
	}
}
