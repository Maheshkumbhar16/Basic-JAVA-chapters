package practice;

public class Multidimensional_arrays {
	public static void main(String args[]) {
		
		//multidimensional arrays
		int[][] mynumbers= {{1,2,3,4}, {5,6,7}};
		//type variableName = arrayName [array number][place of number in that array] 
		int x=mynumbers[1][2];
		System.out.println(x);
		
		//for loop
		for(int i=0; i<mynumbers.length; i++) {
			for(int j=0; j<mynumbers[i].length; j++) {
				System.out.println(mynumbers[i][j]);
			}
		}
	}
}
