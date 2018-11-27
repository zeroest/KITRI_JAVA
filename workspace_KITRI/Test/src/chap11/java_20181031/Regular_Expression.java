package chap11.java_20181031;

import java.util.StringTokenizer;

public class Regular_Expression {
	
	public static void main(String[] args) {
		
		String url = "http://www.kitri.re.kr:8080/java/test";
		String[] arr1 = url.split("[.:/]");
		//   . =>모든 문자를 의미하는 정규표현식 의미
		
		for(int i = 0; i < arr1.length; i++) {
			 if(!arr1[i].equals("http")
				&& !arr1[i].equals("")	 )
			 System.out.println(arr1[i]);
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String cut = url.substring(7, url.length());
		
		String[] arr2 = cut.split("[.:/]");
		
		for(int i = 0 ; i<arr.length; i++) {
			//System.out.println(arr[i]);
		}
		
		StringTokenizer st = new StringTokenizer(cut, ".:/");
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		
		
		StringBuffer sb = new StringBuffer(cut);
		System.out.println(sb.length());
		System.out.println(sb.toString());
		System.out.println(sb.append("추가글"));
		System.out.println(sb.reverse());
		System.out.println(cut);
		System.out.println(sb.reverse());*/
	}//main end

}//class end
