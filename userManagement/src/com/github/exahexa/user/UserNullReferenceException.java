/**
 * 
 */
package com.github.exahexa.user;

/**
 * @author exahexa
 * @verion 1.0
 */
public class UserNullReferenceException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4510715743111829923L;

	/**
	 * Constructs a new exception with null as its message
	 */
	public UserNullReferenceException() {
	    super();
	}
  
	/**
	 * Constructs a new exception with the specified message s
	 * @param s the specified message
	 */
  public UserNullReferenceException(String s) {
	    super(s);	
	}

}
