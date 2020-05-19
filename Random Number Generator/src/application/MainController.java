package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.*;

public class MainController {
	
	@FXML   //will tag Main.fxml file with the label
	
	private Label myMesssage;
	
	public void generateRandom(ActionEvent event) {  //this is the function which will be called whenever the button will be clicked
		
		Random rand = new Random();
		int myrand = rand.nextInt(1000) + 1;  //generates random number between 1000 and above 1 since 1 is added
		myMesssage.setText(Integer.toString(myrand));
		
		//System.out.println(Integer.toString(myrand));  //to print random number to console
		
		
	}

}
