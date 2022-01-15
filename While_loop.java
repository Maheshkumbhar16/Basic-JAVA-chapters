package practice;

public class While_loop {
	public static void main(String args[]) {
				
		//while loop
		int i=0;
		while (i<=5) {
			System.out.println(i);
			i++;  //increase the variable or loop never ends
		}
		
		
		//do-while loop
		int num=10;
		//this loop is executed at least once even if condition is false
		do {
			System.out.println(num);
			num++;    //increase the variable or loop never ends
		}
		while(num<15);
	}
}
