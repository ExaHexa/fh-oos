/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.github.exahexa.prak4gemklassen.*;

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
	
	private MainApp mainCtrl;
	
	public RegistrationSceneController() {
		
	}
	
	public RegistrationSceneController(MainApp mainCtrl) {
	    this.mainCtrl = mainCtrl;
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
  	    	try {
  				  mainCtrl.newUser(new User(userID.getText(), 
							                 password.getText().toCharArray()));
  	    	}catch(IOException e) {
    				
    			}catch(ClassNotFoundException e) {
    				
    			}
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
  
  
  void setMainCtrl(MainApp mainCtrl) {
      this.mainCtrl = mainCtrl;
  }
  
  
}
