package chap8.java_20181029;

public class Employee {
	
	int emp_id;
	String name;
	double main_sal;
	double additional_sal;
	
	Employee(int emp_id, String name, double main_sal, double additional_sal){
		this.emp_id = emp_id;
		this.name = name;
		this.main_sal = main_sal;
		this.additional_sal = additional_sal;
	}
	
	void totalSalary() {
		double sum = main_sal+additional_sal;
		System.out.println(sum);
	}
	void sal_print() {
		System.out.print(emp_id+":"+name+":"+main_sal+":");
	}
	
}
