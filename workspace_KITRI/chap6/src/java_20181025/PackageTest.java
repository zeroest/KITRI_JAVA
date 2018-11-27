package java_20181025;

import java.util.Date;
import java.util.Vector;

//import java.lang.*;//기본 내장

public class PackageTest {
	
	public static void main(String[] args) {
		Math.random();
		Date now = new Date();
		//날짜 타입 데이터 클래스.현재시간 출력
		//패키지화 : 170여개
		System.out.println(now);
		
		Vector v = new Vector();
		
		System.out.println(v);
		Date now2 = new Date();
		System.out.println(now2);
		
		
	}

}
