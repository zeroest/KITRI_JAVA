package java_20181105;

class Box{
	
	Object contents;
	
	Box(Object o){
		contents = o;
	}

	Object getContents() {
		return contents;
	}

	private void setContents(Object contents) {
		this.contents = contents;
	}
	
}

class Apple{
	
	String origin; //원산지

	public Apple(String origin) {
		this.origin = origin;
	}
}

class Paper{
	
	String size; //용지크기

	public Paper(String size) {
		this.size = size;
	}
}

public class Boxtest {
	
	public Box getBox1() {
		//return new Box(new Apple("부산"));
		return new Box(new Paper("A4"));
	}
	
	public static void main(String[] args) {
		
		Box b1 = new Box(new Apple("경북대구"));
		
		Box b2 = new Box(new Paper("A4"));
		
		if(b1.getContents() instanceof Apple)
			System.out.println(((Apple)b1.getContents()).origin);
		
		if(b2.getContents() instanceof Paper)
			System.out.println(((Paper)b2.getContents()).size);
	}
}
