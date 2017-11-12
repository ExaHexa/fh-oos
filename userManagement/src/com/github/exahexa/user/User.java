/**
 * 
 */
package com.github.exahexa.user;

/**
 * A user represented by a user id and its password
 * @author exahexa
 * @version 1.0 
 */
public class User {
	
	/**
	 * The user id of the user
	 */
  private String userID;
  
  /**
   * the user password stored as char array
   */
  private char[] passWD;
  
  /**
   * Constructs a new User whose userID and passWD is null
   */  
  public User() {
  	
  }

  /**
   * Constructs a new User whose user ID and passWD are specified by the 
   * arguments of the same name
   * @param userID
   * @param passWD
   */
  public User(String userID, char[] passWD) {
      this.userID = userID;
      this.passWD = passWD;
  }
  
  /**
   * Sets the userID specified by the argument of the same name
   * @param userID
   */
  public void setUserID(String userID) {
      this.userID = userID;
  }
  
  /**
   * Sets the user password specified by the argument passWD
   * @param passWD
   */
  public void setPassWd(char[] passWD) {
      this.passWD = passWD;
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
  public boolean equals(Object obj) {  
      if(obj instanceof User) {
        return String.copyValueOf( ((User) obj).getPassWD() ).equals
        		                       (String.copyValueOf(this.passWD)) 
        		          && ((User) obj).getUserID().equals(this.userID);
      }
  	  return false;
  }
  
  /**
   * Returns a string representation of the object.
   * @return a string representing the user
   */
  public String toString() {
      return getClass().getName() + "@" + Integer.toHexString(hashCode()) 
                                 + " UserID: " + this.userID + " PassWD: " 
      		                              + String.copyValueOf(this.passWD);
  }

}
