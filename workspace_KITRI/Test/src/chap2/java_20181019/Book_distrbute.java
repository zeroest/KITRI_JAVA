package chap2.java_20181019;
/*2.
책 : 97권 있다
int cntOfBooks = 97;
책 필요한 학생 : 12명
int cntOfStu = 12;

2-1책의 권수가 학생수보다 많다면
12명 학생들에게 공평권수의 책 분배
1명의 학생당 : xx권씩 가질 수 있습니다.
분배 후 남아있는 책은 xx권 입니다.

2-2책의 권수가 학생수보다 많지 않다면
나눠줄 수 없습니다.*/
public class Book_distrbute {

	public static void main(String[] args) {
		int cnt_Book = 97;
		int cnt_Stu = 12;
		int bookPerStu = cnt_Book/cnt_Stu;
		int modOfBook = cnt_Book%cnt_Stu;
		
		
		/*System.out.println(cnt_Book>cnt_Stu? "1명의 학생당 : "+(cnt_Book/cnt_Stu)+"권씩 가질 수 있습니다.\n"
				+"분배후 남아있는 책은"+cnt_Book%cnt_Stu+"권 입니다."
				:"나눠줄 수 없습니다.");*/
		
/*		if(cnt_Book>cnt_Stu) {
			System.out.println("1명의 학생당 : "+(cnt_Book/cnt_Stu)+"권씩 가질 수 있습니다.\n"
				+"분배후 남아있는 책은"+cnt_Book%cnt_Stu+"권 입니다.");
		}else {
			System.out.println("나눠줄 수 없습니다.");
		}
		*/
		
		int status = cnt_Book < cnt_Stu ? 1 : 0;
		
		if(status ==0) {
			System.out.println(bookPerStu);
			System.out.println(modOfBook);
		}else {
			System.out.println("나눠줄 수 없습니다.");
		}
		
		
		
	}
}
