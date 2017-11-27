/**
 * 
 */
package com.github.exahexa.user.test;


import com.github.exahexa.user.*;
/**
 * @author exahexa
 *
 */
@SuppressWarnings("unused")
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		UserManagementAdmin adm = new UserManagementAdmin();
		
		//create user objects for testing purposes
		User tUsr0 = new User("karl", "pwd".toCharArray());
		User tUsr1 = new User("karl", "pwd".toCharArray());
		User tUsr2 = new User("tim", "pwd".toCharArray());
		User tUsr3 = new User("hans", "pwd".toCharArray());
		User tUsr5 = new User(null, null);
		
	  //test equal method for user elements
		try {
		    System.out.println("Test equals method");
		    System.out.println(tUsr0.equals(tUsr1)+ "\n");
		    System.out.println(tUsr0.equals(tUsr2) + "\n");
		
		    //not working elements
	      System.out.println(tUsr4.equals(tUsr5) + "\n");
		}catch(NullPointerException e) {
		    System.err.println("User attributes are null");
		    e.printStackTrace();
		}
		
	  //test toString method
		try {
		    System.out.println("\n"+"Test toString method");
		    System.out.println(tUsr0.toString());
		    System.out.println(tUsr2.toString() + "\n");
		    
		    System.out.println(tUsr4.toString());	
		}catch(NullPointerException e) {
		    System.err.println("Some references may be null");
		    e.printStackTrace();
		}
		
		//
		try {
		     adm.deleteUser(tUsr0);
		}
		catch(NoSuchElementException e) {
		    System.err.println("the list seems to be empty");
		    e.printStackTrace();
		}
		
		//test insert for fully initialized user objects
		System.out.println("test insertUser Method");
		try {			
			  adm.insertUser(tUsr0);
		    adm.insertUser(tUsr1);
		    adm.insertUser(tUsr2);
		    adm.insertUser(tUsr3);
		}
		catch (UserNullReferenceException e) {
			System.err.println("UserNullReferenceException");
			e.printStackTrace();
		}
		
		//for not fully initialized user objects
		try {			
		    adm.insertUser(tUsr4);    	    	
	  }
	  catch (UserNullReferenceException e) {
		    System.err.println("UserNullReferenceException");
		    e.printStackTrace();
	  }
    
		//insert with null as parameter 
		try {			
	      adm.insertUser(null);    	    	
    }
    catch (UserNullReferenceException e) {
	      System.err.println("UserNullReferenceException");
	      e.printStackTrace();
    }
		
		//test userExist method
		try{
			  System.out.println("test userExist method");
			  System.out.println(tUsr0.toString() + " exist? " + adm.userExist(tUsr0));
		    adm.userExist(tUsr4);
		}
		catch (UserNullReferenceException e) {
		    System.err.println("User 4 still has null references .... ");
		    e.printStackTrace();
		}
	  
		//test deleteUser method
		try {
			  System.out.println("test deleteUser method");
			  adm.deleteUser(tUsr0);
		    adm.deleteUser(null);	
		}
		catch(UserNullReferenceException e) {
		    System.err.println("null");
		    e.printStackTrace();
		}
		catch(NoSuchElementException e) {
			  System.err.println("empty list?");
			  e.printStackTrace();
		}
		
		System.out.println(tUsr0.toString() + " exist? " + adm.userExist(tUsr0));
		
		try {
			adm.dbInitialization();
		}
		catch(IOException e) {
			System.err.println("blablablabalbal");
			e.printStackTrace();
		}
		
		*/
	}

}
