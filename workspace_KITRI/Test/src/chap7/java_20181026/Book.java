package chap7.java_20181026;

public class Book {

	private String title;
	private int price;
	
	Book() {
		//super();
	}

	Book(String title, int price) {
		//super();
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	
}
