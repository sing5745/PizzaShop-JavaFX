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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import Pizza_Class.Combos;
import Pizza_Class.Pizza;
import Pizza_Class.PizzaFiles;
import java.util.ArrayList;
import java.util.Collection;

/**
 * FXML Controller class
 *
 * @author inder
 */
public class CombosController implements Initializable {

    ArrayList<Combos> comboList = new ArrayList();
    
    ArrayList<ArrayList<Object>> cList = new ArrayList();
    
    
    public static double fpCombos = 0;
    
    @FXML private Label comboL;
    
    @FXML private Label orderL;
    
    @FXML private Button checkout;
    
    @FXML
    private ImageView LOGO;
    
    
    @FXML
    private CheckBox t0; /* pep */
    @FXML private CheckBox t1; /* on */
    @FXML private CheckBox t2; /* green */
    @FXML private CheckBox t3; /* mush */
    @FXML private CheckBox t4; /* chicken */
    
    String topping = "";
    @FXML private Button getStartedC1;
    
   
    
    @FXML
    private CheckBox t5; /* pep */
    @FXML private CheckBox t6; /* on */
    @FXML private CheckBox t7; /* green */
    @FXML private CheckBox t8; /* mush */
    @FXML private CheckBox t9; /* chicken */
     
    String topping2 = "";
    @FXML private Button getStartedC2;
      
    @FXML
    private CheckBox t10; /* pep */
    @FXML private CheckBox t11; /* on */
    @FXML private CheckBox t12; /* green */
    @FXML private CheckBox t13; /* mush */
    @FXML private CheckBox t14; /* chicken */
    
    String topping3 = "";
    @FXML private Button getStartedC3;
    
     int counter = 0; int counter2 = 0; int counter3 = 0;
      
    @FXML private Button addCans; 
    @FXML private Button addCanDips;
    @FXML private Button addBreadCan;
    @FXML private Button print;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
   @FXML 
   public void top(){  
    
       if (counter > 2) {

           t0.setSelected(false);
           t1.setSelected(false);
           t2.setSelected(false);
           t3.setSelected(false);
           t4.setSelected(false);
           counter = 0;
           
       }
       else {

           if (t0.isSelected()) {

               counter++;
               System.out.println("check box 1");
               System.out.println(counter);
               topping += "Pepperoni,";

           } else {
               counter--;
               System.out.println("check box 1 deselected");
               System.out.println(counter);
               topping += "";
           }
       }
       changeText();
       
    
   
    }
   
   @FXML 
   public void top2(){  
    
       if (counter > 2) {

           t0.setSelected(false);
           t1.setSelected(false);
           t2.setSelected(false);
           t3.setSelected(false);
           t4.setSelected(false);
           counter = 0;
       } 
       
       else {
            {
               if (t1.isSelected()) {
                   if (counter < 4) {
                       counter++;
                       System.out.println("check box 2");
                       System.out.println(counter);
                       topping += "Onions,";
                   }
               } else {
                   counter--;
                   System.out.println("check box 2 deselected");
                   System.out.println(counter);
                   topping += "";
               }

           }
       }
       changeText();
    
    }
   
   @FXML 
   public void top3(){  
 
       if (counter > 2) {
           t0.setSelected(false);
           t1.setSelected(false);
           t2.setSelected(false);
           t3.setSelected(false);
           t4.setSelected(false);
           counter = 0;

       } 
       else  {
           if (t2.isSelected()) {
               counter++;
               System.out.println("check box 3");
               System.out.println(counter);
               topping += "Green Peppers,";
           } else {
               counter--;
               System.out.println("check box 3 deselected");
               System.out.println(counter);
               topping += "";
           }
       }
       changeText();
   
    }
   
   @FXML 
   public void top4(){  
    
   if (counter > 2) {
           t0.setSelected(false);
           t1.setSelected(false);
           t2.setSelected(false);
           t3.setSelected(false);
           t4.setSelected(false);
           counter = 0;

       } else {
           if (t3.isSelected()) {
               counter++;
               System.out.println("check box 4");
               System.out.println(counter);
               topping += "Mushrooms,";
           } else {
               counter--;
               System.out.println("check box 4 deselected");
               System.out.println(counter);
               topping += "";
           }
       }
       changeText();
    
   
    }
   
   @FXML 
   public void top5(){  
    
   if (counter > 2) {
           t0.setSelected(false);
           t1.setSelected(false);
           t2.setSelected(false);
           t3.setSelected(false);
           t4.setSelected(false);
           counter = 0;

       } else {
           if (t4.isSelected()) {
               counter++;
               System.out.println("check box 5");
               System.out.println(counter);
               topping += "Chicken,";
           } else {
               counter--;
               System.out.println("check box 5 deselected");
               System.out.println(counter);
               topping += "";
           } 
       }
       changeText();
    
   
    }
   
   @FXML 
   public void top6(){  
    
       if (counter2 > 2) {

           t5.setSelected(false);
           t6.setSelected(false);
           t7.setSelected(false);
           t8.setSelected(false);
           t9.setSelected(false);
           counter2 = 0;
       }
       else {

           if (t5.isSelected()) {

               counter2++;
               System.out.println("check box 10");
               System.out.println(counter2);
               topping2 += "Pepperoni,";

           } else {
               counter2--;
               System.out.println("check box 2 deselected");
               System.out.println(counter2);
               topping2 += "";
           }
       }
       changeText2();
    }
   
    @FXML 
   public void top7(){  
    
       if (counter2 > 2) {

           t5.setSelected(false);
           t6.setSelected(false);
           t7.setSelected(false);
           t8.setSelected(false);
           t9.setSelected(false);
           counter2 = 0;
       }
       else {

           if (t6.isSelected()) {

               counter2++;
               System.out.println("check box 10");
               System.out.println(counter2);
               topping2 += "Onions,";

           } else {
               counter2--;
               System.out.println("check box 2 deselected");
               System.out.println(counter2);
               topping2 += "";
           }
       }
       changeText2();
       
    
   
    }
   
    @FXML 
   public void top8(){  
    
       if (counter2 > 2) {

           t5.setSelected(false);
           t6.setSelected(false);
           t7.setSelected(false);
           t8.setSelected(false);
           t9.setSelected(false);
           counter2 = 0;
       }
       else {

           if (t7.isSelected()) {

               counter2++;
               System.out.println("check box 10");
               System.out.println(counter2);
               topping2 += "Green Peppers,";

           } else {
               counter2--;
               System.out.println("check box 2 deselected");
               System.out.println(counter2);
               topping2 += "";
           }
       }
       changeText2();
      
    }
   
    @FXML 
   public void top9(){  
    
       if (counter2 > 2) {

           t5.setSelected(false);
           t6.setSelected(false);
           t7.setSelected(false);
           t8.setSelected(false);
           t9.setSelected(false);
           counter2 = 0;
       }
       else {

           if (t8.isSelected()) {

               counter2++;
               System.out.println("check box 10");
               System.out.println(counter2);
               topping2 += "Mushrooms,";

           } else {
               counter2--;
               System.out.println("check box 2 deselected");
               System.out.println(counter2);
               topping2 += "";
           }
       }
       changeText2();

    }
   
    @FXML 
   public void top10(){  
    
       if (counter2 > 2) {

           t5.setSelected(false);
           t6.setSelected(false);
           t7.setSelected(false);
           t8.setSelected(false);
           t9.setSelected(false);
           counter2 = 0;
       }
       else {

           if (t9.isSelected()) {

               counter2++;
               System.out.println("check box 10");
               System.out.println(counter2);
               topping2 += "Chicken,";

           } else {
               counter2--;
               System.out.println("check box 2 deselected");
               System.out.println(counter2);
               topping2 += "";
           }
       }
       changeText2();
       
    
   
    }
   
   @FXML 
   public void top11(){  
    
       if (counter3 > 2) {

           t10.setSelected(false);
           t11.setSelected(false);
           t12.setSelected(false);
           t13.setSelected(false);
           t14.setSelected(false);
           counter3 = 0;
       }
       else {

           if (t10.isSelected()) {

               counter3++;
               topping3 += "Pepperoni,";

           } else {
               counter3--;
               
               topping3 += "";
           }
       }
       changeText3();
       
    
   
    }
   
   @FXML 
   public void top12(){  
    
       if (counter3 > 2) {

           t10.setSelected(false);
           t11.setSelected(false);
           t12.setSelected(false);
           t13.setSelected(false);
           t14.setSelected(false);
           counter3 = 0;
       }
       else {

           if (t11.isSelected()) {

               counter3++;
               topping3 += "Onions,";

           } else {
               counter3--;
               
               topping3 += "";
           }
       }
       changeText3();
    }
   
   @FXML 
   public void top13(){  
    
       if (counter3 > 2) {

           t10.setSelected(false);
           t11.setSelected(false);
           t12.setSelected(false);
           t13.setSelected(false);
           t14.setSelected(false);
           counter3 = 0;
       }
       else {

           if (t12.isSelected()) {

               counter3++;
               topping3 += "Green Pepper,";

           } else {
               counter3--;
               
               topping3 += "";
           }
       }
       changeText3();
       
    
   
    }
   
   @FXML 
   public void top14(){  
    
       if (counter3 > 2) {

           t10.setSelected(false);
           t11.setSelected(false);
           t12.setSelected(false);
           t13.setSelected(false);
           t14.setSelected(false);
           counter3 = 0;
       }
       else {

           if (t13.isSelected()) {

               counter3++;
               topping3 += "Mushroom,";

           } else {
               counter3--;
               
               topping3 += "";
           }
       }
       changeText3();
       
    
   
    }
   
   @FXML 
   public void top15(){  
    
       if (counter3 > 2) {

           t10.setSelected(false);
           t11.setSelected(false);
           t12.setSelected(false);
           t13.setSelected(false);
           t14.setSelected(false);
           counter3 = 0;
       }
       else {

           if (t14.isSelected()) {

               counter3++;
               topping3 += "Chicken,";

           } else {
               counter3--;
               
               topping3 += "";
           }
       }
       changeText3();
       
    
   
    }
   
   @FXML
   public void changeText(){
       if (counter <= 3)
       {
           getStartedC1.setText("ADD");
       }
       if (counter == 0)
       {
           getStartedC1.setText("GET STARTED");
       }
   }
   
   public void changeText2(){
       if (counter2 <= 3)
       {
           getStartedC2.setText("ADD");
       }
       if (counter2 == 0)
       {
           getStartedC2.setText("GET STARTED");
       }
    
   }
   
    public void changeText3(){
       if (counter3 <= 3)
       {
           getStartedC3.setText("ADD");
       }
       if (counter3 == 0)
       {
           getStartedC3.setText("GET STARTED");
       }
    
   }
      
   @FXML
   public void addComboToList(){
       //Pizza pizza1 = new Pizza(12,18.49,topping);
       Combos combo1 = new Combos("GAME TIME COMBO",12,"2 Budweiser Brew",18.49,topping);
       comboList.add(combo1);
       t0.setSelected(false);
       t1.setSelected(false);
       t2.setSelected(false);
       t3.setSelected(false);
       t4.setSelected(false);
       
       getStartedC1.setText("ADD AGAIN");
       showPrice();
   }
   
    @FXML
   public void addCombo2ToList(){
       //Pizza pizza1 = new Pizza(12,18.49,topping);
       Combos combo2 = new Combos("PIZZA AND WINGS",14,"20 Wings",31.48,topping2);
       comboList.add(combo2);
       t5.setSelected(false);
       t6.setSelected(false);
       t7.setSelected(false);
       t8.setSelected(false);
       t9.setSelected(false);
       //System.out.println(comboList.get(1));
       getStartedC2.setText("ADD AGAIN");
       showPrice();
   }
   
   @FXML
   public void addCombo3ToList(){
       //Pizza pizza1 = new Pizza(12,18.49,topping);
       Combos combo3 = new Combos("PIZZA AND TRIO",14,"1 Trio of 5 Wings,Wedges,Chicken Bites",27.99,topping3);
       comboList.add(combo3);
       System.out.println(combo3);
       t10.setSelected(false);
       t11.setSelected(false);
       t12.setSelected(false);
       t13.setSelected(false);
       t14.setSelected(false);
       getStartedC3.setText("ADD AGAIN");
       showPrice();
   }
         
   
   @FXML
   public void addCombo4ToList(){
       Combos cans = new Combos("POP CANS ADD-ON","4 Pops",3.69);
       comboList.add(cans);
       addCans.setText("ADD AGAIN");
       showPrice();
   }
   
    @FXML
   public void addCombo5ToList(){
       Combos cansbread = new Combos("2 POP CANS + GARLIC BREAD ADD-ON","2 Pops,1 Garlic Bread",3.99);
       comboList.add(cansbread);
       addBreadCan.setText("ADD AGAIN");
       showPrice();
   
   }
   
    @FXML
   public void addCombo6ToList(){
       Combos cansdips = new Combos("2 POP CANS + 2 DIPS ADD-ON","2 Dips,2 Pops",2.99);
       comboList.add(cansdips);
       showPrice();
       addCanDips.setText("ADD AGAIN");
   }
   
   @FXML
   public void showPrice(){
   
       double total = 0;
       for (Combos c:comboList){
        
           total += c.getComboPrice();
           System.out.println(c);
           
       }
       
       fpCombos = total;
       System.out.println(total);
       comboL.setText(String.format("%.2f",total));
   }
    
   @FXML
   public void print(){
       PizzaFiles.writeToFileCombos(comboList);
       PizzaFiles.printR(null,null,null,null,comboList);
       comboL.setText("$0.00");    
       
       
       double d = SpecialsController.fpSpecials + MakeOwn.fpMakeOwn + CombosController.fpCombos            
                           + DipsController.fpDips + SidesController.fpSides;            
            
        
        orderL.setText(String.format("%.2f",d));
        comboL.setText("$0.00");
       
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
