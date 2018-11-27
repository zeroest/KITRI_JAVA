package chap7.java_20181026;

public class Sparrow extends Bird {

	String friend ;
	
	Sparrow(String name, String friend, int legs, double length,String spec){
		super(legs, length, spec);
		this.name = name;
		this.friend = friend;
	}
	
	void makeFriend() {
		System.out.println(spec+"의 친구는 "+friend+"입니다.");
	}
	
	void fly() {
		System.out.println(spec+name+"가 날아다닙니다.");
	}
	void sing() {
		System.out.println(spec+name+"가 소리내어 웁니다.");
	}
	
}
