/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtrocatelas1;

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
    public void start(Stage stage) throws Exception {
        AnchorPane elementoRaiz = FXMLLoader.load(getClass().getResource("Tela1FXML.fxml"));
        
        Scene cena1 = new Scene(elementoRaiz);
        
        stage.setScene(cena1);
               
        stage.show();
        
        stage.setTitle("Dashboard");
        
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
