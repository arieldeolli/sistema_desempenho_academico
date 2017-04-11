/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtrocatelas1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author matheus
 */
public class Tela4FXMLController extends InterfaceUsuario {

    public Tela4FXMLController(){
        super("Tela4FXML.fxml");
    }
    
     @FXML
    private AnchorPane elementoRaiz;

    @FXML
    private Label label1, label2, label3, label4;

    @FXML
    private TextField campoNota;

    @FXML
    private Button voltaTela2, salvaTela4;
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML 
    public void voltarParaTela2() throws IOException {
        
        GerenciadorJanela.obterInstancia().voltar();

      /*  //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML2 = FXMLLoader.load(getClass().getResource("Tela2FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML2);
        
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Minhas avaliacoes");  */
    }
    
    @FXML
    private String pegaNota() throws IOException{
        String nota = campoNota.getText();
        //Double nota = Double.parseDouble(campoNota.getText());  
        return nota;
    }
    
    //Modificar para gravar a nota no final da linha
    @FXML
    private void salvarNota() throws IOException{
        if(!arquivo1.exists()){
            arquivo1.createNewFile();
        }
        FileWriter escritor = new FileWriter(arquivo1, true);
        
        BufferedWriter gravador = new BufferedWriter(escritor);
        
        gravador.write(pegaNota());
        
        gravador.close();
        escritor.close();
        
        voltarParaTela2();
    }
}
