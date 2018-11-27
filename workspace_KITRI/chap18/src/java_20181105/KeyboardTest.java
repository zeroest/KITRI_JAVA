package java_20181105;

import java.io.IOException;

public class KeyboardTest {
	
	public static void main(String[] args) {
		/*
		//java 입력시
		System.in.read(); //j
		System.in.read(); //a
		System.in.read(); //v
		System.in.read(); //a
*/		
		//'a'97 '0'48 'A'65
		//CTRL + Z : 키보드 입력 종료 제어키 => -1
		//java.io 코드 : IOException throws
		
		//1.게시판 2.회원가입 3.장바구니 quit
		int result = 0;
		System.out.println("번호를 입력하세요");
		try {
		while((result = System.in.read()) != 'q') {
			//System.out.println((char)result);
			char num = (char)result;
			if(num == '1'/*49==1*/) {
				System.out.println("게시판 선택하셨습니다.");
			}else if(num == '2') {
				System.out.println("회원가입 선택하셨습니다.");
			}else if(num == '3') {
				System.out.println("장바구니 선택하셨습니다.");
			}
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//13 엔터 , -1 값이 없음
		//영문자 숫자 올바르게 입출력
		//자바데이터타입 인식x
		
		
		
		
	}

}
