package java_20181026;

class Employee{ // 회사원
	int id;
	String name = "부모";
	double salary;
	String dept;
	
	void print() {
		System.out.println(id+":"+salary+":"+dept);
	}
	
}

class Manager extends Employee{ //관리직 사원
	String jobOfManage;
	int cntOfSub;
	String name = "자식";
	//String name = "부모";
	
	
	void test() {
		String name = "지역";
		System.out.println(name); //지역변수
		System.out.println(this.name); //자식
		System.out.println(super.name); //부모
	}
	
	//@ at-sign
	@Override
	void print() {
		super.print();
		//System.out.println(id+":"+salary+":"+dept);
		System.out.println(jobOfManage+"--"+cntOfSub);
		
	}
	
	
}

public class ManagerTest {
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee();
	
	e1.name = "김사원";
	
	Manager m1 = new Manager();
	
	m1.id = 100;
	//m1.name = "박과장" ;
	m1.salary = 50000.88;
	m1.jobOfManage = "전산관리";
	m1.cntOfSub = 10;
//	System.out.println
//	(m1.id+":"+m1.name+":"+m1.salary+":"+m1.jobOfManage+":"+m1.cntOfSub);

	m1.print();
	
	//m1.test();
	}
}
