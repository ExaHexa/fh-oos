/**
 * 
 */
package com.github.exahexa.user.test;

import java.util.NoSuchElementException;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
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
public class TestUserManagementAdmin {

	UserManagementAdmin adm;
	User u;
	User u2;
	
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
	    adm.dbInitialization();
	    u = new User("uid", "pwd".toCharArray());
	    u2 = new User("uid2", "pwdd".toCharArray());
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
	public void testBasicUserAdmOperations() {
			try {
	        adm.insertUser(u);
	        Assert.assertTrue(adm.userExist(u));
	        Assert.assertFalse(adm.userExist(u2));
	        adm.deleteUser(u);
	        Assert.assertFalse(adm.userExist(u));
			}
			catch(ClassNotFoundException e) {
			    e.printStackTrace();
			    fail();
			}
			catch(IOException e) {
					e.printStackTrace();
					fail();
			}
	}
	
	@Test (expected = NoSuchElementException.class)
	public void testDeleteUserException() {
	    try {
	        adm.deleteUser(u);
	    }
	    catch(ClassNotFoundException e) {
		      e.printStackTrace();
		  }
		  catch(IOException e) {
				  e.printStackTrace();
		  }
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInsertUserException() {
	    try {
		      adm.insertUser(null);
	    }
	    catch(ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    catch(IOException e) {
			    e.printStackTrace();
	    }
	}
	
	@Test
	public void testdbInitialization() {
	    try {
	        adm.dbInitialization();
	        fail();
	    }
	    catch(FileAlreadyExistsException e) {
        e.printStackTrace();
	    }	
	    catch(IOException e) {
	    	e.printStackTrace();
	    	fail();
	    }
	    	
	}
	

}
