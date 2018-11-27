package java_20181105;

class Box2<T>{
	
	T contents;
	
	Box2(T o){
		contents = o;
	}

	T getContents() {
		return contents;
	}

	void setContents(T contents) {
		this.contents = contents;
	}
	
	public <T> Box2 getBox2(T o) {
		//return new Box2(new Apple2("부산"));
		return new Box2(o);
	}
	
}

class Apple2{
	
	String origin; //원산지

	public Apple2(String origin) {
		this.origin = origin;
	}
}

class Paper2{
	
	String size; //용지크기

	public Paper2(String size) {
		this.size = size;
	}
}

public class Boxtest2 {
	
	
	
	public static void main(String[] args) {
		
		Box2<Apple2> b3 = new Box2<Apple2>(new Apple2("경북영주"));
		System.out.println(b3.getContents().origin);
		
				
		Paper2 p1 = new Paper2("B5");
		Box2<Paper2> b4 = new Box2<Paper2>(p1);
		System.out.println(b4.getContents().size);
		
		System.out.println((b3.<Paper2>getBox2(p1)));
	}
}
