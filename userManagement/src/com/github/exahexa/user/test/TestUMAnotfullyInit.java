/**
 * 
 */
package com.github.exahexa.user.test;


import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.exahexa.user.User;
import com.github.exahexa.user.UserManagementAdmin;


/**
 * @author exahexa
 *
 */
public class TestUMAnotfullyInit {

	UserManagementAdmin adm;
	User u;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	    adm = new UserManagementAdmin();
	    u = new User("uid", "pwd".toCharArray());	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		File f = new File("src/com/github/exahexa/user/db/user.db");
		f.delete();
	}

	@Test
	public void testInsertUser() {
		//insert
		try {
		    adm.insertUser(u);		
		    fail();
		}
		catch(ClassNotFoundException e) {
	      e.printStackTrace();
	      fail();
	  }
	  catch(IOException e) {
			  e.printStackTrace();
	  }
	}
	
	@Test
	public void testUserExist() {
		//exists
		  try {		
	        Assert.assertTrue(adm.userExist(u));
	        fail();
		  }
		  catch(ClassNotFoundException e) {
          e.printStackTrace();
          fail();
      }
      catch(IOException e) {
		      e.printStackTrace();
      }
	}
	
	@Test
	public void testUserDelete() {
	    try {
		      adm.deleteUser(u);
	        fail();
	    }
	    catch(ClassNotFoundException e) {
          e.printStackTrace();
          fail();
      }
      catch(IOException e) {
		      e.printStackTrace();
      }
	
	}
	
	
	@Test
	public void dbInit() {
		  try {
	        adm.dbInitialization("///asdal/ksfnlasf");
	        fail();
		  }
	    catch(IOException e) {
			    e.printStackTrace();
	    }
	}
	


}
