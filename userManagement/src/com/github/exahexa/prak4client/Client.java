/**
 * 
 */
package com.github.exahexa.prak4client;

import java.io.IOException;

/**
 * @author exahexa
 *
 */
public class Client {
	
	private ClientOrb clientOrb;

	/**
	 * 
	 */
	public Client() throws IOException{
		  clientOrb = new ClientOrb();
	}
	
	public ClientOrb getClientOrb() {
		return clientOrb;
	}

}
