package java_20181023;

public class ArrayCopyTest {

	public static void main(String[] args) {

		int origin[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < origin.length; i++) {
			System.out.println(origin[i]);

		}
		System.out.println("=====================");

		/*
		 * origin = new int[10]; for(int i = 0 ; i<origin.length ; i++) {
		 * 
		 * if(i>=5) { origin[i] = (int)(Math.random()*100)+1; }
		 * System.out.println(origin[i]); }
		 */

		int newar[] = new int[10];
		System.arraycopy(origin, 1, newar, 2, origin.length);

		for (int i = 0; i < newar.length; i++) {
			System.out.println(newar[i]);
		}

	}
}
