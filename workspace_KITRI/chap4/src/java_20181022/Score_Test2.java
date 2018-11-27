package java_20181022;

public class Score_Test2 {
	public static void main(String[] args) {
		//이학생 80, 99, 23
		
		String name = "이학생";
	
		
		int kor = (int)(Math.random()*100)+1;
		int mat = (int)(Math.random()*100)+1;
		int eng = (int)(Math.random()*100)+1;
		
		
		//총점 ,평점
		int total = kor+mat+eng;
		double avg = total/(double)3;
		int intavg = total/3;
		
		System.out.println("이름="+name);
		System.out.println("국어="+kor);
		System.out.println("수학="+mat);
		System.out.println("영어+"+eng);
		System.out.println("총점="+total);
		System.out.printf("실수평균=%.2f\n",avg);
		System.out.println("정수평균="+(int)avg);
		
		/*정수평균 : 90점 이상 : A등급 출력
				80점 이상 : B
				70점 이상 : C
				나머지 : 낙제*/
		
		if(intavg>=90) {
			System.out.println("A등급"); // A+, A ,A-
			/*if(intavg>=97) {
				System.out.println("A+");
			}else if(intavg>=95) {
				System.out.println("A");
			}else {
				System.out.println("A-");
			}*/
		}else if(intavg>=80) {
			System.out.println("B등급");
		}else if(intavg>=70) {
			System.out.println("C등급");
		}else {
			System.out.println("F등급");
		}
		
		
		/*String grade ;
		if(intavg>=90) {
			grade = "A등급";
		}else if(intavg>=80) {
			grade = "B등급";
		}else if(intavg>=70) {
			grade = "C등급";
		}else {
			grade = "F등급";
		}
		System.out.println(grade);*/
		
		int intavg2 = intavg/10; 
		System.out.println("intavg2"+intavg2);
		String grade;
		switch(intavg2) {
		case 10 :  
			grade = "A등급";
			break;
		case 9 :
			grade = "A등급";
			break;
		case 8 :
			grade = "B등급";
			break;
		case 7 :
			grade = "C등급";
			break;
		default :
			grade = "F등급";
			break;
		}
		System.out.println(grade);
		
		
		int a = -5;
		int b = 10;
		//a,b 모두 양수인 경우에만 덧셈
		//a+b 결과 10 이상이면 성공 / 실패
		
		if(a>0 && b>0) {
			int c = a+ b;
			if(c >=10) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		}else {
			System.out.println("음수가 있습니다.");
		}
		
		
		/*//-로또번호 6개 생성 : 1-45
		(Math.random()*45) // 0.0 <= ? < 45
		(Math.random()*45)+1 // 1<= ? <46
		
		//정수난수생성
		(int)(Math.random()* 범위(최대값-시작값+1))+시작값*/
		
		
		
		
		int te = (int)(Math.random()*91)+10;
		//10<te<101
		System.out.println(te);
		
		
		
	}
}
