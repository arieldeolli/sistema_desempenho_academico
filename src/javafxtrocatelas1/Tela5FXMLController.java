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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author matheus
 */
public class Tela5FXMLController extends InterfaceUsuario {

    public Tela5FXMLController(){
        super("Tela5FXML.fxml");
    }
    
    @FXML
    private AnchorPane elementoRaiz;

    @FXML
    private TextField campoNome, campoPeso;

    @FXML
    private ChoiceBox<String> campoDisciplina, campoMedia;

    @FXML
    private Button voltaTela2, salvaTela5;
    
    ObservableList<String> listaDisciplinas = FXCollections.observableArrayList("ÉTICA EM INFORMÁTICA", "MATEMÁTICA COMPUTACIONAL", "ALGORITMOS E PROGRAMAÇÃO", "ÁLGEBRA", "INTRODUÇÃO AO CÁLCULO", "INICIAÇÃO TÉCNICO-CIENTÍFICA", "INTRODUÇÃO A ENGENHARIA DE COMPUTAÇÃO", "INTRODUÇÃO À FÍSICA");
   
    ObservableList<String> listaMedias = FXCollections.observableArrayList("M1", "M2", "M3");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        campoDisciplina.setValue("INTRODUÇÃO À FÍSICA");
        campoDisciplina.setItems(listaDisciplinas);
        
        campoMedia.setValue("M1");
        campoMedia.setItems(listaMedias);
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
    private void pegaNomeProva() throws IOException{
        String nomeProva = campoNome.getText();
    }
    
    @FXML
    private void pegaPeso() throws IOException{
        Double pesoProva = Double.parseDouble(campoPeso.getText());
        System.out.println(pesoProva);
    }
    
    @FXML
    private void pegaDisciplina() throws IOException{
        String disc = campoDisciplina.getValue();
    }
    
    @FXML
    private void pegaMedia() throws IOException{
        String media = campoMedia.getValue();
    }
   
    
}
