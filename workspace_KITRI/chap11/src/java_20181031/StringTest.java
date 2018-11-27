package java_20181031;

public class StringTest {
	public static void main(String[] args) {
		
		String s1 = "java"; //new 키워드 없이 객체 생성 가능;
		String s2 = new String("java");
		
		byte[] b = {65,66,67,68}; // -128~127 정수 배열
				//	A  B  C  D
		String s3 = new String(b); // "ABCD"
		System.out.println(s3);
		
		char c[] = {'a','b','c','d'};
		String s4 = new String(c);
		System.out.println(s4);
		
		String s5 = new String(b, 0, 2); //"AB"
		System.out.println(s5);
		
		//String s6 = new String("자바".getBytes("8859_1"),"utf-8");
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.equals(s4.toUpperCase()));
		
		//s4, s5 문자열 갯수 큰 변수 문자열 출력
		if(s4.length() >= s5.length()){
			System.out.println(s4);
		}else System.out.println(s5);
		System.out.println(s1.substring(1)); //1 "ava"
		System.out.println(s1.substring(1,3)); //1,2 "av"
		
		System.out.println(s1.charAt(0)); //"j"
		System.out.println(s1.charAt(s1.length()-1)); // "a"
		
		System.out.println("servletjspspringandroid".indexOf('e')); // 1
		System.out.println("servletjsp".replace("jsp", "spring")); // servletspring
		
		System.out.println("--"+"   servlet jsp   ".trim()+"--"); 
		System.out.println(String.valueOf(100)+100); // 정수를 스트링으로
	}
}
