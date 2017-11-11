/**
 * 
 */
package com.github.exahexa.user;

import java.util.LinkedList;

/**
 * @author exahexa
 *
 */
public class UserManagementAdmin implements UserManagement{
	
	private LinkedList<User> userList; 
	
	/**
	 * 
	 */
	public UserManagementAdmin() {
	    userList = new LinkedList<User>();
	}
	
	/**
	 * 
	 */
	@Override
	public void insertUser(User user) {
	    if(!userList.contains(user)) {
	      userList.add(user);
	    }
	}
	
	/**
	 * 
	 */
	@Override
	public boolean userExist(User user) {  
	   return userList.contains(user);
	}
	
	/**
	 * 
	 * @param user
	 */
	public void deleteUser(User user) {
	    	  userList.remove(user);		
	}

}
