package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class HourView extends Stage{
	
	public HourView(Stage stage) {
		try {
			Parent root= FXMLLoader.load(getClass().getResource("HourView.fxml"));
			stage.getScene().setRoot(root);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}
