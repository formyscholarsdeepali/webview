package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class function implements Initializable{
	@FXML
	private WebView w;
	private WebEngine e;
		
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		e=w.getEngine();
		// TODO Auto-generated method stub
		
	}
	@FXML
	public void show(ActionEvent f)
	{
		e.load("https://www.google.com");
	}
	@FXML
	public void show1(ActionEvent f)
	{
		e.load("https://www.facebook.com");
	}

}
