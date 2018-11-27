package chap7.java_20181026;

public class PlayBird {
	
	public static void main(String[] args) {
		
		Duck duck = new Duck("²Ð²ÐÀÌ", 2, 2, 3.0, "¿À¸®");
		duck.fly();
		duck.sing();
		duck.swim();
		duck.print();
		
		Sparrow spa = new Sparrow("Â±Â±", "Çã¼ö¾Æºñ", 2, 4.0, "Âü»õ");
		spa.fly();
		spa.sing();
		spa.makeFriend();
		spa.print();
		
		
	}
}
