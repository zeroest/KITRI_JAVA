package main;

import java.util.ArrayList;
import java.util.HashMap;

import vo.MemberVO;
import vo.MenuVO;

public class Static {

	public static boolean isInt(String str) {
		
		try {
			Integer.parseInt(str);
			return true;
		}catch(Exception e){
			return false;
		}
		
		
	}
	
	public static boolean isLogin(HashMap<MemberVO, ArrayList<MenuVO>> login) {
		if(login == null) {
			return false;
		}else if(login.size() == 0) {
			System.out.println("로그인 후 이용해주세요");
			return false;
		}else return true;
	}
}
