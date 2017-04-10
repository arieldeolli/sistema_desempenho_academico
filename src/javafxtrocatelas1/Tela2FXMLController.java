/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtrocatelas1;

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
public class Tela2FXMLController extends InterfaceUsuario {

    public Tela2FXMLController(){
        super("Tela2FXML.fxml");
    }
    
    @FXML
    private Button informaNota, adicionaAvaliacao, voltaTela1;
    
    @FXML
    private TableView tabela;
        
    @FXML
    private AnchorPane elementoRaiz;
    
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void irParaTela4() throws IOException {
        
        Tela4FXMLController tela4 = new Tela4FXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(tela4);   

      /*  //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML4 = FXMLLoader.load(getClass().getResource("Tela4FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML4);
        
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Informar nota");  */
    }
    
    @FXML
    public void irParaTela5() throws IOException {
        
        Tela5FXMLController tela5 = new Tela5FXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(tela5);

      /*  //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML5 = FXMLLoader.load(getClass().getResource("Tela5FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML5);
        
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Adicionar nova avaliacao");  */
    }
    
    @FXML 
    public void voltarParaTela1() throws IOException {
        
        GerenciadorJanela.obterInstancia().voltar();

      /*  //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML1 = FXMLLoader.load(getClass().getResource("Tela1FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML1);
        
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Dashboard");  */
    }
}
