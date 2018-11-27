package view;

import java.util.Scanner;

import dao.MemberJoinDAO;
import vo.MemberVO;

public class MemberJoinView {

	public void input() {
		System.out.println("회원가입을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String member_id = sc.next();
		System.out.print("비밀번호 입력 : ");
		int member_pw = sc.nextInt();
		System.out.print("이름 입력 : ");
		String member_name = sc.next();
		System.out.print("전화번호 입력 : ");
		String phone = sc.next();
		System.out.print("이메일 입력 : ");
		String email = sc.next();

		MemberVO vo = new MemberVO(0, member_id, member_pw, member_name, phone, email);
		MemberJoinDAO dao = new MemberJoinDAO();
		String result = dao.insertMember(vo);

	}

}
