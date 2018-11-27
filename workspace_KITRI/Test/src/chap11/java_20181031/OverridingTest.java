package chap11.java_20181031;

public class OverridingTest {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);

		System.out.println(ms1);// 30
		System.out.println(ms2);// 30

		if (ms1.equals(ms2))// true
			System.out.println("ms1과 ms2의 합계는 동일합니다.");

	}

}

class MySum {
	
	int first;
	int second;

	String sum;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
		sum = String.valueOf(first + second);
	}

	public String toString() {
		return sum;
	}

	public boolean equals(Object obj) {
		if (obj instanceof MySum) {
			MySum other = (MySum) obj;
			return sum.equals(other.sum);
		} else
			return false;
	}

}