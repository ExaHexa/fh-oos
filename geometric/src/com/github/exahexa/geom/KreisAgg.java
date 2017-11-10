/**
 * 
 */
package com.github.exahexa.geom;

/**
 * A circle represented by a point (x,y) in coordinate space and its specified radius
 * @author exahexa
 * @version 1.0
 */

public class KreisAgg extends SimpleGeomFigure{
    
	  /**
	   * A Point which contains the (X,Y) origin coordinates of the Circle
	   */
	  public Point p;
	  
	  /**
	   * The radius of the Circle
	   */
	  public int radius;
	  
	  /**
	   * Constructs a new Circle whose origin is at (0,0),
	   * and whose radius is zero
	   */
	  public KreisAgg() {
	      this.p = new Point();
	      this.radius = 0;
	  }
	  
	  /**
	   * Constructs a new Circle whose origin is at the specified Point p,
	   * and whose radius is zero
	   * @param p a Point that is the origin of the Circle
	   */
	  public KreisAgg(Point p) {
	      this.p = p;
	      this.radius = 0;
	  }
	  
	  /**
	   * Constructs a new Circle whose origin is at (0,0),
	   * and whose radius is specified by the argument of the same name
	   * @param radius the specified radius
	   */
	  public KreisAgg(int radius) {
	      this.p = new Point();
	      this.radius = radius;
	  }
	  
	  /**
	   * Constructs a new Circle whose origin is specified by the arguments (x,y),
	   * and whose radius is specified by the argument of the same name
	   * @param x the specified X coordinate
	   * @param y the specified Y coordinate
	   * @param radius the specified radius
	   */
	  public KreisAgg(int x, int y, int radius) {
	      this.p = new Point(x, y);	
	      this.radius = radius;
	  }
	  
	  /**
	   * Constructs a new Circle whose origin is specified at the Point p,
	   * and whose radius is specified by the argument of the same name
	   * @param p a Point that is the origin of the Circle
	   * @param radius the specified radius
	   */
	  public KreisAgg(Point p, int radius) {
	      this.p = p;
	      this.radius = radius;
	  }
	  
	  /**
	   * Constructs a new Circle, initialized to match the values of the 
	   * specified Circle k
	   * @param k the Circle from which to copy initial values to a newly constructed Circle
	   */
	  public KreisAgg(KreisAgg k) {
	      this.p = k.p;
	      this.radius = k.radius;
	  }	  
	  
	  /**
	   * Returns the radius of the Circle
	   * @return the radius of the Circle
	   */
	  public int getRadius() {
	      return this.radius;
	  }
	  
	  /**
	   * Returns the size of the Circle
	   * @return the size of the Circle
	   */
	  @Override
	  public double getSize() {
	  	  return (Math.PI * (radius*radius));
	  }
	  
	  /**
	   * Sets the radius of this Circle to the specified radius
	   * @param radius the new radius for this Circle
	   */
	  public void setRadius(int radius) {
	      this.radius = radius;
	  }
	  
	  /**
	   * Checks whether two Circles are equal
	   * @param k the Circle to compare with this Circle
	   * @return true if the Circles are equal; false otherwise
	   */
	  public boolean equals(KreisAgg k) {
	      return (this.p.equals(k.p) && this.radius == k.radius); 
	  }
	  
	  /**
	   * Creates and returns a copy of this instance
	   * @return a clone of this instance
	   */
	  public KreisAgg clone() {
	      return new KreisAgg(this.p, this.radius);
	  }
	  
	  /**
	   * Returns a String representing this Circle origin and its radius value
	   * @return a String representing this Circle object's origin coordinates and radius value
	   */
	  @Override
	  public String toString() {
	      return this.p.toString() + " Radius: " + this.radius;
	  }

}
