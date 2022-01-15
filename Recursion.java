package practice;

public class Recursion {
	
	public static int sum(int num1, int num2) {
		if (num2> num1) {                       //Halting condition 
			return num2+ sum(num1, num2-1);    // recursion -----> function call itself
		}
		else
			return num2;
	}
	
	public static void main(String args[]) {
		int ans=sum(5, 10);
		System.out.println(ans);
	}
}
