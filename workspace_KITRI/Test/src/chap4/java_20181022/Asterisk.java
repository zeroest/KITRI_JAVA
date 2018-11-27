package chap4.java_20181022;

/*5
*
**
***
****
******/
public class Asterisk {

	public static void main(String[] args) {

		int ran = (int) (Math.random() * 10) + 1;

		System.out.print(ran);
		System.out.println();

		int i = 1;
		int j = 0;

		for (i = 1; i <= ran; i++) { //줄 반복
			
			for (j = 0; j != j; j++) { //각줄 번호만큼(=i변수만큼) 별 출력
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
