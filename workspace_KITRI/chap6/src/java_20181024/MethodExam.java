package java_20181024;

public class MethodExam {

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		System.out.println(mt.sum(1,2,3));
		System.out.println(mt.sum2(new int[] {1,2,3}));
		
		System.out.println(MethodTest.sum(1,2));
		System.out.println(MethodTest.sum2(new int[] {1,2}));
	}
}
