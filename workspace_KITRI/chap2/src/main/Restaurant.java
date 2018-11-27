package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import view.LoginView;
import view.MemberJoinView;
import view.MenuView;
import view.Orderview;
import view.ReserveView;
import vo.MemberVO;
import vo.MenuVO;

public class Restaurant {
	
	public static void main(String[] args) {
		HashMap<MemberVO, ArrayList<MenuVO>> login = null;
		ArrayList<MenuVO> basketlist = null;
		MemberVO mvo = null;
		
		
		
		
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 메뉴보기");
		System.out.println("2. 주문하기");
		System.out.println("3. 예약하기");
		System.out.println("4. 리뷰 게시판");
		System.out.println("5. 로그인");
		System.out.println("6. 로그아웃");
		System.out.println("7. 회원가입"); //7.회원가입 메뉴 추가합니다.
		System.out.println("8. 관리자 메뉴");
		System.out.println("9. 종료");
		System.out.print("번호를 입력하세요 : ");
		String menu = sc.nextLine();
		
		
		if(Static.isInt(menu)) {
			int select =  Integer.parseInt(menu);
			
			if(select == 9) {
				System.exit(0);
			}else if(select == 1) {
				MenuView mv = new MenuView(login, basketlist);
				basketlist = mv.menuSearch();
				try {
					login.put(mvo, basketlist);
				}catch(Exception e){
					
				}
			}else if(select == 2) {
				Orderview ov = new Orderview(login, basketlist);
				ov.pay();
				
			}else if(select == 3) {
				ReserveView rv = new ReserveView(login);
				//rv
			}else if(select == 4) {
				
			}else if(select == 5) {
				mvo = new LoginView().input();	
				login = new HashMap<MemberVO, ArrayList<MenuVO>>();
				basketlist = new ArrayList<MenuVO>();
				login.put(mvo, basketlist);
			}else if(select == 6) {
				login.clear();
				
			}else if(select == 7) {				
				new MemberJoinView().input();
			}else if(select == 8) {
				
				
				
			}
			
			
		}else {
			System.out.println("숫자를 입력해주세요!");
		}
		
		}//while end
	
	}//main end
	
}
