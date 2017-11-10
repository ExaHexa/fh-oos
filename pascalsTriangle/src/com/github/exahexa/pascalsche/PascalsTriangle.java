package com.github.exahexa.pascalsche;
/**
 * <p>Pascal's Triangle</p>
 * <p></p>
 * @author exahexa
 *
 */
public class PascalsTriangle {
	
	private final int DEPTH = 10;
	private int[][] triangleArray;

	public static void main(String[] args) {
		PascalsTriangle pasT = new PascalsTriangle();
		pasT.initTriangleArray();
		pasT.triangleArrayOutput();
	}
	
	/*
	 * construct triangle Array and fill it with  
	 * binomial coefficients
	 */
	private void initTriangleArray() {
		triangleArray = new int[DEPTH][];
		for(int i = 0; i < DEPTH; i++) {
		    triangleArray[i] = new int[i+1];
		    triangleArray[i][0] = 1; // first entry is always 1
		    for(int j = 1; j < i; j++) {
		    		// build triangle by given computationally regulations
			      triangleArray[i][j] = triangleArray[i-1][j-1] 
			                            + triangleArray[i-1][j];
			  }
		    triangleArray[i][i] = 1; // last entry is always 1
		}
	}
	
	/*
	 * create output formatted as triangle
	 */
	private void triangleArrayOutput() {
		for(int i = 0; i < DEPTH; i++) {
			  for(int j = 0; j < triangleArray[i].length; j++) {
			      System.out.print(triangleArray[i][j] + " ");
			  }
			  System.out.println();
		}		
	}

}
