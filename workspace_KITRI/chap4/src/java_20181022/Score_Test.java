package java_20181022;

public class Score_Test {
	public static void main(String[] args) {
		//이학생 80, 99, 23
		
		String name = "이학생";
		
		int kor = 80;
		int mat = 99;
		int eng = 43;
		
		//총점 ,평점
		int total = kor+mat+eng;
		double avg = total/(double)3;
		
		System.out.println("이름="+name);
		System.out.println("국어="+kor);
		System.out.println("수학="+mat);
		System.out.println("영어+"+eng);
		System.out.println("총점="+total);
		System.out.printf("실수평균=%.2f\n",avg);
		System.out.println("정수평균="+(int)avg);
		
		String result = (int)avg>=80? "\n수료":"\n미수료";
		System.out.println(result+"\n");
		
		
/*		수료여부출력: 정수 평균 80이상
		1. 수료 2. 정수평균+10*/
		if((int)avg>= 80) {
			System.out.println("수료");
			avg +=10;
			System.out.println((int)avg);
		}else {
//			80미만 1. 미수료:재시 2. 정수평균 -10
			System.out.println("미수료:재시");
			avg-=10;
			System.out.println((int)avg);
		}
		
		
		
	}
}
