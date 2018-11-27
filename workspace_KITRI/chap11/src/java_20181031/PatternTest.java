package java_20181031;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {

		String email = "MYMAIL@Kitri11.co.kr";
		String reg = "\\w+@\\w*.(com|co.kr)";
		
		System.out.println(Pattern.matches(reg, email));
		
		String phonenum1 = "010-222-4444";
		String phonenum2 = "011-222-4444";
		String phonenum3 = "02-6556-6789";
		String phonenum4 = "010-6556-6789";
		//010 또는 02 시작 - 국번 숫자 3,4자리 - 숫자 4자리
		
		String[] num = {phonenum1,phonenum2,phonenum3,phonenum4};
		
		String regphone = "(010|02)-\\d{3,4}-[0-9]{4}";
		for(int i = 0 ; i<num.length ; i++) {
			
			System.out.println(Pattern.matches(regphone, num[i]));
		}
	}

	
}
