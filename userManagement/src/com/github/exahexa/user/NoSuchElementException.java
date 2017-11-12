/**
 * 
 */
package com.github.exahexa.user;

/**
 * 
 * @author exahexa
 * @version 1.0
 */
public class NoSuchElementException extends Exception {
	
	/**
	 * Constructs a new exception with null as its message
	 */
	public NoSuchElementException() {
	    super();	
	}
	
	/**
	 * Constructs a new exception with the specified message s
	 * @param s string with the specified message
	 */
	public NoSuchElementException(String s) {
	    super(s);
	}
	
	/**
	 * Constructs a new exception with the specified cause
	 * @param cause the cause
	 */
	public NoSuchElementException(Throwable cause) {
      super(cause);		
	}
	
	/**
	 * Constructs a new exception with the specified message and cause
	 * @param s the specified message
	 * @param cause the cause
	 */
	public NoSuchElementException(String s, Throwable cause) {
    super(s, cause);		
}
	

}
