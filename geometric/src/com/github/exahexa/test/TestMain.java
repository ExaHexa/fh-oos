/**
 * 
 */
package com.github.exahexa.test;

/**
 * @author exahexa
 *
 */

import com.github.exahexa.geom.*;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KreisVererb t = new KreisVererb();
		System.out.println(t.toString());
		Point p = new Point(2,2);
		KreisVererb t2 = new KreisVererb(p, 1);
		System.out.println(t2.toString());
		KreisVererb t3 = new KreisVererb(3,3,3);
		System.out.println(t3.toString());
		System.out.println(t2.equals(t3));
		System.out.println(t2.equals(p));
		System.out.println(t3.getLocation());
		t3.setLocation(p);
		System.out.println(t3.getLocation());
		t3.translate(2, 2);
		System.out.println(t3.toString());
		System.out.println(t.getRadius());
		t.setRadius(20);
		System.out.println(t.toString());
	}

}
