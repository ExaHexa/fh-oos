/**
 * 
 */
package com.github.exahexa.user;

/**
 * @author exahexa
 *
 */
public class User {
	
  private String userID;
  private char[] passWD;
  
  /**
   * 
   */
  public User() {
  	
  }
  
  /**
   * 
   * @param userID
   * @param passWD
   */
  public User(String userID, char[] passWD) {
      this.userID = userID;
      this.passWD = passWD;
  }
  
  /**
   * 
   * @param userID
   */
  public void setUserID(String userID) {
      this.userID = userID;
  }
  
  /**
   * 
   * @param passWD
   */
  public void setPassWd(char[] passWD) {
      this.passWD = passWD;
  }
  
  /**
   * 
   * @return
   */
  public String getUserID() {
      return this.userID;
  }
  
  /**
   * 
   * @return
   */
  public char[] getPassWD() {
      return this.passWD;
  }
  
  /**
   * @param
   * @return
   */
  public boolean equals(Object obj) {  
      if(obj instanceof User) {
        return String.copyValueOf( ((User) obj).getPassWD() ).equals(String.copyValueOf(this.passWD)) 
        		   && ((User) obj).getUserID().equals(this.userID);
      }
  	  return false;
  }
  
  public String toString() {
  	return "UserID: " + this.userID + " PassWD: " + String.copyValueOf(this.passWD);
  }

}
