/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import java.util.*;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import Pizza_Class.Pizza;
import Pizza_Class.PizzaFiles;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * FXML Controller class
 *
 * @author inder
 */
public class SpecialsController implements Initializable {

    
    @FXML private Label price;
    double p = 0;
   
    @FXML private Button special;
    
    @FXML private Label totalOrderPrice;
    
     ArrayList<Pizza> specialsList = new ArrayList();
     
     public static double fpSpecials = 0; /** Total final price**/
    
     @FXML
     private Button write;
    
    @FXML   
    private Pane satP;  @FXML private AnchorPane satI; @FXML private Label sl;
    
     @FXML   
    private Pane friP;  @FXML private AnchorPane friI; @FXML private Label fl;
    
    @FXML   
    private Pane monP;  @FXML private AnchorPane monI; @FXML private Label ml;
    
    @FXML   
    private Pane tueP;  @FXML private AnchorPane tueI; @FXML private Label tuel;
    
    @FXML   
    private Pane wedP;  @FXML private AnchorPane wedI; @FXML private Label wedlabel;
    
     @FXML   
    private Pane thuP;  @FXML private AnchorPane thuI; @FXML private Label thulabel;
    
    @FXML
    private Button addFri;
    
    @FXML
    private Label lg;
    
    @FXML                  /** Calabrese **/
    private Label calbL;  @FXML private Button ad;  @FXML private AnchorPane calabrese2; 
    @FXML 
    private Button canCalb;@FXML private RadioButton sB;@FXML private RadioButton lB;  
   @FXML private RadioButton mB;  @FXML private RadioButton xlB;  double calBprice = 0;
   @FXML    
   private Button addCalabrese; 
   
   int sizeCalb = 0; String topCalb = ""; 
   
   
    
  
   
    @FXML                  /** Deluxe **/
    private Label delL;  @FXML private Button addDel;  @FXML private AnchorPane deluxe; 
    @FXML
    private Button canDel;@FXML private RadioButton sBdel;@FXML private RadioButton lBdel;  
   @FXML private RadioButton mBdel;  @FXML private RadioButton xlBdel; double delPrice = 0;
    @FXML    
   private Button addDeluxe; 
   
   int sizeDeluxe = 0; String topDeluxe = "";
   
   
    @FXML                  /** Hawaiin **/
    private Label hawaL;  @FXML private Button addHawa;  @FXML private AnchorPane hawaiin; 
    @FXML
    private Button canHawa;@FXML private RadioButton sBhawa;@FXML private RadioButton lBhawa;  
   @FXML private RadioButton mBhawa;  @FXML private RadioButton xlBhawa; double hawaPrice = 0;
    @FXML    
   private Button addHawai; 
   
   int sizeHawa = 0; String topHawa = "";
   
    
    @FXML                  /** Meat Supreme **/
    private Label meatL;  @FXML private Button addmeat;  @FXML private AnchorPane meat; 
    @FXML
    private Button canMeat;@FXML private RadioButton sBmeat;@FXML private RadioButton lBmeat;  
   @FXML private RadioButton mBmeat;  @FXML private RadioButton xlBmeat; double meatPrice = 0;
    @FXML    
   private Button addMeat; 
   
   int sizeMeat = 0; String topMeat = "";
   
    @FXML                  /** Veggie **/
    private Label vegiL;  @FXML private Button addVegi;  @FXML private AnchorPane veggie; 
    @FXML
    private Button canVeggie;@FXML private RadioButton sBvegi;@FXML private RadioButton lBvegi;  
   @FXML private RadioButton mBvegi;  @FXML private RadioButton xlBvegi; double vegiPrice = 0;
   @FXML private Button addVegg; 
   
   int sizeVegi = 0; String topVegi = "";
   
   
   @FXML                  /** Thursday **/
    private Label napoL;  @FXML private Button addNapo;  @FXML private AnchorPane napo; 
    @FXML
    private Button canNapo;@FXML private RadioButton sBNapo;@FXML private RadioButton lBNapo;  
   @FXML private RadioButton mBNapo;  @FXML private RadioButton xlBNapo; double napoPrice = 0;
   @FXML private Button addNap; 
   
   int sizeNap = 0; String topNap = ""; 
   
   
   @FXML private Button checkout;
   
    
    Calendar rightNow = Calendar.getInstance();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        totalOrderPrice.setVisible(false);
        checkout.setVisible(false);
        changeD();
        calabrese2.setVisible(false);
        deluxe.setVisible(false);
        hawaiin.setVisible(false);
        meat.setVisible(false);
        veggie.setVisible(false);
        napo.setVisible(false);
        
        ToggleGroup s = new ToggleGroup();
        sB.setToggleGroup(s);
        mB.setToggleGroup(s);
        lB.setToggleGroup(s);
        xlB.setToggleGroup(s);
        
        ToggleGroup chooseDel = new ToggleGroup();
        sBdel.setToggleGroup(chooseDel);
        mBdel.setToggleGroup(chooseDel);
        lBdel.setToggleGroup(chooseDel);
        xlBdel.setToggleGroup(chooseDel);
        
        ToggleGroup chooseHawa = new ToggleGroup();
        sBhawa.setToggleGroup(chooseHawa);
        mBhawa.setToggleGroup(chooseHawa);
        lBhawa.setToggleGroup(chooseHawa);
        xlBhawa.setToggleGroup(chooseHawa);
        
        ToggleGroup chooseMeat = new ToggleGroup();
        sBmeat.setToggleGroup(chooseMeat);
        mBmeat.setToggleGroup(chooseMeat);
        lBmeat.setToggleGroup(chooseMeat);
        xlBmeat.setToggleGroup(chooseMeat);
        
        ToggleGroup chooseVegi = new ToggleGroup();
        sBvegi.setToggleGroup(chooseVegi);
        mBvegi.setToggleGroup(chooseVegi);
        lBvegi.setToggleGroup(chooseVegi);
        xlBvegi.setToggleGroup(chooseVegi);
        
        ToggleGroup chooseNapo = new ToggleGroup();
        sBNapo.setToggleGroup(chooseNapo);
        mBNapo.setToggleGroup(chooseNapo);
        lBNapo.setToggleGroup(chooseNapo);
        xlBNapo.setToggleGroup(chooseNapo);
        
        
        
    }    
    
    /** For friday **/
    public void changeBackgroundSat(){       
        satP.setStyle("-fx-opacity:0.33");
        sl.setVisible(false);
        satI.setVisible(false);
       // satP.setVisible(false);
    }
    
    /** For friday **/
    public void changeAgainSat(){ 
    
        satP.setStyle(" -fx-opacity:1.0; -fx-background-color: white;");
        sl.setVisible(true);
       // satP.setVisible(true);
        changeD();
    }
    
    /** For Sat  **/
    public void changeBackgroundFri(){    
        friP.setStyle("-fx-opacity:0.33");
        fl.setVisible(false);
        friI.setVisible(false);
        
    }
    
    /**  For saturday **/
    public void changeAgainFri(){ 
    
        friP.setStyle(" -fx-opacity:1.0; -fx-background-color: white;");
        fl.setVisible(true);
        changeD();
    }
    
    /** For Mon  **/
     public void changeBackgroundMon(){    
        monP.setStyle("-fx-opacity:0.33");
        ml.setVisible(false);
        monI.setVisible(false);
        
    }
    
     /**  For Mon **/
    public void changeAgainMon(){     
    
        monP.setStyle(" -fx-opacity:1.0; -fx-background-color: white;");
        ml.setVisible(true);
        changeD();
    }
    
    /** For Tue  **/
     public void changeBackgroundTue(){    
        tueP.setStyle("-fx-opacity:0.33");
        tuel.setVisible(false);
        tueI.setVisible(false);
        
    }
    
     /**  For Tue **/
    public void changeAgainTue(){     
    
        tueP.setStyle(" -fx-opacity:1.0; -fx-background-color: white;");
        tuel.setVisible(true);
        changeD();
    }
    
     /** For Tue  **/
     public void changeBackgroundWed(){    
        wedP.setStyle("-fx-opacity:0.33");
        wedlabel.setVisible(false);
        wedI.setVisible(false);
        
    }
    
     /**  For Tue **/
    public void changeAgainWed(){     
    
        wedP.setStyle(" -fx-opacity:1.0; -fx-background-color: white;");
        wedlabel.setVisible(true);
        changeD();
    }
    
    /** For Tue  **/
     public void changeBackgroundThu(){    
        thuP.setStyle("-fx-opacity:0.33");
        thulabel.setVisible(false);
        thuI.setVisible(false);
       // satP.setVisible(false);
    }
    
     /**  For Tue **/
    public void changeAgainThu(){     
    
        thuP.setStyle(" -fx-opacity:1.0; -fx-background-color: white;");
        thulabel.setVisible(true);
        changeD();
    }
    
    
    
    
    String s = rightNow.get(Calendar.DAY_OF_WEEK) + "";
    
    
    
    //String p = s.toString();
    
    public void changeD(){
         
        friI.setVisible(false);
        monI.setVisible(false);
        tueI.setVisible(false);
        wedI.setVisible(false);
        thuI.setVisible(false);
        satI.setVisible(false);
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 6)
        {
          satP.setStyle("-fx-background-color: grey");
          satI.setVisible(true);
          
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 7)
        {
          friP.setStyle("-fx-background-color: grey");
          friI.setVisible(true);
          
          
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 2)
        {
          monP.setStyle("-fx-background-color: grey");
          monI.setVisible(true);
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 3)
        {
          tueP.setStyle("-fx-background-color: grey");
          tueI.setVisible(true);
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 4)
        {
          wedP.setStyle("-fx-background-color: grey");
          wedI.setVisible(true);
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 5)
        {
          thuP.setStyle("-fx-background-color: grey");
          thuI.setVisible(true);
        }
     
        
    }
    
    
    /** For Sat **/
    public void chngePane(){
      satP.setVisible(false);
    }
    
    public void chngePaneFri(){
      friP.setVisible(false);
    }
    
     public void chngePaneMon(){
      monP.setVisible(false);
    }
     
    public void chngePaneTue(){
      tueP.setVisible(false);
    }
    
    public void chngePaneWed(){
      wedP.setVisible(false);
    }
    
    public void chngePaneThu(){
      thuP.setVisible(false);
    }
    
    
    
    /** Cancel button for calabrese **/
    @FXML
    public void canCalbrese(){
        calabrese2.setVisible(false);
        ad.setVisible(true);
        calBprice = 0;
        sB.setSelected(false);
        mB.setSelected(false);
        lB.setSelected(false);
        xlB.setSelected(false);
        calbL.setText("");
    }
    
    /** Cancel for del **/
    @FXML
    public void canDel(){
    
        deluxe.setVisible(false);
        addDel.setVisible(true);
        delPrice = 0;
        sBdel.setSelected(false);
        mBdel.setSelected(false);
        lBdel.setSelected(false);
        xlBdel.setSelected(false);
        delL.setText("");
    }
    
    /** Cancel for del **/
    @FXML
    public void canHawa(){
    
        hawaiin.setVisible(false);
        addHawa.setVisible(true);
        hawaPrice = 0;
        sBhawa.setSelected(false);
        mBhawa.setSelected(false);
        lBhawa.setSelected(false);
        xlBhawa.setSelected(false);
        hawaL.setText("");
    }
    
     @FXML
    public void canMeat(){
    
        meat.setVisible(false);
        addmeat.setVisible(true);
        meatPrice = 0;
        sBmeat.setSelected(false);
        mBmeat.setSelected(false);
        lBmeat.setSelected(false);
        xlBmeat.setSelected(false);
        meatL.setText("");
    }
    
    @FXML
    public void canVegi(){
    
        veggie.setVisible(false);
        addVegi.setVisible(true);
        vegiPrice = 0;
        sBvegi.setSelected(false);
        mBvegi.setSelected(false);
        lBvegi.setSelected(false);
        xlBvegi.setSelected(false);
        vegiL.setText("");
    }
    
     @FXML
    public void canNapo(){
    
        napo.setVisible(false);
        addNapo.setVisible(true);
        napoPrice = 0;
        sBNapo.setSelected(false);
        mBNapo.setSelected(false);
        lBNapo.setSelected(false);
        xlBNapo.setSelected(false);
        napoL.setText("");
    }
    
    
    /**  Making pane visible after click for calabrese**/
    @FXML
    public void customise(){
    
        //calabrese.setVisible(false);
        ad.setVisible(false);
        calabrese2.setStyle("-fx-background-color: white");
        calabrese2.setVisible(true);
        calbL.setVisible(true);
    }
    
    /** For deluxe **/
    @FXML
    public void customiseDeluxe(){
    
        //calabrese.setVisible(false);
        addDel.setVisible(false);
        deluxe.setStyle("-fx-background-color: white");
        deluxe.setVisible(true);
    }
    
    @FXML
    public void customiseHawaiin(){
    
        //calabrese.setVisible(false);
        addHawa.setVisible(false);
        hawaiin.setStyle("-fx-background-color: white");
        hawaiin.setVisible(true);
    }
    
     @FXML
    public void customiseMeat(){
    
        //calabrese.setVisible(false);
        addmeat.setVisible(false);
        meat.setStyle("-fx-background-color: white");
        meat.setVisible(true);
    }
    
     @FXML
    public void customiseVegi(){
    
        //calabrese.setVisible(false);
        addVegi.setVisible(false);
        veggie.setStyle("-fx-background-color: white");
        veggie.setVisible(true);
    }
    
     @FXML
    public void customiseNapo(){
    
        //calabrese.setVisible(false);
        addNapo.setVisible(false);
        napo.setStyle("-fx-background-color: white");
        napo.setVisible(true);
    }
 
    @FXML
    public void showMain(){
    
        PizzaShop.showMain();
    }
    
    
    /** button action for calabrese **/
    @FXML
    public void setOrder(){
     
        if (sB.isSelected())
        {
          calBprice = 8.99;
          calbL.setText("$8.99");
          sizeCalb = 10;
          
        }
        
         if (mB.isSelected())
        {
           calBprice = 10.99;
           calbL.setText("$10.99");
           sizeCalb = 12;
           p = 10.99;
        }
         
          if (lB.isSelected())
        {
           calBprice = 12.99;
           calbL.setText("$12.99");
           sizeCalb = 14;
           
        }
           if (xlB.isSelected())
        {
           calBprice = 15.99;
           calbL.setText("$15.99");
           sizeCalb = 16;
        }
        
        topCalb = "Sausage,Onions,Green Pepper";   
        
    
    }
    
    
    
    /** Action for deluxe **/
     @FXML
    public void setOrderDel(){
     
        if (sBdel.isSelected())
        {
          delPrice = 8.99;
          delL.setText("$8.99");
          sizeDeluxe = 10;
          
        }
        
         if (mBdel.isSelected())
        {
           delPrice = 10.99;
           delL.setText("$10.99");
           sizeDeluxe = 12;
        }
         
          if (lBdel.isSelected())
        {
           delPrice = 12.99;
           delL.setText("$12.99");
           sizeDeluxe = 14;
        }
           if (xlBdel.isSelected())
        {
           delPrice = 15.99;
           delL.setText("$15.99");
           sizeDeluxe = 16;
        }
    
       topDeluxe = "Sliced Tomatoes,Green Peppers,Mushrooms,Bacon";
      
    }
    
     @FXML
    public void setOrderHawa(){
     
        if (sBhawa.isSelected())
        {
          hawaPrice = 8.99;
          hawaL.setText("$8.99");
          sizeHawa = 10;
        }
        
         if (mBhawa.isSelected())
        {
           hawaPrice = 10.99;
           hawaL.setText("$10.99");
           sizeHawa = 12;
        }
         
          if (lBhawa.isSelected())
        {
           hawaPrice = 12.99;
           hawaL.setText("$12.99");
           sizeHawa = 14;
        }
           if (xlBhawa.isSelected())
        {
           hawaPrice = 15.99;
           hawaL.setText("$15.99");
           sizeHawa = 16;
        }
           topHawa = "Ham,Bacon,Pineapple";
    }
    
     @FXML
    public void setOrderMeat(){
     
        if (sBmeat.isSelected())
        {
          meatPrice = 8.99;
          meatL.setText("$8.99");
          sizeMeat = 10;
        }
        
         if (mBmeat.isSelected())
        {
           meatPrice = 10.99;
           meatL.setText("$10.99");
           sizeMeat = 12;
           
        }
         
         
          if (lBmeat.isSelected())
        {
           meatPrice = 12.99;
           meatL.setText("$12.99");
           sizeMeat = 14;
        }
           if (xlBmeat.isSelected())
        {
           meatPrice = 15.99;
           meatL.setText("$15.99");
           sizeMeat = 16;
        }
          
           topMeat = "Beef,Pepperoni,Bacon,Sausage";
    }
    
     @FXML
    public void setOrderVegi(){
     
        if (sBvegi.isSelected())
        {
          vegiPrice = 8.99;
          vegiL.setText("$8.99");
          sizeVegi = 10; 
        }
        
         if (mBvegi.isSelected())
        {
           vegiPrice = 10.99;
           vegiL.setText("$10.99");
           sizeVegi = 12;
        }
         
         
          if (lBvegi.isSelected())
        {
           vegiPrice = 12.99;
           vegiL.setText("$12.99");
           sizeVegi = 14;
        }
           if (xlBvegi.isSelected())
        {
           vegiPrice = 15.99;
           vegiL.setText("$15.99");
           sizeVegi = 16;
        }    
           
        topVegi = "Mushroom,Green Pepper,Onions";   
    }
    
    @FXML
    public void setOrderNapo(){
     
        if (sBNapo.isSelected())
        {
          napoPrice = 8.99;
          napoL.setText("$8.99");
          sizeNap = 10;
        }
        
         if (mBNapo.isSelected())
        {
           napoPrice = 10.99;
           napoL.setText("$10.99");
           sizeNap = 12;
        }
  
          if (lBNapo.isSelected())
        {
           napoPrice = 12.99;
           napoL.setText("$12.99");
           sizeNap = 14;
        }
           if (xlBNapo.isSelected())
        {
           napoPrice = 15.99;
           napoL.setText("$15.99");
           sizeNap = 16;
        }
        
        topNap = "Anchovies,Black Olives,Mushroom";   
    }
    
    @FXML
    public void addToListCalabrese(){
        Pizza calabresePizza = new Pizza(sizeCalb,calBprice,topCalb);
        specialsList.add(calabresePizza);
        calabrese2.setVisible(false);
        ad.setVisible(true);
        ad.setText("ADD AGAIN");
        
        showPrice();
        sizeCalb=0;
        calBprice=0;
        topCalb="";
        sB.setSelected(false);
        mB.setSelected(false);
        lB.setSelected(false);
        xlB.setSelected(false);
        calbL.setText("");
    }
    
    @FXML
    public void addToListDeluxe(){
        Pizza deluxePizza = new Pizza(sizeDeluxe,delPrice,topDeluxe);
        specialsList.add(deluxePizza);
        deluxe.setVisible(false);
        addDel.setVisible(true);
        addDel.setText("ADD AGAIN");
        showPrice();
        //PizzaFiles.appendToFile(deluxePizza);
        //write();
        sizeDeluxe=0;
        delPrice=0;
        topDeluxe="";
        sBdel.setSelected(false);
        mBdel.setSelected(false);
        lBdel.setSelected(false);
        xlBdel.setSelected(false);
        delL.setText("");
    }
    
    @FXML
    public void addToListHawa(){
        Pizza hawaPizza = new Pizza(sizeHawa,hawaPrice,topHawa);
        specialsList.add(hawaPizza);
        hawaiin.setVisible(false);
        addHawa.setVisible(true);
        addHawa.setText("ADD AGAIN");
        showPrice();
        //PizzaFiles.appendToFile(hawaPizza);
        //write();
        sizeHawa=0;
        hawaPrice=0;
        topHawa="";
        sBhawa.setSelected(false);
        mBhawa.setSelected(false);
        lBhawa.setSelected(false);
        xlBhawa.setSelected(false);
        hawaL.setText("");
    }
    
    @FXML
    public void addToListMeat(){
        Pizza meatPizza = new Pizza(sizeMeat,meatPrice,topMeat);
        specialsList.add(meatPizza);
        meat.setVisible(false);
        addmeat.setVisible(true);
        addmeat.setText("ADD AGAIN");
        showPrice();
        //PizzaFiles.appendToFile(meatPizza);
        //write();
        sizeMeat=0;
        meatPrice=0;
        topMeat="";
        sBmeat.setSelected(false);
        mBmeat.setSelected(false);
        lBmeat.setSelected(false);
        xlBmeat.setSelected(false);
        meatL.setText("");
    }
    
    
    @FXML
    public void addToListVegi(){
        Pizza vegiPizza = new Pizza(sizeVegi,vegiPrice,topVegi);
        specialsList.add(vegiPizza);
        veggie.setVisible(false);
        addVegi.setVisible(true);
        addVegi.setText("ADD AGAIN");
        showPrice();
        //PizzaFiles.appendToFile(vegiPizza);
       // write();
        //PizzaFiles.appendToFile(vegiPizza);
        sizeVegi=0;
        vegiPrice=0;
        topVegi="";
        sBvegi.setSelected(false);
        mBvegi.setSelected(false);
        lBvegi.setSelected(false);
        xlBvegi.setSelected(false);
        vegiL.setText("");
    }
    
     @FXML
    public void addToListNapo(){
        Pizza napoPizza = new Pizza(sizeNap,napoPrice,topNap);
        specialsList.add(napoPizza);
        napo.setVisible(false);
        addNapo.setVisible(true);
        addNapo.setText("ADD AGAIN");
        showPrice();
        //PizzaFiles.appendToFile(napoPizza);
        //write();
        sizeNap=0;
        napoPrice=0;
        topNap="";
        sBNapo.setSelected(false);
        mBNapo.setSelected(false);
        lBNapo.setSelected(false);
        xlBNapo.setSelected(false);
        napoL.setText("");
    }
    
    @FXML
    public void writeToFinal(){
    
      PizzaFiles.writeToFileSpecials(specialsList);
      PizzaFiles.printR(null,specialsList,null,null,null);
      //System.out.println(specialsList);
      
      double total = 0;
        
      for (Pizza p:specialsList)
      {
          total += p.getPrice();
      }
      
      
      
      
      fpSpecials = total; /** Calculating Final price **/
      
      showPrice();
      
      System.out.println(total);
      
      findTops();
    }
    
    
    public void showPrice(){
    
        double total = 0;
        for (Pizza p:specialsList)
      {
          total += p.getPrice();
      }
        
        double d = calBprice + delPrice + hawaPrice + meatPrice + vegiPrice + napoPrice;
        String g = String.format("%.2f",total);
        price.setText(g);
        
        double orderP =   fpSpecials  + MakeOwn.fpMakeOwn + CombosController.fpCombos
                           + DipsController.fpDips + SidesController.fpSides;
        
        totalOrderPrice.setText(String.format("%.2f",orderP));
        totalOrderPrice.setVisible(true);
        checkout.setVisible(true);
        //price.setText("$0.00");
    }
    
    public void change()
    {
         
    
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 6)
        {
         
          
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 7)
        {
          
          
          
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 2)
        {
          monP.setVisible(false);
          addHawa.setText("SPECIAL ADDED");
          
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 3)
        {
            tueP.setVisible(false);
            addmeat.setText("SPECIAL ADDED");
            Pizza hawaPizza = new Pizza(14,9.99,"Today's Special,Mushroom,Green Pepper,Onions");
            specialsList.add(hawaPizza);
          
          showPrice();  
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 4)
            
        {
          wedP.setVisible(false);
          addVegi.setText("SPECIAL ADDED");
          Pizza vegiPizza = new Pizza(14,9.99,topVegi);
          specialsList.add(vegiPizza);
          
          showPrice();  
        }
        
        if (rightNow.get(Calendar.DAY_OF_WEEK) == 5)
        {
         
            thuP.setVisible(false);
            addmeat.setText("SPECIAL ADDED");
            Pizza hawaPizza = new Pizza(14,9.99,"Today's Special,Mushroom,Green Pepper,Onions");
            specialsList.add(hawaPizza);
          
          showPrice();  
        }
     
        
    }
    
    
     public static void findTops(){ 
        
        try{
        //Identify the file
        File myFile = new File("SpecialsPizza.txt");
        //Check if file exists.
        if (!myFile.exists()){
        //If the file doesn't exist, Stop Reading
            throw new FileNotFoundException();
        }
        FileReader fr = new FileReader(myFile.getAbsoluteFile());
        BufferedReader br = new BufferedReader(fr);
        String s;
        
        String CR = "";
        
        while ((s = br.readLine()) != null) {
                Pattern p = Pattern.compile
                ("Pizza\\{, size=(.*), price=(.*), toppings=(.*)\\}");
                Matcher m = p.matcher(s);
                if (m.matches())
                {
                    String OI = m.group(1);
                    String SZ = m.group(2);
                    CR = m.group(3);
                }
                 System.out.println(CR);
        }
        
       
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SpecialsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SpecialsController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
     @FXML
     public void checkOut(){
         PizzaShop.showReciept();
         
     }
     
     
     
    
}
