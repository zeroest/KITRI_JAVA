package one;

class Account{
	
	String name;
	private int pw;
	double balance;
	
	Account(String name, int pw, double balance){
		this.name = name;
		this.pw = pw;
		this.balance = balance;
	}
	
	void getPw() {
		System.out.println(pw);
	}
		
	void setPw(int pw) {
		this.pw = pw;
	}
		
	
}

public class AccountTest {

	public static void main(String[] args) {
		
		Account a1 = new Account("100-200", 1234, 0);
		a1.setPw(4321);
		a1.getPw();
		

	}

}
