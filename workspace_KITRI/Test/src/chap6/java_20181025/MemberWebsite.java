package chap6.java_20181025;

class Member{
	String id;
	private String pw;
	String name;
	int age;
	
	
	void signup(String id, String pw, String name, int age) {
	System.out.println("아이디, 암호, 이름, 나이를 입력하시오");
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.age = age;
	
	System.out.println("아이디="+id+"\n이름="+name+"\n나이="+age);
	System.out.println("회원가입 완료 되었습니다.");
	}
	
	void login(String id, String pw) {
		if(this.id.equals(id) && this.pw.equals(pw))
			System.out.println("로그인 되었습니다.");
		else if(this.id.equals(id))
			System.out.println("비밀번호를 다시 입력해주세요.");
		else 
			System.out.println("등록된 사용자가 없습니다.");
	}
	
	void setInfo(String id, String pw, String pw2, String pw3) {
		System.out.println("아이디와 비밀번호를 입력하시고 \n변경할 비밀번호를 동일하게 두번 입력해주세요.");
		if(this.id.equals(id) && this.pw.equals(pw)) {
			if(pw2.equals(pw3)) {
				System.out.println("비밀번호 변경이 완료되었습니다.");
				System.out.println(pw2);
			}else System.out.println("바꾸시는 비밀번호 입력값이 같지 않습니다.");		
		}else if(this.id.equals(id))
			System.out.println("비밀번호를 다시 입력해주세요.");
	}
	
	void getinfo(String id, String pw) {
		System.out.println("아이디와 비밀번호를 입력해주세요.");
		if(this.id.equals(id) && this.pw.equals(pw))
			System.out.println("아이디="+this.id+"\n이름="+this.name+"\n나이="+this.age);
		else if (this.id.equals(id))
			System.out.println("비밀번호가 일치하지 않습니다.");
		else System.out.println("등록된 사용자가 없습니다.");
	}
	
	void logOut() {
		System.out.println("로그아웃 되었습니다.");
	}
	
}

public class MemberWebsite {

	public static void main(String[] args) {
		
		Member mem1 = new Member();
		
		mem1.signup("test","t1234","이자바",25);
		System.out.println("========================================");
		mem1.login("test", "t1234");
//		mem1.login("test1","t1234");
//		mem1.login("test","1");
		System.out.println("========================================");

		mem1.setInfo("test", "t1234", "1234", "1234");
		/*mem1.setInfo("test", "1234", "1234", "123");
		mem1.setInfo("test", "123", "123", "123");
		mem1.setInfo("t", "t", "t", "t");*/
		System.out.println("========================================");

		mem1.getinfo("test","1234");
		System.out.println("========================================");

		mem1.logOut();
	}
}
