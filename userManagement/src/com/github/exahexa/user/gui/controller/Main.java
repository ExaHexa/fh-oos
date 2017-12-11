/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author exahexa
 *
 */
public class Main extends Application {
	

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage stage) throws Exception {
		  SceneManager.getInstance().swToApplicationScene(stage);
      stage.show();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
