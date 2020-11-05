package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuView extends Stage{
		public MenuView() {
				try {
					Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
					Scene scene = new Scene(root,1024,600);
					this.setScene(scene);
					this.setResizable(false);
					this.setFullScreen(true);
					this.show();	
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		}
}
