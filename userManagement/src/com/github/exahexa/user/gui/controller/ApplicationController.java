/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author exahexa
 *
 */
public class ApplicationController {
		
	  
	  public ApplicationController() {
	  }
		
		
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Label labelTest;
    
    @FXML 
    private Button cancel_Button;
    
    /**
     * 
     * @param event
     * @throws Exception
     */
    @FXML
    void buttonAction(ActionEvent event) throws Exception { 	
    		System.out.println("Eine Meldung");
    	  SceneManager.getInstance().swToLoginScene(
    	  		((Stage)((Node)event.getSource()).getScene().getWindow()));
    }
		
    @FXML
    void initialize() {

    }

}
