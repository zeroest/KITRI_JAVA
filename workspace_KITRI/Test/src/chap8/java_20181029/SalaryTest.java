package chap8.java_20181029;

public class SalaryTest {
	public static void main(String[] args) {

		Employee e[] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee(1000, "이사원", 10000, 5000);
		e[1] = new Manager(2000, "김간부", 20000, 10000, 10000);
		e[2] = new Engineer(3000, "박기술", 15000, 7500, 5000, 5000);
		e[3] = new Secretary(4000, "최비서", 15000, 7000, 10000);

		System.out.println("사번:이름:본봉:총급여");
		for (int i = 0; i < e.length; i++) {
			e[i].sal_print();
			e[i].totalSalary();
			if (e[i] instanceof Manager) {
				System.out.println(((Manager) e[i]).manager_sal);
			} else if (e[i] instanceof Secretary) {
				System.out.println(((Secretary) e[3]).secretary_sal);
			}
		}

	}

}
