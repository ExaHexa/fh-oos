/**
 * 
 */
package com.github.exahexa.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.LinkedList;

import java.nio.file.FileAlreadyExistsException;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
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
	 * 
	 */
	private String filePath = "src/com/github/exahexa/user/db/";
	
	/**
	 * 
	 */
	private String fileName = "user.db";
	
	/**
	 * output stream for writing data
	 */
	private FileOutputStream fos;
	
	/**
	 * obtains input bytes from a file in a file system
	 */
	private FileInputStream fis;
	
	/**
	 * writes java objects to an output stream
	 */
	private ObjectOutputStream oos;
	
	/**
	 * deserializes objects previously written using an ObjectOutputStream
	 */
	private ObjectInputStream ois;
	
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
	 */
	@Override
	public void insertUser(User user) 
			                   throws IOException, ClassNotFoundException {
			deserialize();
	    if(user != null) {
			    if(!userList.contains(user)) {
	            userList.add(user);
	            serialize();
	        }
	    }
	    else {
	    	throw new IllegalArgumentException("user cannot be null!");
	    }
	    
	}
	
	/**
	 * Returns true if the list contains the specified element.
	 * @param user whose presence in the system is to be tested
	 * @return true if the system contains the specified user
	 */
	@Override
	public boolean userExist(User user) 
			                     throws IOException, ClassNotFoundException {  
			deserialize();
	    return userList.contains(user);
	
	}
	
	/**
	 * Removes the specified element from the user management system, 
	 * if it is present
	 * @param user to be removed from the user management system
	 */
	public void deleteUser(User user) 
			                   throws IOException, ClassNotFoundException  {
		  deserialize();
		  if(!userList.isEmpty()) {
		      userList.remove(user);	    
		      serialize();	
		  }
		  else {
		  	throw new NoSuchElementException("UserList is empty");
		  }
		  	    
	}
	
	/**
	 * 
	 * @throws FileAlreadyExistsException
	 */
	public void dbInitialization() 
							throws FileAlreadyExistsException, IOException{
	    File f = new File(filePath + fileName);
			if(!f.exists()) {
			    fos = new FileOutputStream(filePath + fileName);
	        oos = new ObjectOutputStream(fos);
	        oos.writeObject(new LinkedList<User>());
		      oos.close();
		      fos.close();
			}
			else {
			    throw new FileAlreadyExistsException("File already exists");
			}
	}
	
	/**
	 * 
	 * @throws FileAlreadyExistsException
	 */
	public void dbInitialization(String fileName) 
			        throws FileAlreadyExistsException, IOException{
			this.fileName = fileName;
      File f = new File(filePath + fileName);
		  if(!f.exists()) {
	        fos = new FileOutputStream(filePath + fileName);
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(new LinkedList<User>());
			    oos.close();
			    fos.close();
	    }
		  else {
		      throw new FileAlreadyExistsException("File already exists");
		  }
  }
	
	/**
	 * @throws IOException
	 */
	private void serialize() throws IOException{
	        fos = new FileOutputStream(filePath + fileName);
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(userList);
			    oos.close();
			    fos.close();
	}
	
	/**
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	private void deserialize() throws IOException, ClassNotFoundException{
	        fis = new FileInputStream(filePath + fileName);
		      ois = new ObjectInputStream(fis);
		      userList = (LinkedList<User>) ois.readObject();
		      ois.close();
		      fis.close();	        	    
	}
	

}
