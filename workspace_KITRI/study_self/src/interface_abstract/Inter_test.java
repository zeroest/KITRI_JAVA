package interface_abstract;

class Inter_test{
	
	public static void main(String[] args) {
		
		
		int i =(int)(Math.random()*10)+1;
		System.out.println(i);
		System.out.println("=============");
		int ar[] = new int[10];
		for(int j=0; j<ar.length; j++) {
			ar[j] = (int)(Math.random()*10)+1;
			System.out.println(ar[j]);
		}
		System.out.println("=============");

		
		for(int j =0 ; j<ar.length; j++) {
			if(ar[j]<i) {
				System.out.println(ar[j]);
			}
		}
		
	}
	
}