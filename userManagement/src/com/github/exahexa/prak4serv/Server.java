/**
 * 
 */
package com.github.exahexa.prak4serv;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 * @author exahexa
 *
 */
public class Server {

	/**
	 * 
	 */
	public Server() {
			UserManagementAdmin adm = new UserManagementAdmin();
			
			try {
				ServerOrb so = new ServerOrb(adm);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
	
}
