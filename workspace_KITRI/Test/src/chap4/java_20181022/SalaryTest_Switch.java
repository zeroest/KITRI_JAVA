package chap4.java_20181022;

public class SalaryTest_Switch {
	public static void main(String[] args) {
		
		String title = "사장";
		//대리 과장 부장 사장
		double basesalary = 50000;
		int emp_comm =0;
		int totalsalary = 0 ;
		
		
		switch(title) {
		case "사원" :
			emp_comm = 1000;
			totalsalary = (int)(basesalary+emp_comm);
			break;
		case "대리" :
			
		case "과장" :
			emp_comm = 5000;
			totalsalary = (int)(basesalary*1.2+emp_comm);
			break;
		default :
			emp_comm = 10000;
			totalsalary += (int)(basesalary*1.3+emp_comm);
			break;
		}
		System.out.println(title+"의 본봉은 = "+basesalary+
				", 사원 수당은 = "+emp_comm+", 총급여는 = "+totalsalary);
		
	}
}
