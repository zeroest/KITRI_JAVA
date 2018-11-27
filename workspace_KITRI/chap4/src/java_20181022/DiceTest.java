package java_20181022;

public class DiceTest {
	public static void main(String[] args) {
		
		int mine = (int)(Math.random()*6)+1 ;
		int yours = (int)(Math.random()*6)+1;
		
		System.out.println("³» ÁÖ»çÀ§ ´« = "+ mine);
		System.out.println("»ó´ë¹æ ÁÖ»çÀ§ ´« = "+yours);
	
		if(mine> yours) {
			System.out.println("³»°¡ÀÌ±è");
			
		}else if (mine == yours) {
			System.out.println("ºñ±è");
		}else {
			System.out.println("³»°¡ Áü");
		}
		
		int ran = (int)(Math.random()*90)+10; // 0+10<double<90+10
		
		System.out.println(ran);
		
		
	}
	
}
