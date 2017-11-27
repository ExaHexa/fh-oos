/**
 * 
 */
package com.github.exahexa.user.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.exahexa.user.User;

/**
 * @author exahexa
 *
 */
public class TestUser {
	
	User tUsr0;
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
		tUsr0 = new User("uid", "pwd".toCharArray());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * 
	 */
	@Test
	public void testEqualsUser() {
			User tUsr1 = new User("uid", "pwd".toCharArray());
			User tUsr2 = new User("uidd", "pwd".toCharArray());
	    Assert.assertEquals(tUsr0, tUsr1);
	    Assert.assertNotSame(tUsr0, tUsr2);
	    Assert.assertNotSame(tUsr0, null);
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testConstructorNullUser() {
	    @SuppressWarnings("unused")
			User tUsr1 = new User(null, null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testConstructorEmptyUser() {
      @SuppressWarnings("unused")
		  User tUsr2 = new User("", "".toCharArray());
	}
	
	/**
	 * 
	 */
	@Test 
	public void testSetUserID() {
	    tUsr0.setUserID("hans");
	    Assert.assertTrue("hans".equals(tUsr0.getUserID()));
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetUserIDException() {
	    tUsr0.setUserID("");
	    tUsr0.setUserID(null);		
	}
	
	/**
	 * 
	 */
	@Test
	public void testSetPassWD() {
	    tUsr0.setPassWd("pwddd".toCharArray());
	    Assert.assertTrue("pwddd".equals(
	                       String.copyValueOf(tUsr0.getPassWD())));
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetPassWDException() {
	    tUsr0.setPassWd("".toCharArray());
	    tUsr0.setPassWd(null);		
	}
	
	/**
	 * 
	 */
	@Test 
	public void testToString() {
	    String toString = tUsr0.toString();
	    Assert.assertTrue(toString.matches(".*@\\d*.*"));
	    Assert.assertTrue(toString.matches(".*UserID: uid.*"));
	    Assert.assertTrue(toString.matches(".*PassWD: pwd.*"));
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetUserID() {
	    Assert.assertTrue("uid".equals(tUsr0.getUserID()));
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetPassWD() {
      Assert.assertTrue("pwd".equals( 
      		              String.copyValueOf(tUsr0.getPassWD()) ));
	}
	
}
