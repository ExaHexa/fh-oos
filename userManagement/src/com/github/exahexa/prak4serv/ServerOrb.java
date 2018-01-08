package com.github.exahexa.prak4serv;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.github.exahexa.prak4gemklassen.User;

public class ServerOrb {
	
	
	public ServerOrb(UserManagementAdmin adm) throws IOException, ClassNotFoundException{
				try(ServerSocket server = new ServerSocket( 4711 )){
					while(true) {
					  Socket client = server.accept();
					  try( ObjectInputStream in = new ObjectInputStream(client.getInputStream());
					  		 ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());){
				    
					    int method = in.read();
							User user = (User) in.readObject();
					    if(method == 1) {
										adm.insertUser(user);
							}
					    if(method == 2) {
									out.writeBoolean(adm.userExist(user));
					    }
					    
					    out.flush();
					    
						}
					}
						
				}
	}

}
