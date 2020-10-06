/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testee;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author yaraz
 */
public class NotasController implements Initializable {
    @FXML private Button setconfig;

    @FXML private Button setnotas;

    @FXML private Button setagenda;
    
    @FXML private Button home;

    @FXML void setnotas(ActionEvent event) throws IOException {
        Parent outra = FXMLLoader.load(getClass().getResource("Notas.fxml"));
           Scene outraa= new Scene(outra);
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(outraa);
           window.show();
    }

    @FXML
    void setagenda(ActionEvent event) throws IOException {
        Parent outra = FXMLLoader.load(getClass().getResource("Agenda.fxml"));
           Scene outraa= new Scene(outra);
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(outraa);
           window.show();
    }

    @FXML
    void setconfig(ActionEvent event) throws IOException {
        Parent outra = FXMLLoader.load(getClass().getResource("Config.fxml"));
           Scene outraa= new Scene(outra);
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(outraa);
           window.show();
    }
    
    @FXML
    void sethome(ActionEvent event) throws IOException {
        Parent outra = FXMLLoader.load(getClass().getResource("FXMLDocumentController.fxml"));
           Scene outraa= new Scene(outra);
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(outraa);
           window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
