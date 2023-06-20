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

public class checkoutpage_spinachController implements Initializable{

    @FXML
    private ImageView Cbg1, Cbg2, Cpimg1;

    @FXML
    private Label Cpname1, Cpprice1, Cslices1, Cins1; 

    @FXML
    private Text Cdes1;

    @FXML
    private ChoiceBox Ccbox1;

    @FXML
    private TextArea Ctxtbox1;

    @FXML
    private Button Ccheckoutbtn1;

    @FXML
    private AnchorPane Ap3;

    @FXML
    private Pane Cp1;

    FXMLLoader loader;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }




    
}
