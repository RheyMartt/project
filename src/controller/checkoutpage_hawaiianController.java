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

public class checkoutpage_hawaiianController implements Initializable{

    @FXML
    private ImageView Cbg13, Cbg14, Cpimg7, Ciconimg7, bpizza7;

    @FXML
    private Label Cpname7, Cpprice7, Cslices7, Cins7; 

    @FXML
    private Text Cdes7;

    @FXML
    private ChoiceBox Ccbox7;

    @FXML
    private TextArea Ctxtbox7;

    @FXML
    private Button Ccheckoutbtn7, Chomebtn7, backbtn7;

    @FXML
    private AnchorPane Ap9;

    @FXML
    private Pane Cp7;

    FXMLLoader loader;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void Bmenu7(ActionEvent event) throws IOException{
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), Ap9);
        boolean backbtn7 = true;
     if (backbtn7) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/menu_pagetwo.fxml"));
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

    public void Chome7(ActionEvent event) throws IOException{
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), Ap9);
        boolean Chomebtn7 = true;
     if (Chomebtn7) {
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
