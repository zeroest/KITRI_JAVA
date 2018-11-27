package chap12.java_20181101;

public class LoginClient extends Thread {
	
	String id;
	String pw;
	
	LoginClient(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public void run() {
		System.out.println("로그인 아이디"+id+"를 입력받습니다.");
		if(id.equals("java")) {
			System.out.println("로그인 암호를 확인합니다");
			if(pw.equals("java")) {
				System.out.println("로그인암호 맞습니다");
			}else System.out.println("로그인암호 올바르지 않습니다");
		}else System.out.println("로그인 아이디 올바르지 않습니다");
	}

}//class end
