package Dhara;

public class ArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(4, 5);
		sum(6, 7);
		sum(10, 11);
		sum();
		sum(1,2,3);

	}

	public static void sum(int b, int c) {
		int a = b + c;
		System.out.println(a);
	}

	public static void sum() {

		int a = 1 + 1;
		System.out.println(a);

	}
	
	public static void sum(int a, int b, int c) {
		int d= a+b+c;
		System.out.println(d);
	}

}
