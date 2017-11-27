/**
 * 
 */
package com.github.exahexa.user;

import java.io.Serializable;

/**
 * A user represented by a user id and its password
 * @author exahexa
 * @version 1.0 
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5684175226557146599L;

	/**
	 * The user id of the user
	 */
  private String userID;
  
  /**
   * the user password stored as char array
   */
  private char[] passWD;
  
  /**
   * Constructs a new User whose user ID and passWD are specified by the 
   * arguments of the same name
   * Notice user attributes can neither be null nor empty
   * @param userID
   * @param passWD
   * @throws IllegalArgumentException if either userID or passWD is null or empty
   */
  public User(String userID, char[] passWD) {
      if(userID != null && passWD != null 
      	 && userID.length() != 0 && passWD.length != 0) {
          this.userID = userID;
          this.passWD = passWD;	
      }
      else {
      	throw new IllegalArgumentException("User attributes can neither "
      			                                       + "be null nor empty!");
      }
      
  }
  
  /**
   * Sets the userID specified by the argument of the same name
   * @param userID
   * @throws IllegalArgumentException if userID is null or empty
   */
  public void setUserID(String userID) {
      if(userID != null && userID.length() != 0) {
      	this.userID = userID;	
      }
      else {
      	throw new IllegalArgumentException("userID can neither be null "
      			                                              + "nor empty!");
      }
      
  }
  
  /**
   * Sets the user password specified by the argument passWD
   * Notice passWD can neither be null nor empty
   * @param passWD
   * @throws IllegalArgumentException if passWD is null or empty
   */
  public void setPassWd(char[] passWD) {
      if(passWD != null && passWD.length != 0) {
      	this.passWD = passWD;	
      }
      else {
      	throw new IllegalArgumentException("passWD can neither be null "
      			                                             + "nor empty!");
      }
      
  }
  
  /**
   * Returns the user id of the user
   * @return the user  id of the user
   */
  public String getUserID() {
      return this.userID;
  }
  
  /**
   * Returns the password of the user
   * @return the password of the user
   */
  public char[] getPassWD() {
      return this.passWD;
  }
  
  /**
   * Checks whether two users are equal
   * @param the reference object with which to compare
   * @return true if this user is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object obj) {  
        return (obj != null) && (obj instanceof User) 
        		   && String.copyValueOf( ((User) obj).getPassWD() ).equals
        		                          (String.copyValueOf(this.passWD)) 
        		            && ((User) obj).getUserID().equals(this.userID);
      
  }
  
  /**
   * Returns a string representation of the object.
   * @return a string representing the user
   */
  @Override
  public String toString() {
      return getClass().getName() + "@" + Integer.toHexString(hashCode()) 
                                 + " UserID: " + this.userID + " PassWD: " 
      		                              + String.copyValueOf(this.passWD);
  }

}
