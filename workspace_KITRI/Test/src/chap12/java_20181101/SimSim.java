package chap12.java_20181101;
//https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
public class SimSim {
	public static void main(String[] args) {
		
		int a = 'z';
		int b = 'a';
		
		String s = "a    B    z";
		int n = 100;
		int ncal = n%(a-b);
		String result = "";
		
		
		
		char[] arr = s.toCharArray();
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==32) {
				arr[i]=32;
				result+= arr[i];
			}else if(arr[i]+ncal>=a) {
				arr[i] = (char)(arr[i]-26);
				arr[i] +=ncal;
				result+= arr[i];
			}else {
			arr[i] +=ncal;
			result+= arr[i];
			}
		}
		
		System.out.println(result);
		
		
		
	}//main end
}//class end


