package java_20181023;

public class ArrayTest2_Star2 {

	public static void main(String[] args) {
		
		String star[][] = new String[5][]; 
		//이차원 배열 내부를 반복문 내부에서 설정하자!!!!!-------------------
		
		System.out.println(star.length); // 5(이차원)
		//System.out.println(star[0].length); // (일차원)
		
		for(int i = 0 ; i<star.length ; i++) {
			star[i] = new String[i+1];
			//이차원 배열 내부를 반복문 내부에서 설정하자!!!!!---------------
			for(int j = 0; j<star[i].length ; j++) {
				
				star[i][j]= "*";
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
	}
}
