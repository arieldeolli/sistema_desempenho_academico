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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
public class Tela3FXMLController implements Initializable {

    @FXML
    private AnchorPane elementoRaiz;
    
    @FXML
    private BarChart<?, ?> tabela;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series set1 = new   XYChart.Series<>();
        
        set1.getData().add(new XYChart.Data("Banco de dados", 9));
        set1.getData().add(new XYChart.Data("Programacao", 6));
        
        tabela.getData().addAll(set1);
    }    
    
    @FXML 
    public void voltarParaTela1() throws IOException {
        //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML1 = FXMLLoader.load(getClass().getResource("Tela1FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML1);
        
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Dashboard");
    }
    
}
