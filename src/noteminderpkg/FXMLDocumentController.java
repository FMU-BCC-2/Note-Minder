/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noteminderpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author yaraz
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML private Button button13;

    @FXML private Button button11;

    @FXML private Button button1;
    
    

    @FXML
    void TelaNotas(ActionEvent event) throws IOException {
        Parent tela2 = FXMLLoader.load(getClass().getResource("Notas.fxml"));
        Scene teladois = new Scene(tela2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(teladois);
        window.show();
        
    }

    @FXML
    void TelaAgenda(ActionEvent event) throws IOException {
        Parent tela2 = FXMLLoader.load(getClass().getResource("Agenda.fxml"));
        Scene teladois = new Scene(tela2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(teladois);
        window.show();
    }

    @FXML
    void TelaConfiguracoes(ActionEvent event) throws IOException {
        Parent tela2 = FXMLLoader.load(getClass().getResource("Config.fxml"));
        Scene teladois = new Scene(tela2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(teladois);
        window.show();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}