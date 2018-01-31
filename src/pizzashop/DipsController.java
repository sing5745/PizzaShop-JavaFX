/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import Pizza_Class.PizzaFiles;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.util.ArrayList;


/**
 * FXML Controller class
 *
 * @author inder
 */


public class DipsController implements Initializable {

   //ArrayList<Dips> DipsList = new ArrayList();
   ArrayList<String> dipsList = new ArrayList();
   
   public static double fpDips = 0;
   
    @FXML
    private ImageView LOGO;
    
    @FXML private Button write;
    
    @FXML private Button checkout;
    
    @FXML private Label orderL;
    
    @FXML
    private Button incB; @FXML private Button decB;@FXML private Button incB1;
    @FXML  private Button decB1;  @FXML private TextField show;  
    @FXML private TextField show1; @FXML private Label showPrice;     
    @FXML private Button garlic;  @FXML private Button ranch; 
    
    @FXML
    private Button incBbq; @FXML private Button decBbq;@FXML private Button addBbq;
    @FXML  private Button incCola;  @FXML private TextField showBbq;  
    @FXML private TextField showCola;  @FXML private Button cola;  
    @FXML private Button decCola; 
    
     @FXML
    private Button incFanta; @FXML private Button decFanta;@FXML private Button addFanta;
    @FXML  private Button incAle;  @FXML private TextField showFanta;  
    @FXML private TextField showAle;  @FXML private Button gingerAle;  
    @FXML private Button decAle; 
    
    
    int counter = 0;int counter1 = 0;int counterB = 1;int counterC = 0;
    int counterF = 0; int counterG = 0;
    double garlicP = 0; double ranchP = 0; double bbqP = 0; double colaP = 0;
    double fantaP = 0; double gingerP = 0;
    
    double sidesTotal = 0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    /** Garlic **/
    @FXML
    public void increase(){
       
      counter++ ; 
      counter++;
      show.setText("" + counter);
      garlic.setText("ADD");
    }
    
    @FXML
    public void increaseRanch(){
       
      counter1++ ; 
      show1.setText("" + counter1);
      ranch.setText("ADD");
    }
    
    @FXML
    public void increaseBbq(){
       
      counterB++ ; 
      showBbq.setText("" + counterB);
      addBbq.setText("ADD");
    }
    
    @FXML
    public void increaseCola(){
       
      counterC++ ; 
      showCola.setText("" + counterC);
      cola.setText("ADD");
    }
    
     @FXML
    public void increaseFanta(){
       
      counterF++ ; 
      showFanta.setText("" + counterF);
      addFanta.setText("ADD");
     
    }
    
    @FXML
    public void increaseGinger(){
       
      counterG++ ; 
      showAle.setText("" + counterG);
      gingerAle.setText("ADD");
    }
    
    
    
     
    @FXML
    public void decrease(){
     if (counter > 0 )
     {     
      counter--;
      
      show.setText("" + counter);
      garlic.setText("ADD");
     }
    }
    
    @FXML
    public void decreaseRanch(){
     if (counter1 > 0)
     {     
      counter1--;
      show1.setText("" + counter1);
      ranch.setText("ADD");
     }
    }
    
    @FXML
    public void decreaseBbq(){
     if (counterB > 0)
     {     
      counterB--;
      showBbq.setText("" + counterB);
      addBbq.setText("ADD");
     }
    }
    
    @FXML
    public void decreaseCola(){
     if (counterC > 0)
     {     
      counterC--;
      showCola.setText("" + counterC);
      cola.setText("ADD");
     }
    }
    
    @FXML
    public void decreaseFanta(){
     if (counterF > 0)
     {     
      counterF--;
      showFanta.setText("" + counterF);
      addFanta.setText("ADD");
     }
    }
    
    @FXML
    public void decreaseAle(){
     if (counterG > 0)
     {     
      counterG--;
      showAle.setText("" + counterG);
      gingerAle.setText("ADD");
     }
    }
    
    @FXML
    public void addGarlic(){
        garlicP = counter * 0.75;
        showPrice();
        dipsList.add(counter + " Garlic Parmesan,");
        //System.out.println(dipsList.get(0));
        garlic.setText("ADDED");
    }
    
     @FXML
    public void addRanch(){
        ranchP = counter1 * 0.75;
        dipsList.add(counter1 + " Ranch,");
        showPrice();
        ranch.setText("ADDED");
    }
    
     @FXML
    public void addBbq(){
       bbqP = counterB * 0.75;
       dipsList.add(counterB + " Barbeque,");
       showPrice();
       addBbq.setText("ADDED");
    }
    
    @FXML
    public void addCola(){
        colaP = counterC * 1.20;
        dipsList.add(counterC + " Coca Cola,");
        showPrice();
        cola.setText("ADDED");
    }
    
    @FXML
    public void addFanta(){
        fantaP = counterF * 1.20;
        dipsList.add(counterF + " Fanta,");
        addFanta.setText("ADDED");
        showPrice();
    }  
    
    @FXML
    public void addGingerAle(){
        gingerP = counterG * 1.20;
       dipsList.add(counterG + " Ginger Ale,");
       showPrice();
       gingerAle.setText("ADDED");
    }  
    
    @FXML
    public void write(){
    
        PizzaFiles.writeToFileDips(dipsList);
         PizzaFiles.printR(dipsList,null,null,null,null);
        double d = SpecialsController.fpSpecials + MakeOwn.fpMakeOwn + CombosController.fpCombos            
                           + fpDips + SidesController.fpSides;            
            
        
        orderL.setText(String.format("%.2f",d));
        
        
    }
    
    public void showPrice(){
        sidesTotal =  garlicP + ranchP +  bbqP + colaP + fantaP + gingerP;
        String sT = String.format( "%.2f", sidesTotal );
        showPrice.setText(sT); 
        fpDips = sidesTotal;  /** Final Price dips **/
       // SpecialsController.printPizza();
       // MakeOwn.getPizzas();
    }
    
    @FXML
    public void checkOut(){
    
        PizzaShop.showReciept();
       
    }
    
    public void showMain(){
    
        PizzaShop.showMain();
    }
}
