package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button HourButton;
    
    @FXML
    private GridPane menuStage;

    @FXML
    void handleHourButtonAction(ActionEvent event) {
			Stage stage = (Stage) menuStage.getScene().getWindow();
    		new HourView(stage);  		
    }

}