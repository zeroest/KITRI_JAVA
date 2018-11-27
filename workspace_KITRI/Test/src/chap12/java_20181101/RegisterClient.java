package chap12.java_20181101;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegisterClient extends Thread {
	
	Date d;
	
	RegisterClient(Date d){
		this.d = d;
	}
	
	public void run() {
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일");
		String sdfdate = sdf.format(cal.getTime());
		
		System.out.println(sdfdate+"에 회원가입 요청합니다");
		System.out.println("회원가입 요청중입니다");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("회원가입요청 처리완료입니다");
	}
	

}
