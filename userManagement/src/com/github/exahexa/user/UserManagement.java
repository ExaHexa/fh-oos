/**
 * 
 */
package com.github.exahexa.user;

/**
 * @author exahexa
 *
 */
public interface UserManagement {
    void insertUser(User user);
    boolean userExist(User user);
}
