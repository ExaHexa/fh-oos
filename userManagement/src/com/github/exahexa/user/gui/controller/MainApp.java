/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileAlreadyExistsException;

import com.github.exahexa.prak4client.Client;
import com.github.exahexa.prak4gemklassen.*;
import com.github.exahexa.prak4client.UserManagementAdmin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author exahexa
 *
 */
public class MainApp extends Application{
	
	private UserManagementAdmin adm;
	private boolean local = false;
	private Stage stage;
	private Client client;
	
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
			this.stage = primaryStage;
		  adm = new UserManagementAdmin();
		  client = new Client();
		  System.out.println("Press 0 to initialize new database");
		  BufferedReader din = new BufferedReader(
		  		new InputStreamReader(System.in));
		  int dbInitialisieren = Integer.parseInt(din.readLine());
		  System.out.println("name for database");
		  BufferedReader dinS = new BufferedReader(new InputStreamReader(System.in));
		  String newDb = dinS.readLine();
		  
		  if(dbInitialisieren == 0) {
		  	try {
		  	    adm.dbInitialization(newDb);
		  	}catch(FileAlreadyExistsException e) {
		  		System.out.println("File alrdy exists");
		  	}    
		  }		  
		  
		  primaryStage.setScene(swToLoginScene());
      primaryStage.show();

	}
	
	/**
	 * 	
	 * @param local
	 */
	void setLocal(boolean local) {
		this.local = local;
	}
	
	/**
	 * 
	 * @return
	 */
	boolean getLocal() {
		return local;
	}
	
	/**
	 * 
	 */
	void newRegistration() {
			try {
			   stage.setScene(swToRegistrationScene());
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * 
	 * @param user
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	void newUser(User user) throws IOException, ClassNotFoundException{
			if(local) {
					client.getClientOrb().insertUser(user);
			}else {
				adm.insertUser(user);
			}
			stage.setScene(swToLoginScene());
	
				  
				  
	}
	
	/**
	 * 
	 * @param user
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws UserDoesNotExistsException
	 */
	void userLogin(User user) throws IOException, ClassNotFoundException,
																	          UserDoesNotExistsException{
		if(local) {
			if(client.getClientOrb().userExist(user)) {
					  stage.setScene(swToApplicationScene()); 	
			}else {
				throw new UserDoesNotExistsException();
			}
		}
		else {
			if(adm.userExist(user)) {
					  stage.setScene(swToApplicationScene());
			}else {
				throw new UserDoesNotExistsException();
			}
		}
		
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	private Scene swToLoginScene() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().
                        getResource("loginScene.fxml"));
    loader.setController(new LoginSceneController(this));
    return new Scene(loader.load());
  }
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
  private Scene swToRegistrationScene() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().
			                  getResource("registrationScene.fxml"));
    loader.setController(new RegistrationSceneController(this));
    return new Scene(loader.load());		
  }
  
  /**
   * 
   * @return
   * @throws IOException
   */
  private Scene swToApplicationScene() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().
			                  getResource("application.fxml"));
    loader.setController(new ApplicationController(this));
    return new Scene(loader.load());		
  }

}
