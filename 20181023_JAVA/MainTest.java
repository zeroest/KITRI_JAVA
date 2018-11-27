public class MainTest {

	public static void main(String[] args) {
		
		/*args = new String[args.length]
		args[0]~args[args.length-1] : 입력 저장*/
		
		
		System.out.println("명령행 매개변수의 갯수 = " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args[0] + args[1]);
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);

		// double sample = Double.parseDouble(args[0]);

	}
}