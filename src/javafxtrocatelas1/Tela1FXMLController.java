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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author matheus
 */
public class Tela1FXMLController extends InterfaceUsuario {

    public Tela1FXMLController(){
        super("Tela1FXML.fxml");
    }
    
    @FXML
    private Button minhasAvaliacoes, meuDesempenho;
    
    @FXML
    private AnchorPane elementoRaiz;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML 
    public void irParaTela2() throws IOException {
        
        Tela2FXMLController tela2 = new Tela2FXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(tela2);

       /* //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML2 = FXMLLoader.load(getClass().getResource("Tela2FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML2);
               
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Minhas avaliacoes"); */
    }
    
    @FXML
    public void irParaTela3() throws IOException {
       
        Tela3FXMLController tela3 = new Tela3FXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(tela3);

      /*  //carrega o elemento raiz do FXML da tela que será aberta
        AnchorPane elementoRaizFXML3 = FXMLLoader.load(getClass().getResource("Tela3FXML.fxml"));
        
        //cria uma nova cena, passando para o construtor o elemento raiz do FXML que será aberto
        Scene novaCena = new Scene(elementoRaizFXML3);
        
        //obtém a cena a partir do elemenento raiz da tela que está aberta (tela atual)
        Scene cenaAtual = elementoRaiz.getScene();
        
        //obtém o palco da aplicação a partir da cena atual (com cast para Stage)
        Stage palcoDaAplicacao = (Stage) cenaAtual.getWindow();
        
        //atribuindo a nova cena, criada no início do método, ao palco da aplicação
        palcoDaAplicacao.setScene(novaCena);
        
        palcoDaAplicacao.setTitle("Meu desempenho"); */
    }
}
