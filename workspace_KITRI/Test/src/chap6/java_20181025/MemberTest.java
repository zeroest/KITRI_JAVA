package chap6.java_20181025;

class Member3{
	String id;
	int pw;
	String name;
	int age;
	void insert
	(String id, int pw, String name,int age) {
		this.id  = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("가입 완료되었습니다.");
	}
	void login(String id, int pw) {
		if(this.id.equals(id)) {
			if(this.pw == pw) {
				System.out.println("로그인되었습니다.");
			}//inner if
			else {
				System.out.println("암호찾기 화면 이동합니다.");
			}
		}//outer if
		else {
			System.out.println("아이디찾기 화면 이동합니다");
		}
	}//login 
	boolean updateInform(int newPw){
		if(this.pw == newPw) {
			return false;
		}
		else {
			this.pw = newPw;
			return true;
		}
	}
	void readPw() {
		System.out.println(this.pw);
	}
	void logout() {
		System.out.println("로그아웃되었습니다.");
	}
}
class MemberTest{
public static void main(String args[]){
	 Member3 mem3 = new Member3();
	 mem3.insert("test", 1234, "이자바", 25);
	 mem3.login("test1", 1234);
	 mem3.login("test", 1234);
	 //1234 -> 1111 변경
	 boolean up = mem3.updateInform(1111);
	 if(up == true) mem3.readPw();
	 // 1111 -> 1111 x
	 up = mem3.updateInform(1111);
	 if(up == true) mem3.readPw();
	 mem3.logout();

}
}
