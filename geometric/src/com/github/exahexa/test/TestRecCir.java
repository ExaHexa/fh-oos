/**
 * 
 */
package com.github.exahexa.test;

/**
 * @author exahexa
 *
 */
import com.github.exahexa.geom.*;

public class TestRecCir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleGeomFigure[] test = new SimpleGeomFigure[4];
		test[0] = new Rechteck(5,5);
		test[1] = new Rechteck(2,2);
		test[2] = new KreisAgg(4);
		test[3] = new KreisAgg(3);
		
		
		double sizeSum = 0;
		
		for(int i = 0; i < test.length; i++) {
		    if(test[i] != null) {
		        sizeSum += test[i].getSize();
		    }
		}
		
		System.out.println(sizeSum);
		

	}

}
