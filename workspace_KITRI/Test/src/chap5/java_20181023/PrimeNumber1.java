package chap5.java_20181023;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		int n = Integer.parseInt(args[0]) ;
		
		int cnt = 0;
		
		for(int i = n ; i>0; i--) {
			if(n%i==0) {
				cnt +=1;
			}
			
		}
		System.out.println(cnt);
		
		if(cnt ==2) {
			System.out.println(n+"은 소수 입니다.");
		}else {
			System.out.println(n+"은 소수가 아닙니다.");
		}
		
		
		
	}
}

