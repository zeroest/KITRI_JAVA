package chap9.java_20181030;

public class CellPhoneMain {
	public static void main(String[] args) {

		CellPhone myPhone = new CellPhone("GALAXY-9");

		// charge, call 메소드 호출 포함하여 try-catch 블록 정의
		// throws 하고 있는 예외 처리한다.
		// 각 예외 발생시 어떤 메소드에서 어떤 원인으로 발생했는지
		// 출력한다

		try {
			myPhone.charge(20); // 20분간 충전을 한다.
			myPhone.printBattery();

			myPhone.call(300); // 300분간 통화를 한다.
			myPhone.printBattery();

			myPhone.charge(50); // 50분간 충전을 한다.
			myPhone.printBattery();

			myPhone.call(40); // 40분간 통화를 한다.
			myPhone.printBattery();

			myPhone.call(-20); // 통화시간입력오류
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		CellPhone yourPhone = new CellPhone("galaxy-9");

		if (myPhone.isSame(yourPhone)) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		}
	}
}