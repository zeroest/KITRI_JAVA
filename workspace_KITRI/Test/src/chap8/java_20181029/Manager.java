package chap8.java_20181029;

public class Manager extends Employee{
	
	double manager_sal;
	
	Manager(int emp_id, String name, double main_sal, double additional_sal, double manager_sal) {
		super(emp_id, name, main_sal, additional_sal);
		this.manager_sal = manager_sal;
	}

	@Override
	void totalSalary() {
		double sum = main_sal+additional_sal+manager_sal;
		System.out.println(sum);
	}
	


}
