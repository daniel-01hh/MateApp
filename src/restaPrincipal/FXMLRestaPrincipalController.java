/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaPrincipal;

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
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gerardelli Santiago
 */
public class FXMLRestaPrincipalController implements Initializable {
    @FXML private Button btnAtrasP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void regresarPrincipal(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/principal/FXMLPrincipal.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Principal");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @FXML
    public void juegounoresta(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/restaNivelUNO/FXMLRestaUNO.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Resta Ejercicio 1");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
