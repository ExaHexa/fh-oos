/**
 * 
 */
package com.github.exahexa.user.test;

import java.util.NoSuchElementException;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

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
	    adm.insertUser(u);
	    Assert.assertTrue(adm.userExist(u));
	    Assert.assertFalse(adm.userExist(u2));
	    adm.deleteUser(u);
	    Assert.assertFalse(adm.userExist(u));
	}
	
	@Test (expected = NoSuchElementException.class)
	public void testDeleteUserException() {
	    adm.deleteUser(u);
	}
	
	@Test
	public void testdbInitialization() {
	    try {
	        adm.dbInitialization();
	        fail("blabla");
	    }
	    catch(FileAlreadyExistsException e) {
	        e.printStackTrace();
	    }		
	}
	

}
