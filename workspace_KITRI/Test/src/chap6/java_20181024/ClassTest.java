package chap6.java_20181024;

public class ClassTest {

	public static void main(String[] args) {
		// name, dept, course, tuition, additional
		//System.out.println(args.length);
		
		
		if (args.length >= 5) {
			ClassExam stu = new ClassExam(args[0], args[1], args[2].toUpperCase(), args[3], args[4]);
			stu.ref();

		}else {
			System.out.println("===입력값을 다시 입력하시오(5개)===");
			System.out.println("이름, 소속, 과정명, 교육비, 부가금");
			System.out.println("    ===현재 입력값("+args.length+"개)===       ");
			for(int i = 0 ; i<args.length ; i++) {
				System.out.print(args[i]+" ");
			}
		}
		

	}

}
