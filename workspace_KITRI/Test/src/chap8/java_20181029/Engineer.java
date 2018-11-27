package chap8.java_20181029;

public class Engineer extends Employee{

	double skill_sal;
	double engineer_sal;
	
	public Engineer(int emp_id, String name, double main_sal, double additional_sal, double skill_sal,
			double engineer_sal) {
		super(emp_id, name, main_sal, additional_sal);
		this.skill_sal = skill_sal;
		this.engineer_sal = engineer_sal;
	}

	@Override
	void totalSalary() {
		double sum = main_sal+additional_sal+skill_sal+engineer_sal;
		System.out.println(sum);
	}
	
	
	
}
