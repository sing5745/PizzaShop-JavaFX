/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import Pizza_Class.PizzaFiles;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import Pizza_Class.Sides;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author inder
 */



public class SidesController implements Initializable {

    ArrayList<Sides> sideList = new ArrayList();
    
    public static double fpSides = 0;
    
    
    @FXML 
    private Label sPrice;
    
    @FXML private Label orderPrice;
    
    @FXML private Button print;
    
    @FXML
    private ImageView LOGO;
    
    @FXML private Button add10Wings; String wings10 = ""; double wing10P = 0;
    @FXML private Button add20Wings; String wings20 = ""; double wing20P = 0;
    @FXML private Button add30Wings; String wings30 = ""; double wing30P = 0;
    @FXML private Button addGarlicBread; String gb = ""; double gbP = 0;
    @FXML private Button addCheeseGarlicB; String cgb = ""; double cgbP = 0;
    @FXML private Button addWedges; String wedges = ""; double wdgesP = 0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
         
    }    
    
    public void addWings10(){
            wings10 = "10 wings";
            wing10P = 9.75;
            add10Wings.setText("ADD AGAIN");
            Sides addWings = new Sides(wings10,wing10P);
            sideList.add(addWings);
            showPrice();
    }
        
    public void addWings20(){
       
            wings20 = "20 wings";
            wing20P = 18.99;
            add20Wings.setText("ADD AGAIN");
            Sides addWings = new Sides(wings20,wing20P);
            sideList.add(addWings);
            showPrice(); 
    }
        
     public void addWings30(){
    
            
            wings30 = "30 wings";
            wing30P = 28.59;
            add30Wings.setText("ADD AGAIN");
        
        
        Sides addWings = new Sides(wings30,wing30P);
        sideList.add(addWings);
        showPrice();
        
    }
     
     
     public void addGB(){
     
       gbP = 2.99;
      Sides garlicBr = new Sides("Garlic Bread",2.99);
      sideList.add(garlicBr);
      addGarlicBread.setText("ADD AGAIN");   
      showPrice();
     }
     
      public void addCGB(){
     
          cgbP = 3.99;
      Sides garlicCBr = new Sides("Cheese Garlic Bread",3.99);
      sideList.add(garlicCBr);
      addCheeseGarlicB.setText("ADD AGAIN");   
      showPrice();
     }
     
      public void addWedges(){
      
          wdgesP = 3.99;
      Sides wedges = new Sides("Potato Wedges",3.99);
      sideList.add(wedges);
      addWedges.setText("ADD AGAIN");   
      showPrice();
     }
     
    public void showPrice(){
        double total = (wing10P + wing20P + wing30P + gbP + cgbP + wdgesP);
        String p = String.format("%.2f",total);
        sPrice.setText(p);
    }
     
    
    public void print(){
         
        PizzaFiles.writeToFileSides(sideList);
        PizzaFiles.printR(null, null, null, sideList,null);
        
        double price = 0; 
        for (Sides sd:sideList)
          
        {
            price += sd.getSidePrice();
           System.out.println(sd);
          
        }
        
        fpSides = price;
        
        System.out.println(price);
        
        double d = SpecialsController.fpSpecials + MakeOwn.fpMakeOwn + CombosController.fpCombos            
                           + DipsController.fpDips + fpSides;            
            
        
        orderPrice.setText(String.format("%.2f",d));
        sPrice.setText("$0.00");
    }
    
    public void write(){
    }
     
    @FXML   
    public void showMain(){
        PizzaShop.showMain();
    }
    
    @FXML
    public void checkOut(){
    
        PizzaShop.showReciept();
         
    }
    
}
