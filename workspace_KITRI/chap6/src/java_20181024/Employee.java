package java_20181024;

//회사원객체 틀 정의
public class Employee {
//정적요소=변수
	int id;
	String name;
	String dept;
	String title;
	double pay;
	String company = "KITRI";

	// 생성자 : 객체생성 시점에서 수행 문장 정의
	// 클래스 이름과 같다
	Employee() {
		// System.out.println("employee생성자 호출");
	}

	Employee(int id, String name) {
		this(id, name, "부서미지정", "신입", 0);
	}

	Employee(int id, String name, String dept, String title, double pay) {

		this.id = id;
		this.name = name;
		this.dept = dept;
		this.title = title;
		this.pay = pay;

	}

	void introduce() {
		System.out.println(company + "사번=" + id + " 이름=" + name + " 부서=" + dept + " 급여=" + pay + " 직책=" + title);
	}
	
	public String toString() {
		return company + "사번=" + id + " 이름=" + name + " 부서=" + dept + " 급여=" + pay + " 직책=" + title;
	}
	
}
