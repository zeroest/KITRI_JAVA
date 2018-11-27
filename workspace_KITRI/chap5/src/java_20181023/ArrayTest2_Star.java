package java_20181023;

public class ArrayTest2_Star {

	public static void main(String[] args) {
		//5줄 3개 별 출력 : 이차원 배열 이용
		/*
		***
		***
		***
		***
		***
		*/
		
		String star[][] = new String[5][3];
		System.out.println(star.length); // 5(이차원)
		System.out.println(star[1].length); // 3(일차원)
		
		//정수배열 : 0 실수배열 : 0.0 boolean배열 : false
		//참조타입변수 : null
		
		for(int i = 0 ; i<star.length ; i++) {
			
			/*System.out.println(star[0]);
			//String 배열 : [Ljava.lang.String;@15db9742
			System.out.println(star[0][0]);	//null
*/			
			for(int j = 0; j<star[i].length ; j++) {
				
				star[i][j]= "*";
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
