package controller;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class checkoutpage_sshrimpController implements Initializable{

    @FXML
    private ImageView Cbg11, Cbg12, Cpimg6, Ciconimg6, bpizzaimg6;

    @FXML
    private Label Cpname6, Cpprice6, Cslices6, Cins6; 

    @FXML
    private Text Cdes6;

    @FXML
    private ChoiceBox Ccbox6;

    @FXML
    private TextArea Ctxtbox6;

    @FXML
    private Button Ccheckoutbtn6, Chomebtn6, backbtn6;

    @FXML
    private AnchorPane Ap8;

    @FXML
    private Pane Cp6;

    FXMLLoader loader;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void Bmenu6(ActionEvent event) throws IOException{
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), Ap8);
        boolean backbtn6 = true;
     if (backbtn6) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/menu_pageone.fxml"));
                Parent root = loader.load();

                Image icons = new Image("images/Icon.png");
                Stage PagetwoStage= new Stage();
                PagetwoStage.getIcons().add(icons);
                PagetwoStage.setTitle("PIZZERIA - MENU");                
                PagetwoStage.setScene(new Scene(root));

                PagetwoStage.show();

                Node source = (Node) event.getSource();
                Stage currentStage = (Stage) source.getScene().getWindow();
                currentStage.hide();

                fadeTransition.setFromValue(0);
                fadeTransition.setToValue(1);
                fadeTransition.play();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void Chome6(ActionEvent event) throws IOException{
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), Ap8);
        boolean Chomebtn6 = true;
     if (Chomebtn6) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HomePage.fxml"));
                Parent root = loader.load();

                Image icons = new Image("images/Icon.png");
                Stage PagetwoStage= new Stage();
                PagetwoStage.getIcons().add(icons);
                PagetwoStage.setTitle("PIZZERIA - HOME");                
                PagetwoStage.setScene(new Scene(root));

                PagetwoStage.show();

                Node source = (Node) event.getSource();
                Stage currentStage = (Stage) source.getScene().getWindow();
                currentStage.hide();

                fadeTransition.setFromValue(0);
                fadeTransition.setToValue(1);
                fadeTransition.play();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }





    
}
