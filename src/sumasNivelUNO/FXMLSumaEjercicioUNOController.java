/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumasNivelUNO;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

/**
 * FXML Controller class
 *
 * @author Gerardelli Santiago
 */
public class FXMLSumaEjercicioUNOController implements Initializable {
    @FXML private Button btnInicio;
    @FXML private Button btnRespuesta1;
    @FXML private Button btnRespuesta2;
    @FXML private Button btnRespuesta3;
    @FXML private Button btnRespuesta4;
    @FXML private Button btnSiguiente;
    public int estado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        gestionarEvento();
        
    }
    
    @FXML
    public void inicio(ActionEvent evento){
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
    public void siguienteEjercicio(ActionEvent evento){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/sumasNivelUNO/FXMLSumaEjercicioDOS.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setResizable(false);
            stage.setTitle("mateApp - Suma Ejercicio Dos");
            stage.getIcons().add(new Image("/recursos/logo.png"));       
            stage.setScene(scene);
            stage.show();
        
            ((Node) (evento.getSource())).getScene().getWindow().hide();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void respuestaIncorrecta(ActionEvent evento){
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Resultado");
        dialog.setHeaderText("Tú puedes ''Intenta Nuevamente''");
        //Agregando un icono personalizado
        dialog.setGraphic(new ImageView(this.getClass().getResource("/recursos/pregunta.png").toString()));
        //Creando Boton
        ButtonType intentar = new ButtonType("Intentar", ButtonData.OK_DONE);
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
    
    @FXML
    public void respuestaCorrecta(ActionEvent evento){
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Resultado");
        dialog.setHeaderText("Felicidades Bien Hecho");
        //Agregando un icono personalizado
        dialog.setGraphic(new ImageView(this.getClass().getResource("/recursos/OK.png").toString()));
        //Creando Boton
        ButtonType OK = new ButtonType("OK", ButtonData.OK_DONE);
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
        estado = 1;
    }
    
    public void gestionarEvento(){
        if(estado==1){
            btnSiguiente.setDisable(true);
        }
    }
    
}
