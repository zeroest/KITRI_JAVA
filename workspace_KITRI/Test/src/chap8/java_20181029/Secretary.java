package chap8.java_20181029;

public class Secretary extends Employee{

	double secretary_sal;

	public Secretary(int emp_id, String name, double main_sal, double additional_sal, double secretary_sal) {
		super(emp_id, name, main_sal, additional_sal);
		this.secretary_sal = secretary_sal;
	}

	@Override
	void totalSalary() {
		double sum = main_sal+additional_sal+secretary_sal;
		System.out.println(sum);
	}
	
	
	
	
}
