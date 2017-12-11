/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.github.exahexa.user.User;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * @author exahexa
 *
 */
public class RegistrationSceneController {
	
	public RegistrationSceneController() {
		
	}
	
	@FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private PasswordField password;

  @FXML
  private TextField userID;

  @FXML
  private Button button_Exec;

  @FXML
  private PasswordField password_c;
  
  @FXML
  private Label pw_com_label;
  
  /**
   * 
   * @param event
   */
  @FXML
  void action_Button(ActionEvent event) {
  	if(userID.getText() != null && !userID.getText().isEmpty()
  		 && password.getText() != null && !password.getText().isEmpty()
  		 && password_c.getText() != null && !password_c.getText().isEmpty()) {
  			
  	    if(password.getText().equals(password_c.getText())) {
  				  System.out.println(new User(userID.getText(), 
							                 password.getText().toCharArray()).toString());
  				  Platform.exit();
  			}
  	    else {
  	    	System.out.println("nicht gleich!");
  	    }
  	}

  }
  
  /**
   * 
   * @param event
   */
  @FXML
  void com_pw(KeyEvent event) {
  		comparePW();
  }
  /**
   * 
   * @param event
   */
  @FXML 
  void keyP(KeyEvent event){
  	if(event.getCode() == KeyCode.BACK_SPACE){
  	    comparePW();
  	}
  
  }
  
  /**
   * 
   */
  private void comparePW() {
  	if(password != null && !password.getText().isEmpty()
				&& password_c != null && !password_c.getText().isEmpty()) {
		    if(!password.getText().equals(password_c.getText())) {
		  	    password_c.setStyle("-fx-border-color: red;");
		  		  pw_com_label.setStyle("-fx-text-fill: red;");
		  		  pw_com_label.setText("passwort != wiederholung");
		    }
		    else {
		  	   password_c.setStyle(null);
		  	   pw_com_label.setText("");
		    }
			
		}
  	
  }
  
  
  
  @FXML
  void initialize() {

  }

}
