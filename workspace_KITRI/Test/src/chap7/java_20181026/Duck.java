package chap7.java_20181026;

public class Duck extends Bird {

	int web ;
	
	Duck(String name, int web, int legs, double length, String spec){
		super(legs, length, spec);
		this.name = name;
		this.web = web;
		
	}
	
	void swim() {
		System.out.println(spec+name+"가 "+web+"개의 물갈퀴로 수영합니다.");
	}
	
	void fly() {
		System.out.println(spec+name+"는 날지 않습니다.");
	}
	
	void sing() {
		System.out.println(spec+name+"가 소리내어 웁니다.");
	}
	
}
