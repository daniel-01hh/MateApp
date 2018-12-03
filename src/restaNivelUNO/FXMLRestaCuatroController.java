/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaNivelUNO;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Pair;

/**
 * FXML Controller class
 *
 * @author DANIEL
 */
public class FXMLRestaCuatroController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    } 
  
     @FXML
    public void sig(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/restaNivelUNO/FXMLRestaCinco.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Ejercicio 5");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @FXML
    public void inicio(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/restaPrincipal/FXMLRestaPrincipal.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Resta");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
     @FXML
    public void respuestaCorrecta(ActionEvent evento){
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Resultado");
        dialog.setHeaderText("Felicidades Bien Hecho");
        //Agregando un icono personalizado
        dialog.setGraphic(new ImageView(this.getClass().getResource("/recursos/OK.png").toString()));
        //Creando Boton
        ButtonType OK = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(OK);
        //Creando el Grid
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(20, 150, 10, 10));
        //Habilitando Botón
        Node loginButton = dialog.getDialogPane().lookupButton(OK);
        loginButton.setDisable(false);
        //Agregado elementos al dialogo
        dialog.getDialogPane().setContent(grid);
        //Mostrar el dialog
        dialog.show();
    }
     @FXML
    public void respuestaIncorrecta(ActionEvent evento){
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Resultado");
        dialog.setHeaderText("Tú puedes ''Intenta Nuevamente''");
        //Agregando un icono personalizado
        dialog.setGraphic(new ImageView(this.getClass().getResource("/recursos/pregunta.png").toString()));
        //Creando Boton
        ButtonType intentar = new ButtonType("Intentar", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(intentar);
        //Creando el Grid
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(20, 150, 10, 10));
        //Habilitando Botón
        Node loginButton = dialog.getDialogPane().lookupButton(intentar);
        loginButton.setDisable(false);
        //Agregado elementos al dialogo
        dialog.getDialogPane().setContent(grid);
        //Mostrar el dialog
        dialog.showAndWait();
    }
}
