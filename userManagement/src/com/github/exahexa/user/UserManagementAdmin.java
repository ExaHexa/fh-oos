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
	    userList.add(user);	
	}
	
	/**
	 * 
	 */
	@Override
	public boolean userExist(User user) {  
		return true;
	}
	
	
	public void deleteUser(User user) {
		
	}

}
