package chap7.java_20181026;

public class BookMgr {

	Book booklist[];

	BookMgr(Book booklist[]) {
		this.booklist = booklist;
	}

	void printBookList() {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}

	void printTotalPrice() {
		int result = 0;
		for (int i = 0; i < booklist.length; i++) {
			result += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + result);
	}

}