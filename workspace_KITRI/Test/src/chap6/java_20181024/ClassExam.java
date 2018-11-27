package chap6.java_20181024;

public class ClassExam {

	String name;
	String dept;
	String course;
	String tuition;
	String additional;

	ClassExam(String name, String dept, String course, String tuition, String additional) {
		this.name = name;
		this.dept = dept;
		this.course = course;
		this.tuition = tuition;
		this.additional = additional;
	}

	void ref() {
		int refund=0;
		int inttui = Integer.parseInt(tuition);
		int intadd = Integer.parseInt(additional);

		if (course.equals("자바프로그래밍")) {
			int result = (int) (inttui * 0.25 + intadd);
			refund = result;
		} else if (course.equals("JDBC프로그래밍")) {
			int result = (int) (inttui * 0.2 + intadd);
			refund = result;
		} else if (course.equalsIgnoreCase("JSP프로그래밍")) {
			int result = (int) (inttui * 0.15 + intadd);
			refund = result;
		} else {
			System.out.println(name + " " + dept + " " + course + " " + tuition + " " + additional);
			System.out.println("잘못 입력되었습니다.");
			return;
		}
		
		/*System.out.println
		 * ("이름=" + name + "\n소속=" + dept + "\n과목명=" 
		 * + course + "\n교육비=" + tuition + "\n부가금="
					+ additional + "\n환급금=" + refund);*/
		System.out.printf
		(" 이름=%s\n 소속=%s\n 과목명=%s\n 교육비=%s\n 부가금=%s\n 환급금=%d", 
				name, dept, course, tuition, additional, refund);
	}

}
