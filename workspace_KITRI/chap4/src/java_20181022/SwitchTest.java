package java_20181022;

public class SwitchTest {

	public static void main(String[] args) {
		int mine = (int)(Math.random()*6)+1;
		
		switch(mine) {
			case 1 :
				System.out.println("1³ª¿È");
				break;
			case 2 :
				System.out.println("2³ª¿È");
				break;
			case 3:
				System.out.println("3³ª¿È");
				break;
			case 4 :
				System.out.println("4³ª¿È");
				break;
			case 5 :
				System.out.println("5³ª¿È");
				break;
			default :
				System.out.println("6³ª¿È");
		}
		
		switch(mine) { // 1,3,5 : È¦¼ö´«ÀÌ ³ª¿Ô½À´Ï´Ù.
			case 1 :
				
			case 3:
				
			case 5 :
				System.out.println("È¦¼ö");
				break;
			case 2 :
				
			case 4 :
				 
			default :
				System.out.println("Â¦¼ö");
		}
		
	
	}
}
