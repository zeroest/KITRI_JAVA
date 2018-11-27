package chap2.java_20181019;

import java.util.Scanner;

public class Purchass_spec  {

	public static void main(String[] args) {
		Product ram = new Product("라면", 500, 7);
		Product beer = new Product("맥주", 1500, 2);		
		Product eggs = new Product("계란", 5000, 1);		
		Product beef = new Product("소불고기", 10000, 1);		
		Product apple = new Product("사과", 1000, 5);
		
		System.out.println("오늘의 쇼핑 영수증입니다.\n");
		System.out.println("제품명: 가격 * 구입수량 = 총가격");
		
		ram.print();
		beer.print();
		eggs.print();
		beef.print();
		apple.print();
		
		Product.gross_price
		(apple.each_price(),beef.each_price(),eggs.each_price(),
				beer.each_price(),ram.each_price());
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine()+"(으)로 결제 완료되었습니다.");*/
		
		String payment = "카드";
		System.out.println(payment == "카드"? "카드(으)로 결제 완료되었습니다." : "현금(으)로 결제 완료되었습니다.");
		
		
	}
}

class Product{
	
	String pro_name;
	int pro_price;
	int pro_amount;
	
	Product(){}
	
	Product(String pro_name, int pro_price, int pro_amount){
		this.pro_name = pro_name;
		this.pro_price = pro_price;
		this.pro_amount = pro_amount;
	}

	static void gross_price(int n1, int n2, int n3, int n4, int n5) {
		System.out.println("총 지불가격은 "+ (n1+n2+n3+n4+n5) +"입니다.\n");
	}
	
	int each_price() {
		/*this.pro_amount = pro_amount;
		this.pro_price = pro_price;*/
		return(pro_price*pro_amount);
	}
	void print() {
		System.out.println(pro_name+" : "+
				pro_price+" * "+
				pro_amount+" = "+
				each_price());
	}
	
}
