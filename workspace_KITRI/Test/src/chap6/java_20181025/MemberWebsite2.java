package chap6.java_20181025;

import java.util.Scanner;

class Member2 {

	Scanner sc = new Scanner(System.in);

	String id;
	private String pw;
	String name;
	int age;
	
	

	void wherego() {
		while (true) {
			
			System.out.println("=================================================");
			System.out.println("1.회원가입:2.로그인:3.정보수정:4.정보조회:5.로그아웃:6.종료");
			System.out.println("------------------번호를입력하세요!------------------");
			System.out.println("=================================================");

			int where = sc.nextInt();
			switch (where) {
			case 1:
				signup();
				wherego();
			case 2:
				login();
				wherego();
			case 3:
				setInfo();
				break;
			case 4:
				getinfo();
				break;
			case 5:
				logOut();
				break;
			case 6:
				return; 
			default:
				System.out.println("다시입력해주세요!");
				wherego();
			}
		}
	}

	void signup() {
		
		System.out.println("===회원 가입===");
		this.id = sc.nextLine();
		System.out.println("아이디를 입력하시오");
		this.id = sc.nextLine();
		System.out.println("비밀번호를 입력하시오");
		this.pw = sc.nextLine();
		System.out.println("이름을 입력하시오");
		this.name = sc.nextLine();
		System.out.println("나이를 입력하시오");
		this.age = sc.nextInt();

		System.out.println("아이디=" + id + "\n이름=" + name + "\n나이=" + age);
		System.out.println("회원가입 완료 되었습니다.");
	}

	void login() {

			
			System.out.println("로그인 할 아이디를 입력하세요");
			String logid = sc.nextLine();

			System.out.println("비밀번호를 입력하세요");
			String logpw = sc.nextLine();

			if (id.equals(logid)) {
				if (pw.equals(logpw)) {
					System.out.println("로그인 되었습니다.");
					
				} else {
					System.out.println("비밀번호를 다시 입력해주세요.");
				}
			} else {
				System.out.println("등록된 사용자가 없습니다.");
			}
		}

	void setInfo() {
	
		System.out.println("===비밀번호 재설정===");
		System.out.println("로그인 할 아이디를 입력하세요");
		String logid = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String logpw = sc.nextLine();
		System.out.println("변경할 비밀번호를 입력하세요");
		String logpw2 = sc.nextLine();
		System.out.println("변경할 비밀번호를 한번더 입력하세요");
		String logpw3 = sc.nextLine();

		if (this.id.equals(logid)) {
			if (this.pw.equals(logpw)) {
				if (logpw2.equals(logpw3)) {
					this.pw = logpw3;
					System.out.println("비밀번호 변경이 완료되었습니다.");
					System.out.println(logpw2);
				} else {
					System.out.println("바꾸시는 비밀번호 입력값이 같지 않습니다.");
				}
			} else {
				System.out.println("비밀번호를 다시 입력해주세요.");
			}
		} else {
			System.out.println("등록된 사용자가 없습니다.");
		}
	}

	void getinfo() {
		System.out.println("===회원정보 조회===");
		
		System.out.println("확인 할 아이디를 입력하세요");
		String logid = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String logpw = sc.nextLine();
		if (this.id.equals(logid)) {
			if (this.pw.equals(logpw)) {
				System.out.println("아이디=" + this.id + "\n이름=" + this.name + "\n나이=" + this.age);
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("등록된 사용자가 없습니다.");
		}
	}

	void logOut() {
		
		System.out.println("로그아웃하시겠습니까?(Y/N)");
		String que = sc.nextLine();
		if (que.toUpperCase().equals("Y"))
			System.out.println("로그아웃 되었습니다.");
		else if (que.toUpperCase().equals("N"))
			System.out.println("로그인을 유지합니다.");
		else
			System.out.println("Y/N 으로 입력해 주세요");
	}

}

public class MemberWebsite2 {

	public static void main(String[] args) {

		Member2 mem1 = new Member2();

		mem1.wherego();
	}
	
}
