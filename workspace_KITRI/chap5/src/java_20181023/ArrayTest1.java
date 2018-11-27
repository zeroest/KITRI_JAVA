package java_20181023;

public class ArrayTest1 {
	
	public static void main(String[] args) {
		
		//12명 db점수 저장 : 12개 변수 : 정수 배열
		
		/*int scores[] ;
		if(인원 >10) {
			scores =new int[12];
		}else
			scores = new int[5];*/
		
		int scores[] = new int [12];
		
		//int scores [] = {94,23,53,46,76,87,17,26,95,37,75,12};
		
		/*for(int i =0 ; i <scores.length ; i++) {
		System.out.println(i+"번 index "+scores[i]);
		}*/
		
		
		//(Math.random()*100)+1 난수 발생 배열 저장 = 배열 초기화
		int sum = 0;
		for(int j =0 ; j <scores.length ; j++) {
			scores[j] = (int)(Math.random()*100)+1;
			System.out.println(j+"번 index "+scores[j]);
			sum += scores[j];
		}
		
		System.out.println("총점 = "+sum);
		System.out.println("점수 총 갯수  = " +scores.length);
		System.out.println("평균 = "+(sum/scores.length));
		
		int max = 0;
		
		for(int i =0 ; i< scores.length ; i++) {
			//System.out.println(max + " , "+scores[i]);
			if(max < scores[i]) {
				max = scores[i];
				//System.out.println(max);
			}
		}
		System.out.println("최대값 = "+max);
		
		
		int min = 100; //초기화값 0 주면 0이제일 작기때문에 그냥 0값이 나온다.
				
				for(int i =0 ; i< scores.length ; i++) {
					//System.out.println(max + " , "+scores[i]);
					if(min > scores[i]) {
						min = scores[i];
						//System.out.println(max);
					}
				}
				System.out.println("최소값 = "+min);
		
				
				
				
				
				for(int i =0 ; i< scores.length ; i++) {
					//System.out.println(max + " , "+scores[i]);
					if(scores[0] > scores[i]) {
						scores[0] = scores[i];
						//System.out.println(max);
					}
				}
				System.out.println("최소값 = "+scores[0]);
	}
}
