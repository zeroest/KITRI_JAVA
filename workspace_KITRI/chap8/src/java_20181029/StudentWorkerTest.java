package java_20181029;

class StudentWorker/*extends Object*/ implements Student, Worker { // 인터페이스 구현 클래스

	String name = "조교";
	
	
	StudentWorker() {
		System.out.println("StudentWorker 생성자 발현");
	}

	@Override
	public void work() {
		System.out.println(name+" 일하다.");
	}

	@Override
	public void study() {
		System.out.println(name+" 공부하다.");
	}

	@Override
	public void lunch() {
		System.out.println(name+" 점심먹다.");
	}

}

public class StudentWorkerTest {
	public static void main(String[] args) {

		// Student st = new Student();
		// Worker wk = new Worker();

		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.work();
		sw.lunch();
		System.out.println(sw.name);
		System.out.println(Student.name);
		System.out.println(Worker.name);
		//System.out.println(super.name); //super는 Object
		/*super는 객체를 의미하는데 interface는 객체를 생성할 수 없다.
		즉 super는 Object가 되는 것*/
		
		sw.name = "학생2";
		//Student.name = "이름바꾸는것 불가 public final static";
		//Worker.name = "대학원생";
		
		Student sw2 = new StudentWorker();
		sw2.study();
		sw2.lunch();
		//sw2.work();
		System.out.println(sw2.name);
		
		Worker sw3 = new StudentWorker();
		sw3.work();
		sw3.lunch();
		//sw3.study();
		System.out.println(sw3.name);
		
		StudentWorker sw4 = new StudentWorker();
		/*Worker w = sw4;
		w.lunch();
		w.work();*/
		
		if( sw4 instanceof Student) {
			//Student s = sw4;
			sw4.study();
			sw4.lunch();
			sw4.work();
		}else if( sw4 instanceof Worker) {
			Worker wk = sw4;
			wk.work();
			wk.lunch();
		}
		
	}
}
