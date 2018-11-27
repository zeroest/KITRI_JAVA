package java_20181106;

import java.util.Date;

public class PrintF {
	public static void main(String[] args) {
		
		System.out.printf("%10.2f\n" , 1234.5678);
		System.out.printf("%-10.2f\n" , 1234.5678);
		System.out.printf("%10.2f , %6d\n" , 1234.5678 , 100);
		System.out.printf("%10.2f , %6d , %tF\n" , 1234.5678 , 100 , new Date());
		
		
	}
}
