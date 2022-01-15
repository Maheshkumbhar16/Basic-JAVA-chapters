package practice;

public class Casting {

/*
Widening Casting (automatically)-converting a smaller type to larger type size
byte-> short-> char-> int-> long-> float-> double

Narrowing Casting (manually)-converting a larger type to a smaller size type
double-> float-> long-> int-> char-> short-> byte
*/	
	
	public static void main(String args[]) {
		//Widening Casting
		int myint=9;
		double mydouble= myint;    //Automatically coverting into mydouble
		System.out.println("Value before converting myint : " + myint);
		System.out.println("Value after converting myint into mydouble : " +mydouble);
		
		//Narrowing Casting
		double myDouble= 9.78d;
		int myInt= (int)myDouble;        //Manual Casting : (smaller datatype)
		System.out.println("Value before converting mydouble : "+myDouble);
		System.out.println("Value after convcerting mydouble to myint : "+myInt);
	}
}
