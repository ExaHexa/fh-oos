/**
 * 
 */
package com.github.exahexa.user;

import java.util.LinkedList;

/**
 * 
 * @author exahexa
 * @version 1.0
 */
public class UserManagementAdmin implements UserManagement{
	
	/**
	 * Doubly-linked list implementation containing the elements 
	 * of the User collection
	 */
	private LinkedList<User> userList; 
	
	/**
	 * Constructs a new UserManagementAdmin, initializes linked list
	 * containing the elements of the User collection
	 */
	public UserManagementAdmin() {
	    userList = new LinkedList<User>();
	}
	
	/**
	 * Inserts a new user specified by the argument of the same name
	 * @param user a new user to add
	 * @throws UserNullReferenceException if the specified user is null 
	 * or the objects attributes
	 */
	@Override
	public void insertUser(User user) throws UserNullReferenceException {
		if(user == null || user.getPassWD() == null 
		  		            || user.getUserID() == null) {
          throw new UserNullReferenceException("Either user is null or not"
                                  + " all user attributes are initalized");
		  }
	    if(!userList.contains(user)) {
	        userList.add(user);
	    }
	}
	
	/**
	 * Returns true if the list contains the specified element.
	 * @param user whose presence in the system is to be tested
	 * @throws UserNullReferenceException if the specified object is null
	 * or the objects attributes
	 * @return true if the system contains the specified user
	 */
	@Override
	public boolean userExist(User user) throws UserNullReferenceException {  
		  if(user == null || user.getPassWD() == null 
		  		            || user.getUserID() == null) {
          throw new UserNullReferenceException("Either user is null or not"
          		                    + " all user attributes are initalized");
      }
	    return userList.contains(user);
	}
	
	/**
	 * Removes the specified element from the user management system, 
	 * if it is present
	 * @param user to be removed from the user management sys
	 * @throws UserNullReferenceException if the specified object is null 
	 * or the objects attributes
	 */
	public void deleteUser(User user) throws UserNullReferenceException {
	    if(user == null || user.getPassWD() == null 
                      || user.getUserID() == null) {
          throw new UserNullReferenceException("Either user is null or not"
                                  + " all user attributes are initalized");
      }
	    userList.remove(user);		
	}

}
