package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {
	
	@FXML private WebView webView;
	private WebEngine engine;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		engine = webView.getEngine();  //this will load the engine for the WebView
	}
	
	public void btn1(ActionEvent event)
	{
		engine.load("https://www.google.com");
	}
	public void btn2(ActionEvent event)
	{
		engine.load("https://www.javatpoint.com/javafx-tutorial");
	}
	public void btn3(ActionEvent event)
	{
		engine.load("https://www.youtube.com");
	}
	public void btn4(ActionEvent event)
	{
		engine.load("https://www.wikipedia.com");
		
	}
	
	public void CloseApp(ActionEvent event)
	{
		Platform.exit();  //exits from platform JavaFX
		System.exit(0);  //closes your app
	}

}    
 