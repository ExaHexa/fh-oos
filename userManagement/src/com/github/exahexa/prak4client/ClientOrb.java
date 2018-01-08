/**
 * 
 */
package com.github.exahexa.prak4client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.github.exahexa.prak4gemklassen.*;

/**
 * @author exahexa
 *
 */
public class ClientOrb implements UserManagement{
	
	/**
	 * 
	 */
	public ClientOrb() throws IOException{
			
	}

	@Override
	public void insertUser(User user) throws IOException, ClassNotFoundException {
		try(Socket server = new Socket ( "localhost", 4711 )){
		    try(ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
		    		ObjectInputStream is = new ObjectInputStream(server.getInputStream()); ){
		
		    	out.write(1);
		    	out.writeObject(user);
		    }
		}
		
	}

	@Override
	public boolean userExist(User user)
			throws IOException, ClassNotFoundException {
			try(Socket server = new Socket ( "localhost", 4711 )){
					try( ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
							 ObjectInputStream is = new ObjectInputStream(server.getInputStream()); ){
					
						out.write(2);
						out.writeObject(user);
						/**
						if(is.readObject() instanceof ClassNotFoundException) {
							throw (ClassNotFoundException) is.readObject();
						}
						*/
						return is.readBoolean();
					}
			}
	}
	
	

}
