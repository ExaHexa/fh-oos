package com.github.exahexa.geom;

/**
 * A circle represented by a point (x,y) and its specified radius.
 * This class inherits from the Point class
 *  
 * @author exahexa
 * @version 1.0
 */

public class KreisVererb extends Point{
	
	public int radius;
	
	/**
	 * Constructs a new Circle whose origin is at (0,0) and whose radius
	 * is zero
	 */
	public KreisVererb() {
		super();
		this.radius = 0;
	}
	 /**
	  * Constructs a new Circle whose origin is at the specified Point p
	  * and whose radius is specified by the argument of the same name
	  * @param p a Point that is the origin of the Circle
	  * @param radius the specified radius
	  */
	public KreisVererb(Point p, int radius) {
		super(p);
		this.radius = radius;
	}
	/**
	 * Constructs a new Circle whose origin is specified by the arguments (x,y)
	 * and whose radius is specified by the argument of the same name
	 * @param x the specified X coordinate
	 * @param y the specified Y coordinate
	 * @param radius the specified radius
	 */
	public KreisVererb(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	 /**
	  * Returns the radius of the Circle
	  * @return the radius of the Circle
	  */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * Checks whether two Circles are equal
	 * @param k the Circle to compare with this Circle
	 * @return true if the Circle are equal; false otherwise
	 */
	public boolean equals(KreisVererb k) {
		return (this.x == k.x && this.y == k.y && this.radius == k.radius);		
	}
	
	/**
	 * Sets the radius of this Circle to the specified radius r
	 * @param r the new radius for this Circle
	 */
	public void setRadius(int r) {
		this.radius = r;
	}
	
	/**
	 * Returns a String representing this Circle origin and its radius value
	 * @return a String representing this Circle object's origin coordinates and radius value
	 */
	@Override
	public String toString() {
		return "x: " + this.x + " y: " + this.y + " radius: " + this.radius;
	}

}
