package HangMan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    int i = 0;
    @FXML private Label onOffLabel;
    @FXML private Button toggleButton, chargeButton;
    @FXML private TextField chargeTextField;
    private LightBulb lightBulb;

    public Controller(){
        lightBulb = new LightBulb();
    }

    @FXML
    public void initialize(){
        onOffLabel.setText(lightBulb.getCurrentStatus());
        onOffLabel.setStyle("-fx-font-size: 48px");
    }

    @FXML
    public void handleChargeButtonOnClick(ActionEvent actionEvent){
        String input = chargeTextField.getText();
        System.out.println(input);
        lightBulb.charge(Integer.parseInt(input));
        chargeTextField.setText("");
    }

    // building even
    // handle + node name + node type + actoin type
    @FXML
    public void handleToggleButtonOnCLick(ActionEvent actionEvent){
        System.out.println("Button is Clicked");
        lightBulb.toggleSwitch();
        onOffLabel.setText(lightBulb.getCurrentStatus());
    }

}
