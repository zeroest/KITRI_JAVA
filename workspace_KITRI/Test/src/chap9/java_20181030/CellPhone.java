package chap9.java_20181030;

public class CellPhone {
	
	String model;
	double battery;
	
	CellPhone(String model){
		this.model = model;
	}
	
	void call(int time) throws IllegalArgumentException {
		
		if(time<0) {
			throw new IllegalArgumentException("통화시간 입력오류");
		}else {
			System.out.println("통화시간 : "+time+"분");
			battery-=time*0.5;
			if(battery<0) battery = 0;
		}
	}
	
	void charge(int time) throws IllegalArgumentException {
		if(time<0) {
			throw new IllegalArgumentException("충전시간 입력오류");
		}else {
			System.out.println("충전 시간 : "+time+"분");
			battery += time*3;
			if(battery>100) battery=100;
		}
	}
		
	void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	
	boolean isSame(CellPhone other) {
		return model.equalsIgnoreCase(other.model);
	}
		
		
}


