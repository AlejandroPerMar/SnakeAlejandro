/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeap.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author aleja
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Canvas cvEscenario;
    @FXML
    private Button btnInciarPausar;
    @FXML
    private Button btnCrearPartida;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void moverSnake(KeyEvent event) {
    }

}
