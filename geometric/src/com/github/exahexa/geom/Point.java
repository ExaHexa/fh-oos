/**
 * 
 */
package com.github.exahexa.geom;

/**
 * A point representing a location (x,y) in coordinate space, specified in integer precision
 * @author exahexa
 * @version 1.0 
 *
 */
public class Point {
	
	/**
	 * The X coordinate of this Point
	 */
	public int x;
	
	/**
	 * The Y coordinate of this Point
	 */
	public int y;
	
	/**
	 * Constructs a new Point whose origin at (0,0)
	 */
	public Point() {
	    this.x = 0;
	    this.y = 0;
	}
	
	 /**
	  * Constructs a new Point whose origin is at the specified Point p
	  * @param p a Point
	  */
	public Point(Point p) {
		  this.x = p.x;
	    this.y = p.y;
	}
	
	 /**
	  * Constructs a new Point whose origin is specified by the arguments (x,y) 
	  * @param x the specified X coordinate
	  * @param y the specified Y coordinate
	  */
	public Point(int x, int y) {
		  this.x = x;
		  this.y = y;
	}
	
	/**
	 * Returns the X coordinate of this Point
	 * @return the X coordinate of this Point
	 */
	public int getX() {
		  return this.x;
	}
	 /**
	  * Returns the Y coordinate of this Point
	  * @return the Y coordinate of this Point
	  */
	public int getY() {
		  return this.y;
	}
	
	 /**
	  * Returns the location of this Point
	  * @return a copy of this Point, at the same position
	  */
	public Point getLocation(){
		  return this;
	}
		
	/**
	 * Sets the location of the Point to the specified location
	 * @param p a Point, the new location for this Point
	 */
	public void setLocation(Point p) {
		  this.x = p.x;
		  this.y = p.y;
	}
	
	/**
	 * Translates this Point the indicated distance
	 * @param dx the distance to move this Point along the X axis
	 * @param dy the distance to move this Point along the Y axis
	 */
	public void translate(int dx, int dy) {
		  this.x += dx;
		  this.y += dy;
	}
	
	/**
	 * Checks whether two point are equal
	 * @param p the Point to compare with this Point
	 * @return true if the Points are equal; false otherwise
	 */
	public boolean equals(Point p) {
		  if (this.x == p.x && this.y == p.y) {
			    return true;
		  }
		  return false;
	}
	
	/**
	 * Returns a String representing this Point
	 * @return a String representing this Point coordinates
	 */
	public String toString() {
		  return "x: " + this.x + " y: " + this.y;
	}

}
