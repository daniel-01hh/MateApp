/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gerardelli Santiago
 */
public class FXMLPrincipalController implements Initializable {
    @FXML private Button btnAtras;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
    
    @FXML
    public void regresarInicio(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/mateapp/FXMLInicioApp.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void iniciarVentanaPrincipalSuma(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/sumaPrincipal/FXMLSumaPrincipal.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Sumas");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void iniciarVentanaPrincipalResta(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/restaPrincipal/FXMLRestaPrincipal.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Restas");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
