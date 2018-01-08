/**
 * 
 */
package com.github.exahexa.prak4client;

import com.github.exahexa.prak4gemklassen.*;
import java.io.IOException;

/**
 * @author exahexa
 * @version 1.0
 */
public interface UserManagement {
	  
    void insertUser(User user) throws IOException, ClassNotFoundException;
    boolean userExist(User user) throws IOException, ClassNotFoundException;
}
