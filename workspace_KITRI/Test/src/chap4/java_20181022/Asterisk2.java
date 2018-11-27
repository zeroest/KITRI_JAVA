package chap4.java_20181022;

public class Asterisk2 {
	
	public static void main(String[] args) {
		/*
		***
		**
		*
		*/
		
		int ran = (int)(Math.random()*10)+1;
		
		int i = 0;
		int j = 0;
		
		System.out.println(ran);
		
		/*for(i = ran ; i>0 ; i--) {
			for(j=i ; j>0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		/*
		   *
		  **
		 ***
		*/
		
		
		
		/*for(i = 1 ; i <= ran ; i++) {
			for(j = 1 ; j <= ran ; j++) {
				if(ran-i>=j) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				}
			System.out.println();
		}*/
		
		/*
		***
		 **
		  *
		*/
		
		for(i = 1; i<=ran ; i++) {
			for(j =1 ; j <= ran ; j++) {
			 if(i <= j) {
				 System.out.print("*");
			 }else
				 System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
