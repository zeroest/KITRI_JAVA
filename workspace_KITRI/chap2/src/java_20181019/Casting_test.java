package java_20181019;

public class Casting_test {

	public static void main(String[] args) {
		
		Student a = new Student();
		
		a.name = "김학생";
		a.kor = 80;
		a.eng = 99;
		a.mat = 45;
		
		a.sum();
		a.avgint(); //224/3 = 74
		a.avgdou();
		//if) double avg = sum/3.0; // 224/3 =74.6666666...
		
		System.out.println("이름="+a.name);
		System.out.println("국어="+a.kor);
		System.out.println("영어="+a.eng);
		System.out.println("수학="+a.mat);
		System.out.print("합계=");a.sum();
		System.out.print("평균=");a.avgint();a.avgdou();
		

	}

}


class Student{
	
	String name;
	int kor;
	int eng;
	int mat;
	
	void sum() {
		System.out.println(this.kor+this.eng+this.mat);
	}
		
	void avgint() {
			System.out.println((this.kor+this.eng+this.mat)/3);
		}
	void avgdou() {
		System.out.println((this.kor+this.eng+this.mat)/3.0);
	}
}
class Cal{
	
}
