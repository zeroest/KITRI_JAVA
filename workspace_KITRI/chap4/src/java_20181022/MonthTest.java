package java_20181022;

public class MonthTest {
	//1-12 사이 정수 난수
	
	//switch - case 이용
	//1월은 31일 까지 있습니다.
	//2월은 28일 까지 이씃ㅂ니다.
	//4월은 
	//1,3,5,7,8,10,12 : 31
	//4,6,9,11 : 30
	//2 :28
	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
	
		
		System.out.println(month);
		
		switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println(month+"월은 31일까지 있습니다.");
				break;
				
			case 2 :
				System.out.println("2월은 28일까지 있습니다.");
				break;
			
			/*case 4 :
			case 6 :
			case 9 :
			case 11 :*/
			default :
				System.out.println(month+"월은 30일까지 있습니다.");
				break;
		}
		
		
		
		
	}
}
