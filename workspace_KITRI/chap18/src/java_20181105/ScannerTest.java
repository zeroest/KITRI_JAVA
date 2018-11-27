package java_20181105;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		//System.out.println("입력을 시작하세요");
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("정수 2개를 입력하면 덧셈결과를 출력합니다.");
		if(sc.hasNextInt()) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			System.out.println(first+second);
		}
		sc.nextLine(); // 100 200 엔터키!!!
		
		System.out.println("한글문자열을 입력하세요.");
		
		String third = sc.nextLine();
		System.out.println(third);*/
		
		System.out.println("=== 사이트메뉴 ===");
		System.out.println("1. 게시판");
		System.out.println("2. 회원가입");
		System.out.println("3. 장바구니");
		System.out.println(" quit 입력시 종료합니다.");
		//1,2,3,quit
		
		
		while(sc.hasNext()) { //입력한 내용이 문자열로 변환가능하냐
			String menu = sc.next();
			System.out.println(menu);
			sc.nextLine();
			if(menu.equals("1")/*49==1*/) {
				System.out.println("게시판 선택하셨습니다.");
			}else if(menu.equals("2")) {
				System.out.println("회원가입 선택하셨습니다.");
			}else if(menu.equals("3")) {
				System.out.println("장바구니 선택하셨습니다.");
			}else if(menu.equalsIgnoreCase("quit")) {
				System.out.println("종료합니다.");
				break;
				//System.exit(0); // return; // break;
			}
			
		}
		
		System.out.write(13);
		System.out.write(97); //'a'
		System.out.println('a');
		
		
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
