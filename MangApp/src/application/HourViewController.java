package application;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class HourViewController implements Initializable{

    @FXML
    private Label Time;

    @FXML
    private Label Date;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    initClock();
	}
	
	private void initClock() {
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        DateTimeFormatter formatterdate = DateTimeFormatter.ofPattern("EEEE dd LLLL yyyy");
	        Time.setText(LocalDateTime.now().format(formatter));
	        Date.setText(LocalDateTime.now().format(formatterdate));
	    }), new KeyFrame(Duration.seconds(1)));
	    clock.setCycleCount(Animation.INDEFINITE);
	    clock.play();
	}

}
