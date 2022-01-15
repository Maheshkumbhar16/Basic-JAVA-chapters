package practice;

public class String_sample {
	public static void main(String args[]) {
		String txt= "Hello world";
		System.out.println("The length of string is : "+txt.length());    // Length of string
		System.out.println("Uppercase: "+ txt.toUpperCase());   //Uppercase
		System.out.println("Lowercase : "+txt.toLowerCase());    //Lowercase
		System.out.println("Find out the loction of world : "+txt.indexOf("world"));   //Finds the location of the world
		
		String firstname="ABC";
		String lastname="XYZ";
		System.out.println(firstname.concat(lastname));  //String Concatenation
		System.out.println(firstname+" "+lastname);
	}
}
