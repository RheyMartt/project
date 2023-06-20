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

public class checkoutpage_supremeController implements Initializable{

    @FXML
    private ImageView Cbg23, Cbg24, Cpimg12, Ciconimg12, bpizzaimg12;

    @FXML
    private Label Cpname12, Cpprice12, Cslices12, Cins12; 

    @FXML
    private Text Cdes12;

    @FXML
    private ChoiceBox Ccbox12;

    @FXML
    private TextArea Ctxtbox12;

    @FXML
    private Button Ccheckoutbtn12, Chomebtn12, backbtn12;

    @FXML
    private AnchorPane Ap14;

    @FXML
    private Pane Cp12;

    FXMLLoader loader;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void Bmenu12(ActionEvent event) throws IOException{
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), Ap14);
        boolean backbtn12 = true;
     if (backbtn12) {
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

    public void Chome12(ActionEvent event) throws IOException{
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), Ap14);
        boolean Chomebtn12 = true;
     if (Chomebtn12) {
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
