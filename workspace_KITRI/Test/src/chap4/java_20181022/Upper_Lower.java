package chap4.java_20181022;

public class Upper_Lower {

	public static void main(String[] args) {
		
		/*System.out.println((int)'A'); //65
		System.out.println((int)'Z'); //90

		System.out.println((int)'a'); //97
		System.out.println((int)'z'); //122
*/		
		/*난수 발생시(1-200 범위)
		무한반복
		65-90사이면 (대문자이면)
		난수 : 65 : 'A'를 'a'로 변경합니다.
		난수 : 66 : 'B'를 'b'로 변경합니다.
		97-122사이면 (소문자이면)
		난수 : 97 : 'a'를 'A'로 변경합니다.
		난수 : 98 : 'b'를 'B'로 변경합니다.
		범위차이 32
		난수 1-50 이거나 150-200사이 발생시 종료*/
		
		
		
		
		
		while(true){
			//1.난수 발생시(1-200 범위)
			int ran = (int)(Math.random()*200)+1;
			System.out.println(ran);
			
			//2.65-90사이면 (대문자이면)
			//예)   65 라면 : 'A'를 'a'로 변경합니다 출력
			if(ran >=65 && ran <=90){
				char c1 = (char)ran; //대문자
				char c2 = (char)(ran+32); //소문자
				System.out.println(c1+"를 "+c2+"로 변경합니다.");
			
			//3.97-122사이면 (소문자이면)
			//예)  97 이라면 : 'a'를 'A'로 변경합니다 출력
			
			}else if(ran>=97 && ran<=122) {
					char c1 = (char)ran;
					char c2 = (char)(ran-32);
					System.out.println(c1+"를 "+c2+"로 변경합니다.");
			
			//4. 1-50 이거나 150-200 사이면 종료
			
			}else if((ran>=1 && ran<=50) ||
			(ran>=150 && ran<=200))	break;
		}
}
}


