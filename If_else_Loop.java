package practice;

public class If_else_Loop {
	public static void main(String args[]) {
		
		//if...else statement
		int num=50;
		if(num==0) {  
			System.out.println("Given number is 0");
		}
		else if(num<20) {
			System.out.println("Given number is less than 20");
		}
		else {
			System.out.println("Given number is greater than 20");
		}
		
		
		
		//Ternary Operator
		//only for if-else
		int time =20;
		//variable variable_name = (condition) ? "true statement" : "false statement"
		String result=(time<10)?"Time is less than 10":"Time is greater than 10";
		System.out.println(result);
	}
}
