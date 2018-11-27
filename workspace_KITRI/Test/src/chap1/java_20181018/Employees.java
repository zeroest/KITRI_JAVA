package chap1.java_20181018;

public class Employees {

	public static void main(String[] args) {
		/*employees 테이블 11개 컬럼들값 저장 용도
		employees 클래스 : main메소드에 : 11개 변수 선언 출력
		hire_date 컬럼 : date --> 변수 String
		100 이자바 lee@kitri.com 18/10/18 프로그래머직종 상사200번 50번부서 
		0102223333 salary10000 commission0.4*/
		/*int employee_id, String name, String email ,String hire_date,
		String job_id, int manager_id, int department_id, int phone_number
	*/	
		Employee_spec leejava = new Employee_spec(100, "이자바", "lee@kitri.com",
				"18/10/18", "프로그래머", 200, 50, 1022223333);
				
		leejava.introduce();
				
}
}

class Employee_spec{
	
	int employee_id;
	String name;
	String email;
	String hire_date;
	String job_id;
	int manager_id;
	int department_id;
	int phone_number;
	double salary;
	double commission_pct;
	boolean gender;
	boolean isbonus;
	
	Employee_spec(int employee_id, String name, String email ,String hire_date,
			String job_id, int manager_id, int department_id, int phone_number){
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.phone_number = phone_number;
	}
	
	void introduce() {
		System.out.println("사번  :  이름  :  이메일   :  입사일  :  직종  :  상사  :  부서번호  :  연락처");
		System.out.println(employee_id +" : "+ name  +" : "+ email  +" : "+ hire_date  +" : "+
			job_id  +" : "+ manager_id  +" : "+ department_id  +" : "+ phone_number);
	}
	
}
