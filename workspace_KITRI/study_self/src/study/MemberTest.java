package study;

public class MemberTest {

	public static void main(String[] args) {
		Member a = new Member();
		
		a.sta_sta();
		a.sta_ins();
		a.ins_sta();
		a.ins_ins();
		
		Member.sta_sta();
		Member.sta_ins();
		//A.ins_sta();
		//A.ins_ins();
		
		
		
		
	}
}

class Member{
	int instance_variable = 10;
	static int static_variable = 20;
	
	static void sta_sta() {
		System.out.println(static_variable);
	}
	static void sta_ins() {
		//System.out.println(instance_variable);
	}
	void ins_sta() {
		System.out.println(static_variable);
	}
	void ins_ins() {
		System.out.println(instance_variable);
	}
	
	
	
	
	
	
}