/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxprojectatm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Yofika Audrey
 */
public class DesignController implements Initializable {
       
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    
    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn6;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton btnC;

    @FXML
    private JFXButton btn0;

    @FXML
    private JFXButton btnOK;

    @FXML
    private JFXPasswordField pass;

    @FXML
    void tekan0(ActionEvent event) {
 pin += "0";
pass.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin += "1";
        pass.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
 pin += "2";
        pass.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
 pin += "3";
        pass.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
 pin += "4";
        pass.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
 pin += "5";
        pass.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
 pin += "6";
        pass.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
 pin += "7";
        pass.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
 pin += "8";
        pass.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
 pin += "9";
        pass.setText(pin);
    }

    @FXML
    void tekanC(ActionEvent event) {
 pin = "";
        pass.setText(pin);
    }      

    @FXML
    private void tekanOK(ActionEvent event) {
        if (pin.equals(PIN)){
            try {
                //hide this current window (if this is what you want)
                ((Node)(event.getSource())).getScene().getWindow().hide();
                //Load the new fxml
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("menuawal.fxml"));
                Scene scene = new Scene (fxmlLoader.load(), 830, 450);
                //create new stage (window), then set the new scene
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }
        }else {
            kesempatan -= 1;
           JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan + "kesempatan lagi!");
           pass.setText("");
           pin="";
           if (kesempatan == 0) {
               System.exit(0);
           }
            
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     }
    
}
