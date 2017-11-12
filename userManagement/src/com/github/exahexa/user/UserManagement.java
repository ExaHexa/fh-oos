/**
 * 
 */
package com.github.exahexa.user;

/**
 * @author exahexa
 * @version 1.0
 */
public interface UserManagement {
	  
    void insertUser(User user);
    boolean userExist(User user);
}
