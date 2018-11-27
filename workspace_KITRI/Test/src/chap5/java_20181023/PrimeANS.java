package chap5.java_20181023;

public class PrimeANS {

	public static void main(String[] args) {
		// 입력변수1개 필요. 정수 변경 가능
		int n = Integer.parseInt(args[0]);
		int cnt = 0; // 나머지 0인 경우 갯수 저장

	/*	if (n > 0) {
			// n: 1~n 나눈 나머지 0인 경우 2개이면 소수
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) cnt++;
			}
			if (cnt == 2)
				System.out.println(cnt+":"+n + " : 소수이다");
			else
				System.out.println(cnt+":"+n + " : 소수 아니다");
		}
		*/
		
		// 입력변수1개 필요. 정수 변경 가능
				

				if (n > 0) {
					// n: 1~n 나눈 나머지 0인 경우 2개이면 소수
					for (int i = 2; i < n; i+=2) {//짝수는 애초에 걸러준다
						if (n % i == 0) cnt++;
					}
					if (cnt == 0)
						System.out.println(cnt+":"+n + " : 소수이다");
					else
						System.out.println(cnt+":"+n + " : 소수 아니다");
				}
		
		
				
		
		
	}
}
