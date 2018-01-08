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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author exahexa
 *
 */
public class LoginSceneController {
		
		private boolean registration = false;
		private MainApp mainCtrl;
		
		public LoginSceneController() {
		}
		
		public LoginSceneController(MainApp mainCtrl) {
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
    private CheckBox registrationCheckBox;
    
    @FXML
    private CheckBox remoteCheckBox;

    @FXML
    private Button button_Exec;
    
    @FXML
    private Label error_label;
    
    /**
     * 
     * @param event
    */
    @FXML
    void action_CheckBox(ActionEvent event){
    	 	registration = registrationCheckBox.isSelected();	
    		if(registration) {
    				mainCtrl.newRegistration();
    		}
    }
    
    @FXML
    void action_Remote(ActionEvent event) {
        mainCtrl.setLocal(remoteCheckBox.isSelected());
    }
    
    /**
     * 
     * @param event
     * @throws Exception
     */
    @FXML
    void action_button(ActionEvent event) throws Exception{
    		if(userID.getText() !=  null && !userID.getText().isEmpty()
    				&& password.getText() != null && !password.getText().isEmpty()) {
    			try {
    				mainCtrl.userLogin( new User(userID.getText(), 
    														password.getText().toCharArray()));
    			}catch(IOException e) {
    				
    			}catch(ClassNotFoundException e) {
    				
    			}catch(UserDoesNotExistsException e) {
    				error_label.setText("User does not exist");
    			}
       	}
    }

	  @FXML
	  void initialize() {
	  	remoteCheckBox.setSelected(mainCtrl.getLocal());
		}
	  
	  void setMainCtrl(MainApp mainCtrl) {
	      this.mainCtrl = mainCtrl;
	  }


}
