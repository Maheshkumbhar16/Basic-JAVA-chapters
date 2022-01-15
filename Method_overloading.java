package practice;

public class Method_overloading {
	//method name : method(int)
	static int method(int x, int y) {
		return x+y;
	}
	
	//method name : method(double)
	static double method(double x, double y) {
		return x+y;
	}
	
	public static void main(String args[]) {
		int mynum1= method(8,5);
		double mynum2= method(8.5,5.6);
		System.out.println("Method having int : "+ mynum1);
		System.out.println("Method having double : "+mynum2);
	}
}
