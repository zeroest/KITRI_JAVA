package java_20181024;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 * //1.생성자 호출 Employee e1 = new Employee(); //2.객체내부 변수값 초기화 e1.id= 200;
		 * e1.name="박사장"; e1.dept="사장실"; e1.title="사장"; e1.pay=500000;
		 * 
		 * System.out.println
		 * (e1.id+"  "+e1.name+"  "+e1.dept+"  "+e1.pay+"  "+e1.title);
		 */
		Employee e2 = new Employee(100, "인사부", "김사원", "사원", 50000);

		System.out.println(e2);
		/*
		e2.introduce();

		Employee e3 = new Employee(300, "이사원");

		e3.introduce();

		// --------------------------------------------------
		Employee e[] = new Employee[50];

		e[0] = e2;*/

	}

}
