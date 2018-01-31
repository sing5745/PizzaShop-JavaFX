/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static pizzashop.SpecialsController.fpSpecials;

/**
 *
 * @author inder
 */
public class mainController implements Initializable {
    
    @FXML
    public static Label orderPrice;
    
    @FXML
    private ImageView LOGO;
    
   
    
    @FXML
    private ImageView imgCombos;
    
    @FXML
    private ImageView imgOthers;
    
    @FXML
    private ImageView imgDips;
    
    @FXML
    private ImageView imgMakeOwn;
    
    
    @FXML
    public void showMain(){
        PizzaShop.showMain();
        
        
        
    }
    
    
     @FXML
    public void showCombos(){
    
        PizzaShop.showCombos();
    }
    
    @FXML
    public void showOthers(){
    
        PizzaShop.showSides();
    }
    
    @FXML
    public void showDips(){
    
        PizzaShop.showDips();
    }
    
    @FXML
    public void showMakeOwn(){
    
        PizzaShop.showMakeOwn();
    }
    
   @FXML
   public void showSpecials(){
     
       PizzaShop.showSpecials();
   }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
