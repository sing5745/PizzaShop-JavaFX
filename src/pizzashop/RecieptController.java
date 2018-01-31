/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import Pizza_Class.PizzaFiles;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author inder
 */
public class RecieptController implements Initializable {

    
       @FXML 
       private TextArea receipt;
       
       @FXML
       private Button printReciept;
       
       @FXML
       private Label price;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
          receipt.setVisible(false);
          price.setVisible(false);
    }    
    
    
    public void ordersFromMakeOwn(){
        
        
    
        //double Price = MakeOwn.totalPrice ;
     
        //System.out.println(Price);
    }
    
    public void readFromFile() {
        receipt.setVisible(true);
        
        try{
        //Identify the file
        File myFile = new File("Reciept.txt");
        //Check if file exists.
        if (!myFile.exists()){
        //If the file doesn't exist, Stop Reading
            throw new FileNotFoundException();
        }
         
        
       //lengthList = pizzaList.size();
        
        //Open the file for reading
        FileReader fr = new FileReader(myFile.getAbsoluteFile());
        BufferedReader br = new BufferedReader(fr);
        //Read from the file
        //String s = br.readLine();  //Null if EOF
        String s;
         //o s c p
        
         String text = "";
        
            while ((s = br.readLine()) != null) {
                
                   text += s + "\n";
                    
                }
                
            
               price.setVisible(true);
               price.setText(PizzaFiles.finalP);
               receipt.setText(text);
               printReciept.setText("THANK YOU");
            }
        
        
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    
   
    


    
    
    
    
}
