package chap2.java_20181019;
/*3. 평행사변형 면적을 구하라(실수결과값을 출력하라)
윗변 : 정수 = 10
아랫변 : 정수  =15
높이 : 정수 = 12*/
public class Lozenge {
	public static void main(String[] args) {
		int top = 2;
		int bottom = 3;
		int height = 5;
		double result;
		
		result = (top+bottom)*height/(double)2;
		System.out.println(result);
	}

}
