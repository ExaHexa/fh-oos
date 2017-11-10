/**
 * 
 */
package com.github.exahexa.geom;

/**
 * A rectangle represented by a point (x,y) in coordinate space 
 * and its specified width and height.
 * @author exahexa
 * @version 1.0
 */
public class Rechteck extends SimpleGeomFigure{
	
	  /**
	   * A Point which contains the (X,Y) origin coordinates of the Rectangle
	   */
   	public Point p;
   	
   	/**
   	 * The width of the Rectangle
   	 */
   	public int width;
   	
   	/**
   	 * The height of the Rectangle
   	 */
   	public int height;
    
   	/**
   	 * Constructs new Rectangle whose origin is at (0,0), 
   	 * and whose width and height are both zero.
   	 */
    public Rechteck() {
        this.p = new Point();
        this.width = 0;
        this.height = 0;
    }
    
    /**
     * Constructs new Rectangle whose origin is at the specified Point p, 
     * and whose width and height are both zero.
     * @param p a Point that is the origin of the Rectangle
     */
    public Rechteck(Point p) {
        this.p = p;
        this.width = 0;
        this.height = 0;
    }
    
    /**
     * Constructs new Rectangle whose origin is at (0,0),
     * and whose width and height are specified by the arguments of the 
     * same name. 
     * @param width the specified width
     * @param height the specified height
     */
    public Rechteck(int width, int height) {
    	  this.p = new Point();
    	  this.width = width;
    	  this.height = height;
    }
    
    /**
     * Constructs new Rectangle whose origin is the specified Point p,
     * and whose width and height are specified by the arguments of the 
     * same name
     * @param p a Point that is the origin of the Rectangle
     * @param width the specified width
     * @param height the specified height
     */
    public Rechteck(Point p, int width, int height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Constructs new Rectangle whose origin is specified by the arguments
     * (x,y), and whose width and height are specified by the arguments of the 
     * same name.
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @param width the specified width
     * @param height the specified height
     */
    public Rechteck(int x, int y, int width, int height) {
        this.p = new Point(x, y);
        this.width = width;
        this.height = height;
    }
    
    /**
     * Constructs new Rectangle, initialized to match the values of the
     * specified Rectangle r. 
     * @param r the Rectangle from which to copy initial values to a newly constructed Rectangle 
     */
    public Rechteck(Rechteck r) {
        this.p = r.p;
        this.width = r.width;
        this.height = r.height;
    }
        
    /**
     * Returns the width of the Rectangle
     * @return the width of the Rectangle
     */
    public int getWidth() {
        return this.width;
    }
    
     /**
      * Returns the height of the Rectangle
      * @return the height of the Rectangle
      */
    public int getHeight() {
        return this.height;
    }
    
    /**
     * Returns the size of the Rectangle
     * @return the size of the Rectangle
     */
    @Override
    public double getSize() {
        return (width*height);
    }
    
    /**
     * Sets the size of this Rectangle to the specified width and height
     * @param width the new width for this Rectangle
     * @param height the new height for this Rectangle
     */
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
        
    /**
     * Checks whether two Rectangles are equal
     * @param r the Rectangle to compare with this Rectangle
     * @return true if Rectangles are equal; false otherwise
     */
    public boolean equals(Rechteck r) {
        return (this.p.equals(r.p) && this.width == r.width && this.height == r.height);
    }
    
    /**
     * Creates and returns a copy of this instance
     * @return a clone of this instance
     */
    public Rechteck clone() {
        return new Rechteck(this.p, this.width, this.height);
    }
    
    /**
     * Returns a String representing this Rectangle and its values
     * @return a String representing this Rectangle object's origin coordinates and size values.
     */
    @Override
    public String toString() {
        return p.toString() + " Width: " + this.width + 
    			     " Height: " + this.height;
    }
    
}
