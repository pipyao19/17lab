package sample3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller3 {
    @FXML
    private Button ButtonOne;

    @FXML
    private Button ButtonTwo;

    @FXML
    private Button ButtonThree;

    @FXML
    private Label LabelForButtons;

    @FXML
    private void clickButton1(ActionEvent eventOne) { LabelForButtons.setText("Clicked Button1"); }

    @FXML
    private void clickButton2(ActionEvent eventTwo) { LabelForButtons.setText("Clicked Button2"); }

    @FXML
    private void clickButton3(ActionEvent eventThree) { LabelForButtons.setText("Clicked Button3"); }


}
