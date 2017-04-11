/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtrocatelas1;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 *
 * @author matheus
 */
public class JavaFXTrocaTelas1 extends Application {
    
    @Override
    public void start(Stage palco) throws Exception {
       
        Tela1FXMLController tela1 = new Tela1FXMLController();
        GerenciadorJanela.obterInstancia().inicializaPalco(palco, tela1);
                
        /*AnchorPane elementoRaiz = FXMLLoader.load(getClass().getResource("Tela1FXML.fxml"));
        
        Scene cena1 = new Scene(elementoRaiz);
        
        stage.setScene(cena1);
               
        stage.show();
        
        stage.setTitle("Dashboard");
        */
        
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
