package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dao.MenuDAO;
import main.Static;
import vo.MemberVO;
import vo.MenuVO;

public class MenuView {
	
	Scanner sc = new Scanner(System.in);
	MenuDAO dao = new MenuDAO();
	ArrayList<MenuVO> basketlist = null;
	ArrayList<MenuVO> list = null;
	HashMap<MemberVO, ArrayList<MenuVO>> login = null ;
	
	
	

	public MenuView(HashMap<MemberVO, ArrayList<MenuVO>> login ,ArrayList<MenuVO> basketlist) {
		this.login = login;
		this.basketlist = basketlist;
	}


	public ArrayList<MenuVO> menuSearch() {
		
		System.out.println("=================================");
		System.out.println("\t  1.모든메뉴 보기");
		System.out.println();
		System.out.println("\t  --장바구니 담기--");
		System.out.println("\t  2.메인메뉴");
		System.out.println("\t  3.사이드메뉴");
		System.out.println("\t  4.드링크메뉴");
		System.out.println();
		System.out.println("\t  5.장바구니 목록보기");
		System.out.println("\t  6.장바구니 수정하기");
		System.out.println("\t  7.뒤로가기");
		System.out.println("=================================");

		System.out.print("번호를 입력해주세요 : ");
		String menu = sc.nextLine();
		
		if(Static.isInt(menu)) {
			int select = Integer.parseInt(menu);
			
			if(select == 1) {
				dao.mainMenuSearch();
				dao.sideMenuSearch();
				dao.drinkMenuSearch();
				System.out.println("=====메뉴 장바구니담기는 각 메뉴창에서 해주세요=====");
				menuSearch();
				
			}else if(select == 2) {
				mainmenu();
				menuSearch();
				
			}else if(select == 3) {
				sidemenu();
				menuSearch();
			}else if(select == 4) {
				drinkmenu();
				menuSearch();
			}else if(select == 5) {
				gobasket();
				order();
				
			}else if(select == 6) {
				gobasket();
				updatebasket();			
				
			}else if(select == 7) {
				return basketlist;
			}else {
				System.out.println("번호를 확인한 후 입력해 주세요!");
				menuSearch();
			}
					
			
			
		}else {
			System.out.println("번호를 입력해주세요!");
			menuSearch();
		}
		
		return basketlist;
	}//menuSearch method end

	
	public void mainmenu() {
		
		list = dao.mainMenuSearch();
		basket();
		
	}
	
	
	public void sidemenu() {
		list = dao.sideMenuSearch();
		basket();
	}
	
	public void drinkmenu() {
		
		list = dao.drinkMenuSearch();
		basket();

	}
	
	
	public void basket() {
		
		if(Static.isLogin(login)) {
			
			System.out.println("메뉴 번호를 선택하시면 장바구니로 추가됩니다!");
			System.out.println("0번 입력시 메뉴검색창으로 돌아갑니다.");
			System.out.print("메뉴 번호 : ");
			String menu = sc.nextLine();
			if(menu.equals("0")) {
				menuSearch();
			}
			System.out.print("개수를 입력해주세요 : ");
			String num = sc.nextLine();
			
			if(Static.isInt(menu)&&Static.isInt(num)) {
				int select = Integer.parseInt(menu);
				int many = Integer.parseInt(num);
				
					
				MenuVO vo = list.get(select-1);
				vo.setCount(many);
				
				basketlist.add(vo);
				
					
			}
		
		}
	
	}//basket method end
	
	
	public void gobasket() {
		
		try {
			if(Static.isLogin(login)) {
				
				if(basketlist.size() == 0) {
					System.out.println("-----------------------------------");
					System.out.println();
					System.out.println("\t     장바구니가 비어 있습니다.");
					System.out.println();
					System.out.println("-----------------------------------");
					menuSearch();
				}
				
				int cnt = 1;
				int sum = 0;
				System.out.println("-----------------------------------");
				System.out.println();
				System.out.println("\t      장바구니 목록");
				System.out.println();
				for(MenuVO vo : basketlist) {
					System.out.println(cnt++ +") "+ vo);
					sum +=vo.getPrice()*vo.getCount();
				}
				System.out.println();
				System.out.println("-----------------------------------");
				System.out.println();
				System.out.println("\t   총가격 : "+sum+"원");
				System.out.println();
				System.out.println("-----------------------------------");
		
				
				
				
				
			}else {
				System.out.println("로그인 후 사용하세요");
				menuSearch();
			}
		}catch(Exception e) {
			menuSearch();
		}
		
	}//go basket end
	
	
	public void order() {
		
		
		try {
			if(Static.isLogin(login)) {
				
				
				System.out.println("결제페이지로 가시겠습니까?(Y/N)");
				String gorder = sc.nextLine();
				if(gorder.equalsIgnoreCase("Y")) {
					Orderview ov = new Orderview(login, basketlist);
					ov.pay();
				}else if(gorder.equalsIgnoreCase("N")) {
					menuSearch();
				}else {
					
					System.out.println("Y/N 으로 입력해주세요");
					order();
				}
				
				
				
				
			}else {
				menuSearch();
			}
		}catch(Exception e) {
			menuSearch();
		}
		
		
	}//order method end
	
	
	public void updatebasket() {
		
		System.out.print("수정할 장바구니 번호를 입력해주세요(뒤로가기 0 번) : ");
		String updatetitle = sc.nextLine();
		if(Static.isInt(updatetitle)) {
			int uptitle = Integer.parseInt(updatetitle);
			if(uptitle == 0) {
				menuSearch();
			}else if(uptitle > basketlist.size()) {
				System.out.println("장바구니 번호를 확인해주세요!");
				updatebasket();
			}
		}else {
			System.out.println("번호로 입력해주세요");
			updatebasket();
		}
		
		System.out.println("1.개수 수정하기");
		System.out.println("2.삭제하기");
		System.out.print("번호를 입력해주세요 : ");
		String updatenum = sc.nextLine();
		
		if(Static.isInt(updatetitle)&&Static.isInt(updatenum)) {
			int uptitle = Integer.parseInt(updatetitle);
			int upnum = Integer.parseInt(updatenum);
			
			if(upnum == 1) {
				System.out.print("수정할 개수를 입력해주세요 :");
				String updatecount = sc.nextLine();
				if(Static.isInt(updatecount)) {
					int upcount = Integer.parseInt(updatecount);
					if(upcount == 0) {
						basketlist.remove(uptitle-1);
					}else {
						MenuVO vo = basketlist.get(uptitle-1);
						vo.setCount(upcount);
					}
					System.out.println("수정이 완료되었습니다.");
					menuSearch();
				}
			}else if(upnum == 2) {
				basketlist.remove(uptitle-1);
				System.out.println("삭제 되었습니다.");
				menuSearch();
			}
		}
		
	}
	
	
}




