package tests;

public class CallMethodsT1 {

	static CallMethodsT1 c1 = new CallMethodsT1();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallMethodsT2.blue();
		CallMethodsT2 r1= new CallMethodsT2();
		r1.red();

		
	}

	public static void printMe() {
		System.out.println("printMe");
	}
	
	public static void scanMe() {
		System.out.println("scanMe");
	}
	
	public void paintMe() {
		System.out.println("paintMe");
	}
	
	public void testMe() {
		System.out.println("testMe");
	}
}

