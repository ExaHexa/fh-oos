/**
 * 
 */
package com.github.exahexa.user.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.github.exahexa.user.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author exahexa
 *
 */
public class LoginSceneController {
		
		private boolean registration = false;
		
		public LoginSceneController() {
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
    private Button button_Exec;
    

    @FXML
    void action_CheckBox(ActionEvent event) {
    		registration = registrationCheckBox.isSelected();
    		System.out.println("new registration? " + registration);
    }

    @FXML
    void action_button(ActionEvent event) throws Exception{
    		if(userID.getText() !=  null && !userID.getText().isEmpty()
    				&& password.getText() != null && !password.getText().isEmpty()) {
    				System.out.println(new User(userID.getText(), 
    														password.getText().toCharArray()).toString());
    				SceneManager.getInstance().swToRegistrationScene(
        	  		((Stage)((Node)event.getSource()).getScene().getWindow()));
    		}
    }

	  @FXML
	  void initialize() {
		}


}
