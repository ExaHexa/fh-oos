/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author exahexa
 *
 */
class SceneManager {
	
	/**
	 * 
	 */
	private static SceneManager sceneManager;
			
	private SceneManager() {	    
	}
	
	/**
	 * 
	 * @return
	 */
	public synchronized static SceneManager getInstance() {
			if(sceneManager == null) {
			    sceneManager = new SceneManager();
			}
			return sceneManager;
	}
	
	/**
	 * 
	 * @param stage
	 * @throws Exception
	 */
	void swToApplicationScene(Stage stage) throws Exception {
	    stage.setScene(new Scene(new FXMLLoader(getClass().
			                  getResource("application.fxml")).load()));
	}
	
	/**
	 * 
	 * @param stage
	 * @throws Exception
	 */
	void swToLoginScene(Stage stage) throws Exception {
	    stage.setScene(new Scene(new FXMLLoader(getClass().
          getResource("loginScene.fxml")).load()));
	}
	
	/**
	 * 
	 * @param stage
	 * @throws Exception
	 */
	void swToRegistrationScene(Stage stage) throws Exception {
	    stage.setScene(new Scene(new FXMLLoader(getClass().
          getResource("registrationScene.fxml")).load()));
	}


}
