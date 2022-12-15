package tests;

public class CallMethodsT2 {
	
	public static void main(String[] args) {
		
		CallMethodsT2.blue();
		CallMethodsT2 r1= new CallMethodsT2();
		r1.red();
		CallMethodsT1.printMe();
		CallMethodsT1 p1 = new CallMethodsT1();
		p1.paintMe();
		
	}

	public static void circle() {
		System.out.println("circle");
	}
	
	public void square() {
		System.out.println("square");
		
	}
	
	public static void blue() {
		System.out.println("blue");
	
	}
	
	public void red() {
		System.out.println("red");
	}
}
