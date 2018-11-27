package chap18.java_20181106;

public class Cart {

	private int cartcode;
	private String title;
	private int price;
	private int balance;
	
	
	public Cart(String[] array) {
		this.cartcode = Integer.parseInt(array[0]);
		this.title = array[1];
		this.price = Integer.parseInt(array[2]);
		this.balance = Integer.parseInt(array[3]);
	}
	
	public int sum() {
		return price*balance;
	}

	@Override
	public String toString() {
		return title+" "+balance+"개 장바구니 저장 완료";
	}
	
}
