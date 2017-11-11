/**
 * 
 */
package com.github.exahexa.user.test;

import com.github.exahexa.user.*;
/**
 * @author exahexa
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManagementAdmin adm = new UserManagementAdmin();
		
		//test equals method
		User eUser = new User("karl", "pwd".toCharArray());
		User e2User = new User("karl", "pwd".toCharArray());
		User e3User = new User("tim", "pwd".toCharArray());
		System.out.println("check two equal user");
		System.out.println(eUser.equals(e2User));
		System.out.println("check two unequal user");
		System.out.println(eUser.equals(e3User));
		//test toString method
		System.out.println("test toString method");
		System.out.println(eUser.toString());
		System.out.println(e3User.toString());
		
		//
		adm.insertUser(eUser);
		adm.insertUser(e2User);
		adm.insertUser(e3User);
		System.out.println(adm.userExist(e3User));
		adm.deleteUser(e3User);
		System.out.println(adm.userExist(e3User));
	}

}
