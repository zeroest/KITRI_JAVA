package chap2.java_20181019;

/*1.
3자리 정수 
int sample = 999;

백단위 출력 :900*/
public class Operator_Test {
	public static void main(String[] args) {
		
		int a ;
		int end;
		int ran = (int) (Math.round((Math.random()*899))+100);
		a= ran;
		System.out.println(ran);
		
		end = a/100;
		System.out.println(end*100);

	
	}
	
}
