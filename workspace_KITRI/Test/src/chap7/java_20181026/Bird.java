package chap7.java_20181026;

public abstract class Bird {
	
	protected String name;
	protected int legs;
	protected double length;
	protected String spec ;
	
	
	public Bird(int legs, double length, String spec) {
		this.legs = legs;
		this.length = length;
		this.spec =spec;
	}


	abstract void fly();

	abstract void sing();
	
	void setName(String name) {
		this.name = name;
		
	}
	
	void print() {
		System.out.println(spec+"의 이름은 "+name+" 입니다.");
	}
	
}
