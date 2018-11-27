package java_20181024;

public class MethodTest {

	static double sum(int... val) {

		double result1 = 0;
		for (int i = 0; i < val.length; i++) {
			result1 += val[i];
		}
		return result1;
	}

	static double sum2(int[] val) {
		
		double result2 =0;
		for(int i = 0 ; i <val.length; i++) {
			result2 += val[i];
		
			
	}
		return result2;
}
}