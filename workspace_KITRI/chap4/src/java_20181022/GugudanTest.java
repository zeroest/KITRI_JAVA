package java_20181022;

public class GugudanTest {
	public static void main(String[] args) {
		
		/*System.out.println("===구구단 for문===");
		String result = "";
		int data = 1;
		for(int i =2 ; i<10 ; i++){
			for(int j = 1 ; j <10 ; j++){
				data = i*j;
				result = i+"*"+j+" = "+data;
				System.out.println(result);
			}
		}*/
		
		
		/*String result = "";
		int data = 1;
		for(int i =1 ; i<10 ; i++){
			for(int j = 2 ; j <10 ; j++){
				data = j*i;
				result = j+"*"+i+" = "+data+" \t";
				System.out.print(result);
			}
			System.out.println();
		}*/
		
		
		
		
		/*String result = "";
		int data = 1;
			for(int j = 1 ; j <10 ; j++){
			//if(j%2==1)
			data = 2*j;
			result = 2+"*"+j+" = "+data;
			System.out.println(result);
			}
		*/
		
		/*System.out.println("===구구단 while문===");
		int i = 2;
		int j = 1;
		int gugu = 0;
		String re1 ="";
		while(i<10){
			j=1;
			System.out.println(i+"단!!!");
			while(j<10){
				gugu = i*j;
				re1 = i+"*"+j+"="+gugu;
				System.out.println(re1);
				j+=1;
			}
			i+=1;
		}*/
		
		
		String result = "";
		int data = 1;
		for(int i =1 ; i<10 ; i++){
			for(int j = 2 ; j <10 ; j++){
				//if (j == 4) continue; // 4단 제외 수행
				if (j==6) break; //6단부터 정지
				data = j*i;
				result = j+"*"+i+" = "+data+" \t";
				System.out.print(result);
			}
			System.out.println();
		}
		
		
		int i =1;
		int sum = 0;
		while(true){
			sum +=i;
			i++;
			if(sum >=30) break;
		}
		System.out.println("int i = "+i+" , sum = "+sum);
		
		
	}
}


