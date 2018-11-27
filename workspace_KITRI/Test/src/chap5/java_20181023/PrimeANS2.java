package chap5.java_20181023;

public class PrimeANS2 {

	public static void main(String[] args) {
		// 입력변수1개 필요. 정수 변경 가능
		int n = Integer.parseInt(args[0]);
		int cnt = 0; // 나머지 0인 경우 갯수 저장
		int prime[] = new int[n]; // 소수 저장 배열
		int index = 0;

		if (n > 0) {
			for(int k =2; k<=n; k++) {
				cnt=0;
				for (int i = 1; i <= k; i++) {
					if (k % i == 0)
						cnt++;
				}
				if (cnt == 2) {
					prime[index++] = k; // 새로운 부분 !!!!!!!!!!!!!!!!!!!!	
				}
			}

	}
		
	//출력
		for(int i = 0; i<index ; i++) {
			System.out.println(prime[i]);
		}
}
}