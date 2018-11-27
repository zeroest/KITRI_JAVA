package chap5.java_20181023;

public class PrimeNumber2 {

	public static void main(String[] args) {

		System.out.println(args[0]);
		int n = Integer.parseInt(args[0]);
		int arr[];
		int ar_cnt = 0;

		for (int j = 2; j <= n; j++) {
			int pn_cnt = 0;
			for (int i = j; i > 0; i--) {
				if (j % i == 0) {

					pn_cnt += 1;
				}

			}
			//System.out.println(j + "의 cnt" + pn_cnt);

			if (pn_cnt == 2) {
				System.out.println(j + "은 소수 입니다.");

				ar_cnt += 1;

			} else {
				System.out.println(j + "은 소수가 아닙니다.");
			}

		}

		arr = new int[ar_cnt];

		int fix_cnt = 0;
		for (int j = 2; j <= n; j++) {
			int pn_cnt = 0;
			for (int i = j; i > 0; i--) {
				if (j % i == 0) {

					pn_cnt += 1;
				}

			}

			if (pn_cnt == 2) {

				arr[fix_cnt] = j;
				fix_cnt += 1;
			} else {

			}
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
