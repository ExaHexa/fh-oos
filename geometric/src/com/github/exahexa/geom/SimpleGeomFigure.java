/**
 * 
 */
package com.github.exahexa.geom;

/**
 * A abstract superclass for simple geometric figures which share a point 
 * for representation 
 * @author exahexa
 * @version 1.0
 */
public abstract class SimpleGeomFigure {
    
	  /**
	   * A Point which contains the (X,Y) origin coordinates of the geometric
	   * Figure
	   */
	  public Point p;
    
	  /**
	   * Returns the X coordinate of the geometric Figure origin
	   * @return the X coordinate of the geometric Figure origin
	   */
    public int getX() {
        return this.p.getX();
    }
    
    /**
     * Returns the Y coordinate of the geometric Figure origin
     * @return the Y coordinate of the geometric Figure origin
     */
    public int getY() {
        return this.p.getY();
    }
    
    /**
     * Returns the size of the geometric Figure
     * @return the size of the geometric Figure
     */
    public abstract double getSize();
    
    /**
     * Translates this geometric Figure the indicated distance
     * @param dx the distance to move this geometric Figure along the X axis
     * @param dy the distance to move this geometric Figure along the Y axis
     */
    public void translate(int dx, int dy) {
        this.p.translate(dx, dy);	
    }
    
}
