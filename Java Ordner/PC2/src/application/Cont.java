package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Cont {
	
	
	
	
	
	@FXML
	Button button;
	
	public void show(ActionEvent event) {
		
		System.out.println(button.isPressed());
		
	}

}
