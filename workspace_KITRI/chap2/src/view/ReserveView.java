package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import main.Static;
import vo.MemberVO;
import vo.MenuVO;

public class ReserveView {
	
	HashMap<MemberVO, ArrayList<MenuVO>> login;
	Scanner sc = new Scanner(System.in);
	
	
	public ReserveView(HashMap<MemberVO, ArrayList<MenuVO>> login) {
		this.login = login;
	}
	
	
	public void reserve() {
		
		reservetable();
		
		System.out.print("예약할 시간을 입력해주세요(ex 10) : ");
		String reservetime = sc.nextLine();
		if(Static.isInt(reservetime)) {
			int rtime = Integer.parseInt(reservetime);
			if(rtime <10)
			
		}else {
			System.out.println("숫자를 입력해주세요");
			reserve();
		}
		
		System.out.print("예약할 테이블을 입력해주세요(ex 3) : ");
		String reservetable = sc.nextLine();
		
		
		
		
	}
	
	
	public void reservetable() {
		
		
		String[] strarr = new String[10];
		
		
		//	String[0]
			
			//if()
			
			
			String[][] arr = new String[8][9];
			
			arr[3][0] = "[*]";
			
			arr[3][3] = "[*]";
			
			System.out.println("	10:00 11:00 12:00 13:00 14:00 15:00 16:00 17:00 18:00");
			for(int i = 0 ; i< arr.length ; i++) {
				System.out.print(i+1 + "번 테이블     ");
				for(int j = 0 ; j < arr.length+1 ; j++) {
					if(arr[i][j] == null) {
						arr[i][j] = "[ ]";
						
					}
					
					System.out.print(arr[i][j]+"   ");
				}
				System.out.println();
			}
		
		
	}
	

}
