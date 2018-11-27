package view;

import java.util.Scanner;

import dao.LoginDAO;
import vo.MemberVO;

public class LoginView {
	public MemberVO input() {
		MemberVO vo = new MemberVO();
		System.out.println("1. 로그인");
		System.out.println("2. 아이디 찾기");
		System.out.println("3. 패스워드 찾기");
		System.out.print("메뉴선택 : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		if (menu == 1) {

			System.out.println("로그인을 시작합니다.");
			System.out.print("아이디 입력 : ");
			String member_id = sc.next();
			System.out.print("비밀번호 입력 : ");
			int pw = sc.nextInt();

			LoginDAO dao = new LoginDAO();
			vo = dao.loginMember(member_id, pw);
			return vo;

		} else if (menu == 2) {

			System.out.println("아이디 찾기를 시작합니다.");
			System.out.print("이름 입력 : ");
			String member_name = sc.next();
			System.out.print("연락처 입력 : ");
			String phone = sc.next();

			LoginDAO dao = new LoginDAO();
			dao.searchId(member_name, phone);

		} else if (menu == 3) {

			System.out.println("비밀번호 찾기를 시작합니다.");
			System.out.print("아이디 입력 : ");
			String member_id = sc.next();
			System.out.print("연락처 입력 : ");
			String phone = sc.next();

			LoginDAO dao = new LoginDAO();
			dao.searchPw(member_id, phone);

		}

		return null;

	}
}
