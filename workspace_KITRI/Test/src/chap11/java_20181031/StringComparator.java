package chap11.java_20181031;

class Compare {

	int compare(String a, String b, boolean isLength) {

		if (isLength) {
			if (a.length() > b.length()) {
				return a.length();
			} else
				return b.length();
		} else {
			if (cnt_a(a) > cnt_a(b)) {
				return a.length();
			} else
				return b.length();
		}

	}//compare end

	int cnt_a(String str) {

		char[] arr = str.toCharArray();
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				cnt++;
			}
		}
		//System.out.println(cnt);
		return cnt;
	}//cnt_a end
	
}//Compare end

public class StringComparator {

	public static void main(String[] args) {

		Compare comp = new Compare();
		System.out.println(
				comp.compare("javaprogram", "oracle", true));
		System.out.println(
				comp.compare("javaprogram", "oracledatabase", false));

	}

}//main end
