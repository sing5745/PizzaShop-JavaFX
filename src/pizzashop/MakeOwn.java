package pizzashop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import pizzashop.PizzaShop;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import Pizza_Class.Pizza;
import Pizza_Class.PizzaFiles;
import java.util.ArrayList;

/**
 *
 * @author inder
 */
public class MakeOwn implements Initializable {
    
    static ArrayList<Pizza> pizzaList = new ArrayList();
    
    @FXML
    private ImageView LOGO;  
    
    @FXML
    private ImageView base;
    
    @FXML
    private StackPane sp;
    
    @FXML
    private Label showSize;
    
    @FXML private Button checkout;
    
    /** Setting IV's and RB's  of  Pepperoni **/
    @FXML
    private ImageView rightPep;@FXML private ImageView leftPep;
    @FXML private ImageView fullPep;@FXML private RadioButton lPep;  
    @FXML private RadioButton fPep; @FXML private RadioButton rPep;  
    @FXML
    private RadioButton nPep; 
    /********/
    
    /** Setting IV's and RB's  of  Bacon **/ 
    @FXML
    private ImageView rightBac; @FXML private ImageView leftBac; 
    @FXML private ImageView fullBac;@FXML private RadioButton lBac;  
    @FXML private RadioButton fBac;@FXML private RadioButton rBac; 
    @FXML
    private RadioButton nBac; 
    /** **/
    
    /** Setting IV's and RB's  of  Chicken **/ 
    @FXML
    private ImageView rightChk; @FXML private ImageView leftChk; @FXML 
    private ImageView fullChk;@FXML private RadioButton lChk;    @FXML
    private RadioButton fChk;  @FXML  private RadioButton rChk; @FXML
    private RadioButton nChk; 
    /** **/
    
    /** Setting IV's and RB's  of  Beef **/ 
    @FXML
    private ImageView rightBf; @FXML private ImageView leftBf;@FXML
    private ImageView fullBf; @FXML private RadioButton lBf; @FXML
    private RadioButton fBf;  @FXML private RadioButton rBf; @FXML
    private RadioButton nBf; 
    /** **/
    
     /** Setting IV's and RB's  of  Italian Sausage **/ 
    @FXML
    private ImageView rightIS;
    @FXML private ImageView leftIS;  @FXML
    private ImageView fullIS; @FXML  private RadioButton lIS;    @FXML
    private RadioButton fIS; @FXML private RadioButton rIS;  @FXML
    private RadioButton nIS; 
    /** **/
    
    /** Setting IV's and RB's  of Salami **/ 
    @FXML
    private ImageView rightSl;
    @FXML private ImageView leftSl;  @FXML
    private ImageView fullSl; @FXML  private RadioButton lSl;    @FXML
    private RadioButton fSl; @FXML private RadioButton rSl;  @FXML
    private RadioButton nSl; 
    /** **/
    
     /** Setting IV's and RB's  of Salami **/ 
    @FXML
    private ImageView rightAn;
    @FXML private ImageView leftAn;  @FXML
    private ImageView fullAn; @FXML  private RadioButton lAn;    @FXML
    private RadioButton fAn; @FXML private RadioButton rAn;  @FXML
    private RadioButton nAn; 
    /** **/
    
     /** Setting IV's and RB's  of Ham **/ 
    @FXML
    private ImageView rightHam;
    @FXML private ImageView leftHam;  @FXML
    private ImageView fullHam; @FXML  private RadioButton lHam;    @FXML
    private RadioButton fHam; @FXML private RadioButton rHam;  @FXML
    private RadioButton nHam; 
    /** **/
    
    /** Setting IV's and RB's  of Mushrooms **/ 
    @FXML
    private ImageView rightM;
    @FXML private ImageView leftM;  @FXML
    private ImageView fullM; @FXML  private RadioButton lM;    @FXML
    private RadioButton fM; @FXML private RadioButton rM;  @FXML
    private RadioButton nM; 
    /** **/
    
    /** Setting IV's and RB's  of Green Peppers **/ 
    @FXML
    private ImageView rightGp;
    @FXML private ImageView leftGp;  @FXML
    private ImageView fullGp; @FXML  private RadioButton lGp;    @FXML
    private RadioButton fGp; @FXML private RadioButton rGp;  @FXML
    private RadioButton nGp; 
    /*******/
    
     /** Setting IV's and RB's  of Onions **/
    @FXML
    private ImageView rightOn;
    @FXML private ImageView leftOn;  @FXML
    private ImageView fullOn; @FXML  private RadioButton lOn;    @FXML
    private RadioButton fOn; @FXML private RadioButton rOn;  @FXML
    private RadioButton nOn; 
     /**********/
    
     /** Setting IV's and RB's  of Tomatoes **/
    @FXML
    private ImageView rightTo;
    @FXML private ImageView leftTo;  @FXML
    private ImageView fullTo; @FXML  private RadioButton lTo;    @FXML
    private RadioButton fTo; @FXML private RadioButton rTo;  @FXML
    private RadioButton nTo; 
    /*******/
    
    /** Setting IV's and RB's  of Black Olives **/
    @FXML
    private ImageView rightBo;
    @FXML private ImageView leftBo;  @FXML
    private ImageView fullBo; @FXML  private RadioButton lBo;    @FXML
    private RadioButton fBo; @FXML private RadioButton rBo;  @FXML
    private RadioButton nBo; 
    /******/
    
    
     /** Setting IV's and RB's  of Green Olives **/
    @FXML
    private ImageView rightGo;
    @FXML private ImageView leftGo;  @FXML
    private ImageView fullGo; @FXML  private RadioButton lGo;    @FXML
    private RadioButton fGo; @FXML private RadioButton rGo;  @FXML
    private RadioButton nGo; 
    /********/
    
    /** Setting IV's and RB's  of Pineapple **/
    @FXML
    private ImageView rightPi;
    @FXML private ImageView leftPi;  @FXML
    private ImageView fullPi; @FXML  private RadioButton lPi;    @FXML
    private RadioButton fPi; @FXML private RadioButton rPi;  @FXML
    private RadioButton nPi; 
    /********/
    
    /** Setting IV's and RB's  of Jala **/
    @FXML
    private ImageView rightJp;
    @FXML private ImageView leftJp;  @FXML
    private ImageView fullJp; @FXML  private RadioButton lJp;    @FXML
    private RadioButton fJp; @FXML private RadioButton rJp;  @FXML
    private RadioButton nJp; 
    /********/
    
    
    public static double fpMakeOwn = 0;
    
    @FXML private Label orderPrice; 
    
    @FXML private Label totalPizzaPrice;
    
    @FXML Button print;
    
    double crustPrice = 0;
    
    String crust = "";
    double price = 0;
    int size = 0;
    double  totalPrice = 0;
    
    String toppings = " ";
    
    double beP,ckP,baP,peP,haP,slP,isP,anP,mP,gP,oP,tP,boP,goP,piP,jP = 0;
    
    String bTop = ""; 
    String cTop = ""; String baTop = ""; String peTop = ""; String hTop = ""; 
    String slTop = ""; String anTop = ""; String isTop = ""; String mTop = ""; 
    String gTop = ""; String oTop = ""; String tTop = ""; String boTop = "";
    String goTop = ""; String piTop = ""; String jTop = "";
  
    @FXML
    private Label showFinalPrice;

    @FXML
    private Button size10; @FXML private Button size12;
    @FXML private Button size14; @FXML private Button size16;
   

    @FXML
    private Button addPizza; @FXML private Button finishOrder; 
    
    /** Crust Radio Buttons **/
    @FXML private RadioButton stuffedCrust; @FXML private RadioButton thinCrust;
    @FXML private RadioButton thickCrust; @FXML private RadioButton regularCrust;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       setToggles();
       base.setVisible(false);
       resetTopDisplay();
       showSize.setVisible(false);
       showFinalPrice.setVisible(false);
       totalPizzaPrice.setVisible(false);


    }

    @FXML
    public void choose10Size() {
        reset();
        base.setVisible(true);
        resetTopDisplay();
        size = 10;
        price = 10.99;
        showPrice();
        showSize.setVisible(true);
        showSize.setText("Small");
        crustPrice = 0;
    }

    @FXML
    public void choose12Size() {
        reset();
        base.setVisible(true);
        resetTopDisplay();
        size = 12;
        price = 12.99;
        showPrice();
        showSize.setVisible(true);
        showSize.setText("Medium");
        crustPrice = 0;
    }

    @FXML
    public void choose14Size() {
        reset();
        base.setVisible(true);
        resetTopDisplay();
        size = 14;
        price = 14.99;
        showPrice();
        showSize.setVisible(true);
        showSize.setText("Large");
        crustPrice = 0;
    }

    @FXML
    public void choose16Size() {
        reset();
        base.setVisible(true);
        resetTopDisplay();
        size = 16;
        price = 16.99;
        showPrice();
        showSize.setVisible(true);
        showSize.setText("X-Large");
        crustPrice = 0;
    }
    
    
   
    @FXML
    public void showBeef(){
      System.out.println(bTop);
      System.out.println(jTop);
      
        if (lBf.isSelected())
        {
            rightBf.setVisible(false);
            fullBf.setVisible(false);
            leftBf.setVisible(true);
            bTop = "half 1 Beef";
            beP = 1.50;
            showPrice();
        }
      
        else if (rBf.isSelected())
        {
            rightBf.setVisible(true);
            fullBf.setVisible(false);
            leftBf.setVisible(false);
            bTop = "half 2 Beef";
            beP = 1.50;
            showPrice();
        }
        
        else if (fBf.isSelected())
        {
            rightBf.setVisible(false);
            fullBf.setVisible(true);
            leftBf.setVisible(false);
            bTop = "Beef";
            beP = 1.50;
            showPrice();
        }
        
        else if (nBf.isSelected())
        
            {
            rightBf.setVisible(false);
            fullBf.setVisible(false);
            leftBf.setVisible(false);
            beP = 0;
            bTop = "";
            showPrice();
           
        }
        
        
    }
    
    
    @FXML
    public void showChk(){
      
        if (lChk.isSelected())
        {
            rightChk.setVisible(false);
            fullChk.setVisible(false);
            leftChk.setVisible(true);
            ckP = 1.50;
            cTop = "half 1 Chicken,";
            showPrice();
        }
      
        else if (rChk.isSelected())
        {
            rightChk.setVisible(true);
            fullChk.setVisible(false);
            leftChk.setVisible(false);
            ckP = 1.50;
            cTop = "half 2 Chicken,";
            showPrice();
        }
        
        else if (fChk.isSelected())
        {
            rightChk.setVisible(false);
            fullChk.setVisible(true);
            leftChk.setVisible(false);
            cTop = "Chicken,";
            ckP = 1.50;
            showPrice();
        }
        
        else if (nChk.isSelected())
        
            {
            rightChk.setVisible(false);
            fullChk.setVisible(false);
            leftChk.setVisible(false);
            ckP = 0;
            cTop = "";
            showPrice();
           
        }
        
        
    }
    
    
    
    
     @FXML
    public void showBac(){
      
        if (lBac.isSelected())
        {
            rightBac.setVisible(false);
            fullBac.setVisible(false);
            leftBac.setVisible(true);
            baTop = "half 1 Bacon,";
            baP = 1.50;
            showPrice();
        }
      
        else if (rBac.isSelected())
        {
            rightBac.setVisible(true);
            fullBac.setVisible(false);
            leftBac.setVisible(false);
            baTop = "half 2 Bacon,";
            baP = 1.50;
            showPrice();
        }
        
        else if (fBac.isSelected())
        {
            rightBac.setVisible(false);
            fullBac.setVisible(true);
            leftBac.setVisible(false);
            baTop = "Bacon,";
            baP = 1.50;
            showPrice();
        }
        
        else if (nBac.isSelected())
        
            {
            rightBac.setVisible(false);
            fullBac.setVisible(false);
            leftBac.setVisible(false);
            baTop = " ";
            baP = 0;
            showPrice();
        }
        
        
    }
    
    
    @FXML
    public void showPep(){
          
        if (lPep.isSelected())
        {
            rightPep.setVisible(false);
            fullPep.setVisible(false);
            leftPep.setVisible(true);
            peP = 1.50;
            peTop = "half 1 Pepperoni,";
            showPrice();
        }
      
        else if (rPep.isSelected())
        {
            rightPep.setVisible(true);
            fullPep.setVisible(false);
            leftPep.setVisible(false);
            peP = 1.50;
            peTop = "half 2 Pepperoni";
            showPrice();
        }
        
        else if (fPep.isSelected())
        {
            rightPep.setVisible(false);
            fullPep.setVisible(true);
            leftPep.setVisible(false);
            peP = 1.50;
            peTop = "Pepperoni,";
            showPrice();
        }
        
        else if (nPep.isSelected())
        {
         
            rightPep.setVisible(false);
            fullPep.setVisible(false);
            leftPep.setVisible(false);
            peP = 0;
            peTop = " ";
            showPrice();
        }
            
           
    }
    
    
    
    @FXML
    public void showIS(){
      
        if (lIS.isSelected())
        {
            rightIS.setVisible(false);
            fullIS.setVisible(false);
            leftIS.setVisible(true);
            isP = 1.50;
            isTop = "half 1 Italian Sausage,";
            showPrice();
        }
      
        else if (rIS.isSelected())
        {
            rightIS.setVisible(true);
            fullIS.setVisible(false);
            leftIS.setVisible(false);
            isP = 1.50;
            isTop = "half 2 Italian Sausage,";
            showPrice();
        }
        
        else if (fIS.isSelected())
        {
            rightIS.setVisible(false);
            fullIS.setVisible(true);
            leftIS.setVisible(false);
            isP = 1.50;
            isTop = "Italian Sausage,";
            showPrice();
        }
        
        else if (nIS.isSelected())
            {
            rightIS.setVisible(false);
            fullIS.setVisible(false);
            leftIS.setVisible(false);  
            isP = 0;
            isTop = " ";
            showPrice();
        }           
    }
    
     @FXML
    public void showSl(){
      
        if (lSl.isSelected())
        {
            rightSl.setVisible(false);
            fullSl.setVisible(false);
            leftSl.setVisible(true);
            slP = 1.50;
            showPrice();
        }
      
        else if (rSl.isSelected())
        {
            rightSl.setVisible(true);
            fullSl.setVisible(false);
            leftSl.setVisible(false);
            slP = 1.50;
            slTop = "half 1 Salami,";
            showPrice();
        }
        
        else if (fSl.isSelected())
        {
            rightSl.setVisible(false);
            fullSl.setVisible(true);
            leftSl.setVisible(false);
            slP = 1.50;
            slTop = "half 2 Salami,";
            showPrice();
        }
        
        else if (nSl.isSelected())
        
            {
            rightSl.setVisible(false);
            fullSl.setVisible(false);
            leftSl.setVisible(false);
            slP = 0;
            slTop = " ";
            showPrice();
        }
        
        
    }
    
    @FXML
    public void showAn(){
      
        if (lAn.isSelected())
        {
            rightAn.setVisible(false);
            fullAn.setVisible(false);
            leftAn.setVisible(true);
            anP = 1.50;
            anTop = "half 1 Anchovies,";
            showPrice();
        }
      
        else if (rAn.isSelected())
        {
            rightAn.setVisible(true);
            fullAn.setVisible(false);
            leftAn.setVisible(false);
            anP = 1.50;
             anTop = "half 2 Anchovies,";
            showPrice();
        }
        
        else if (fAn.isSelected())
        {
            rightAn.setVisible(false);
            fullAn.setVisible(true);
            leftAn.setVisible(false);
            anP = 1.50;
            anTop = "Anchovies,";
            showPrice();
        }
        
        else if (nAn.isSelected())
        
            {
            rightAn.setVisible(false);
            fullAn.setVisible(false);
            leftAn.setVisible(false);
            anP = 0;
            anTop = " ";
            showPrice();
        }
        
        
    }
    
    @FXML
    public void showHam(){
      
        
        if (lHam.isSelected())
        {
            rightHam.setVisible(false);
            fullHam.setVisible(false);
            leftHam.setVisible(true);
            haP = 1.50;
            hTop = "half 1 Ham,";
            showPrice();
        }
      
        else if (rHam.isSelected())
        {
            rightHam.setVisible(true);
            fullHam.setVisible(false);
            leftHam.setVisible(false);
            hTop = "half 2 Ham,";
            haP = 1.50;
            showPrice();
        }
        
        else if (fHam.isSelected())
        {
            rightHam.setVisible(false);
            fullHam.setVisible(true);
            leftHam.setVisible(false);
            hTop = "Ham,";
            haP = 1.50;
            showPrice();
        }
        
        else if (nHam.isSelected())
        {
         
            rightHam.setVisible(false);
            fullHam.setVisible(false);
            leftHam.setVisible(false);
            haP = 0;
            hTop = " ";
            showPrice();
        }
            
           
    }
     
    @FXML
    public void showMu(){
        if (lM.isSelected())
        {
            rightM.setVisible(false);
            fullM.setVisible(false);
            leftM.setVisible(true);
            mTop = "half 1 Mushroom,";
            mP = 1.0;
            
            showPrice();
        }
      
        else if (rM.isSelected())
        {
            rightM.setVisible(true);
            fullM.setVisible(false);
            leftM.setVisible(false);
            mTop = "half 2 Mushroom,";
            mP = 1.0;
            
            showPrice();
        }
        
        else if (fM.isSelected())
        {
            rightM.setVisible(false);
            fullM.setVisible(true);
            leftM.setVisible(false);
            mTop = "Mushroom,";
            mP = 1.0;
            
            showPrice();
        }
        
        else if (nM.isSelected())
        {
         
            rightM.setVisible(false);
            fullM.setVisible(false);
            leftM.setVisible(false);
            mTop = " ";
            mP = 0;
            showPrice();
        
        }
    }
    
    @FXML
    public void showGp(){
        if (lGp.isSelected())
        {
            rightGp.setVisible(false);
            fullGp.setVisible(false);
            leftGp.setVisible(true);
            gP = 1;
            gTop = "half 1 Green Peppers,";
            showPrice();
        }
      
        else if (rGp.isSelected())
        {
            rightGp.setVisible(true);
            fullGp.setVisible(false);
            leftGp.setVisible(false);
            gP = 1;
            gTop = "half 2 Green Peppers,";
            showPrice();
        }
        
        else if (fGp.isSelected())
        {
            rightGp.setVisible(false);
            fullGp.setVisible(true);
            leftGp.setVisible(false);
            gP = 1;
            gTop = "Green Peppers,";
            showPrice();
        }
        
        else if (nGp.isSelected())
        {
         
            rightGp.setVisible(false);
            fullGp.setVisible(false);
            leftGp.setVisible(false);
            gP = 0;
            gTop = " ";
            showPrice();
        }
            
    }
    
     @FXML
    public void showOn(){
        if (lOn.isSelected())
        {
            rightOn.setVisible(false);
            fullOn.setVisible(false);
            leftOn.setVisible(true);
            oP = 1;
            oTop = "half 1 Onions,";
            showPrice();
        }
      
        else if (rOn.isSelected())
        {
            rightOn.setVisible(true);
            fullOn.setVisible(false);
            leftOn.setVisible(false);
            oP = 1;
            oTop = "half 2 Onions,";
            showPrice();
        }
        
        else if (fOn.isSelected())
        {
            rightOn.setVisible(false);
            fullOn.setVisible(true);
            leftOn.setVisible(false);
            oP = 1;
            oTop = "Onions,";
            showPrice();
        }
        
        else if (nOn.isSelected())
        {
            rightOn.setVisible(false);
            fullOn.setVisible(false);
            leftOn.setVisible(false);
            oP = 0;
            oTop = " ";
            showPrice();
        }
            
    }
    
    @FXML
    public void showTo(){
        if (lTo.isSelected())
        {
            rightTo.setVisible(false);
            fullTo.setVisible(false);
            leftTo.setVisible(true);
            tP = 1;
            tTop = "half 1 Tomatoes,";
            showPrice();
        }
      
        else if (rTo.isSelected())
        {
            rightTo.setVisible(true);
            fullTo.setVisible(false);
            leftTo.setVisible(false);
            tP = 1;
            tTop = "half 2 Tomatoes,";
            showPrice();
        }
        
        else if (fTo.isSelected())
        {
            rightTo.setVisible(false);
            fullTo.setVisible(true);
            leftTo.setVisible(false);
            tP = 1;
            tTop = "Tomatoes,";
            showPrice();
        }
        
        else if (nTo.isSelected())
        {
         
            rightTo.setVisible(false);
            fullTo.setVisible(false);
            leftTo.setVisible(false);
            tP = 0;
            tTop = " ";
            showPrice();
        }
            
    }
    
    @FXML
    public void showBo(){
        if (lBo.isSelected())
        {
            rightBo.setVisible(false);
            fullBo.setVisible(false);
            leftBo.setVisible(true);
            boP = 1;
            boTop = "half 1 Black Olives,";
            showPrice();
        }
      
        else if (rBo.isSelected())
        {
            rightBo.setVisible(true);
            fullBo.setVisible(false);
            leftBo.setVisible(false);
            boP = 1;
            boTop = "half 2 Black Olives,";
            showPrice();
        }
        
        else if (fBo.isSelected())
        {
            rightBo.setVisible(false);
            fullBo.setVisible(true);
            leftBo.setVisible(false);
            boP = 1;
            boTop = "Black Olives,";
            showPrice();
        }
        
        else if (nBo.isSelected())
        {
            rightBo.setVisible(false);
            fullBo.setVisible(false);
            leftBo.setVisible(false);
            boP = 0;
            boTop = " ";
            showPrice();
        }
            
    }
    
    @FXML
    public void showGo(){
        if (lGo.isSelected())
        {
            rightGo.setVisible(false);
            fullGo.setVisible(false);
            leftGo.setVisible(true);
            goP = 1;
            goTop = "half 1 Green Olives,";
            showPrice();
        }
      
        else if (rGo.isSelected())
        {
            rightGo.setVisible(true);
            fullGo.setVisible(false);
            leftGo.setVisible(false);
            goP = 1;
            goTop = "half 2 Green Olives,";
            showPrice();
        }
        
        else if (fGo.isSelected())
        {
            rightGo.setVisible(false);
            fullGo.setVisible(true);
            leftGo.setVisible(false);
            goP = 1;
            goTop = "Green Olives,";
            showPrice();
        }
        
        else if (nGo.isSelected())
        {
         
            rightGo.setVisible(false);
            fullGo.setVisible(false);
            leftGo.setVisible(false);
            goP = 0;
            goTop = " ";
            showPrice();
        }
            
    }
    
    @FXML
    public void showPi(){
        if (lPi.isSelected())
        {
            rightPi.setVisible(false);
            fullPi.setVisible(false);
            leftPi.setVisible(true);
            piP = 1;
            piTop = "half 1 Pineapple,";
            showPrice();
        }
      
        else if (rPi.isSelected())
        {
            rightPi.setVisible(true);
            fullPi.setVisible(false);
            leftPi.setVisible(false);
            piP = 1;
            piTop = "half 2 Pineapple,";
            showPrice();
        }
        
        else if (fPi.isSelected())
        {
            rightPi.setVisible(false);
            fullPi.setVisible(true);
            leftPi.setVisible(false);
            piP = 1;
            piTop = "Pineapple,";
            showPrice();
        }
        
        else if (nPi.isSelected())
        {
         
            rightPi.setVisible(false);
            fullPi.setVisible(false);
            leftPi.setVisible(false);
            piP = 0;
            piTop = " ";
            showPrice();
        
        }
            
    }
    
    @FXML
    public void showJp(){
        if (lJp.isSelected())
        {
            rightJp.setVisible(false);
            fullJp.setVisible(false);
            leftJp.setVisible(true);
            jP = 1;
            jTop = "half 1 Jalapeno,";
            showPrice();
        }
      
        else if (rJp.isSelected())
        {
            rightJp.setVisible(true);
            fullJp.setVisible(false);
            leftJp.setVisible(false);
            jP = 1;
            jTop = "half 2 Jalapeno,";
            showPrice();
        }
        
        else if (fJp.isSelected())
        {
            rightJp.setVisible(false);
            fullJp.setVisible(true);
            leftJp.setVisible(false);
            jP = 1;
            jTop = "Jalapeno,";
            showPrice();
        }
        
        else if (nJp.isSelected())
        {
         
            rightJp.setVisible(false);
            fullJp.setVisible(false);
            leftJp.setVisible(false);
            jP = 0;
            jTop = " ";
            showPrice();
        
        }
            
    }
    
    
    

    @FXML
    public void addStuffedCrust() {
      if (stuffedCrust.isSelected()) 
      {   
        crustPrice = 1;
        crust="Stuffed";
        showPrice();
      }
    }

    @FXML
    public void addThinCrust() {
      if (thinCrust.isSelected())  
      {   
        crustPrice = 1;
        crust="Thin";
        showPrice();
      }
    }

    @FXML
    public void addThickCrust() {
      if (thickCrust.isSelected()) 
      {
        crustPrice = 1;
        crust="Thick";
        showPrice();
      }
      else
          crustPrice = 0;
      
    }

    @FXML
    public void addRegularCrust() {
       if (regularCrust.isSelected()) 
       {    
        crustPrice = 1;
        crust="Regular";
        showPrice();
       }
       else 
           crustPrice = 0;
    }


    
    @FXML
    public void reset(){
     
     
     stuffedCrust.setSelected(false);
     thinCrust.setSelected(false);
     thickCrust.setSelected(false);
     regularCrust.setSelected(false);
     
    }
    
    @FXML
    public void resetTopDisplay(){
        fullPep.setVisible(false);
        leftPep.setVisible(false);
        rightPep.setVisible(false);
        fullBac.setVisible(false);
        leftBac.setVisible(false);
        rightBac.setVisible(false);
        leftChk.setVisible(false);
        rightChk.setVisible(false);
        fullChk.setVisible(false);
        leftBf.setVisible(false);
        rightBf.setVisible(false);
        fullBf.setVisible(false);
        fullIS.setVisible(false);
        leftIS.setVisible(false);
        rightIS.setVisible(false);
        rightSl.setVisible(false);
        leftSl.setVisible(false);
        fullSl.setVisible(false);
        fullAn.setVisible(false);
        leftAn.setVisible(false);
        rightAn.setVisible(false);
        rightHam.setVisible(false);
        leftHam.setVisible(false);
        fullHam.setVisible(false);
        fullM.setVisible(false);
        leftM.setVisible(false);
        rightM.setVisible(false);
        rightGp.setVisible(false);
        leftGp.setVisible(false);
        fullGp.setVisible(false);
        fullOn.setVisible(false);
        leftOn.setVisible(false);
       rightOn.setVisible(false);
       rightTo.setVisible(false);
       leftTo.setVisible(false);
       fullTo.setVisible(false);
       rightBo.setVisible(false);
       leftBo.setVisible(false);
       fullBo.setVisible(false);
       rightGo.setVisible(false);
       leftGo.setVisible(false);
       fullGo.setVisible(false);
       fullPi.setVisible(false);
       leftPi.setVisible(false);
       rightPi.setVisible(false);
       rightJp.setVisible(false);
       fullJp.setVisible(false);
       leftJp.setVisible(false);
       
    }
    
    @FXML
    public void showPrice() {
        totalPrice = ((int)(price * 100)/100.00 + beP + ckP + baP + peP + haP + isP + slP +  anP + mP + gP + oP + tP + goP + boP + jP + crustPrice);
        
        double fp = 0;
         for (Pizza p:pizzaList)
        {
            fp += p.getPrice();
            System.out.println(p);
        }
        
         fpMakeOwn = fp;
         
        System.out.println(fp);
        
        
        
        showFinalPrice.setText(String.format( "%.2f",totalPrice));
        
        totalPizzaPrice.setText("" + fpMakeOwn);
        
        showFinalPrice.setVisible(true);
        totalPizzaPrice.setVisible(true);
        
        
    }
    
    
    
   
    
    
    @FXML
    public  void addPizzaToList() {
        reset();
        bTop += ",";
        toppings = bTop + cTop + baTop + peTop + hTop + slTop + isTop + anTop + mTop + gTop + oTop + tTop + boTop + goTop + piTop + jTop;
        String[] sl = toppings.split(",");
        Pizza pizza = new Pizza(size,crust,totalPrice,toppings);
        pizzaList.add(pizza);        
        showPrice();
        toppings = bTop = cTop = baTop = peTop = hTop = slTop = isTop = anTop = mTop = gTop = oTop = tTop = bTop = gTop = piTop = jTop= "";
        price = beP = ckP = baP = peP = haP = isP = slP = anP = mP = gP = oP = tP = boP = goP = piP = jP = crustPrice = 0;        
        showFinalPrice.setText("$0.00");
        base.setVisible(false);
        resetTopDisplay();
        resetTopButtons();
        showSize.setVisible(false);
        showFinalPrice.setVisible(false);
    }

    public void printReciept(){
       PizzaFiles.writeToFileCreateOwn(pizzaList);
       PizzaFiles.printR(null, null, pizzaList,null,null);
         
     
       double orderP =   SpecialsController.fpSpecials  + fpMakeOwn + CombosController.fpCombos
                           + DipsController.fpDips + SidesController.fpSides;
        
       orderPrice.setText(String.format("%.2f",orderP));
       
      
    }
  
    @FXML
    public void showMain() {
        PizzaShop.showMain();
    }
    
    public void setToggles(){
        ToggleGroup chooseCrust = new ToggleGroup();
        stuffedCrust.setToggleGroup(chooseCrust);
        thinCrust.setToggleGroup(chooseCrust);
        thickCrust.setToggleGroup(chooseCrust);
        regularCrust.setToggleGroup(chooseCrust);
        
        ToggleGroup choosePep = new ToggleGroup();
        lPep.setToggleGroup(choosePep);
        rPep.setToggleGroup(choosePep);
        fPep.setToggleGroup(choosePep);
        nPep.setToggleGroup(choosePep);
        
        ToggleGroup chooseBac = new ToggleGroup();
        lBac.setToggleGroup(chooseBac);
        rBac.setToggleGroup(chooseBac);
        fBac.setToggleGroup(chooseBac);
        nBac.setToggleGroup(chooseBac);
        
        ToggleGroup chooseChk = new ToggleGroup();
        lChk.setToggleGroup(chooseChk);
        rChk.setToggleGroup(chooseChk);
        fChk.setToggleGroup(chooseChk);
        nChk.setToggleGroup(chooseChk);
        
        ToggleGroup chooseBeef = new ToggleGroup();
        lBf.setToggleGroup(chooseBeef);
        rBf.setToggleGroup(chooseBeef);
        fBf.setToggleGroup(chooseBeef);
        nBf.setToggleGroup(chooseBeef);
    
        ToggleGroup chooseIS = new ToggleGroup();
        lIS.setToggleGroup(chooseIS);
        rIS.setToggleGroup(chooseIS);
        fIS.setToggleGroup(chooseIS);
        nIS.setToggleGroup(chooseIS);
        
        ToggleGroup chooseSl = new ToggleGroup();
        lSl.setToggleGroup(chooseSl);
        rSl.setToggleGroup(chooseSl);
        fSl.setToggleGroup(chooseSl);
        nSl.setToggleGroup(chooseSl);
        
        ToggleGroup chooseAn = new ToggleGroup();
        lAn.setToggleGroup(chooseAn);
        fAn.setToggleGroup(chooseAn);
        rAn.setToggleGroup(chooseAn);
        nAn.setToggleGroup(chooseAn);
        
        ToggleGroup chooseHam = new ToggleGroup();
        lHam.setToggleGroup(chooseHam);
        rHam.setToggleGroup(chooseHam);
        fHam.setToggleGroup(chooseHam);
        nHam.setToggleGroup(chooseHam);
        
        ToggleGroup chooseMu = new ToggleGroup();
        lM.setToggleGroup(chooseMu);
        rM.setToggleGroup(chooseMu);
        fM.setToggleGroup(chooseMu);
        nM.setToggleGroup(chooseMu);
        
        ToggleGroup chooseGp = new ToggleGroup();
        lGp.setToggleGroup(chooseGp);
        rGp.setToggleGroup(chooseGp);
        fGp.setToggleGroup(chooseGp);
        nGp.setToggleGroup(chooseGp);
        
        ToggleGroup chooseOn = new ToggleGroup();
        lOn.setToggleGroup(chooseOn);
        rOn.setToggleGroup(chooseOn);
        fOn.setToggleGroup(chooseOn);
        nOn.setToggleGroup(chooseOn);
        
        
        ToggleGroup chooseTo = new ToggleGroup();
        lTo.setToggleGroup(chooseTo);
        rTo.setToggleGroup(chooseTo);
        fTo.setToggleGroup(chooseTo);
        nTo.setToggleGroup(chooseTo);
        
        
        ToggleGroup chooseBo = new ToggleGroup();
        lBo.setToggleGroup(chooseBo);
        rBo.setToggleGroup(chooseBo);
        fBo.setToggleGroup(chooseBo);
        nBo.setToggleGroup(chooseBo); 
        
        
        
        ToggleGroup chooseGo = new ToggleGroup();
        lGo.setToggleGroup(chooseGo);
        rGo.setToggleGroup(chooseGo);
        fGo.setToggleGroup(chooseGo);
        nGo.setToggleGroup(chooseGo);
        
        ToggleGroup choosePi = new ToggleGroup();
        lPi.setToggleGroup(choosePi);
        rPi.setToggleGroup(choosePi);
        fPi.setToggleGroup(choosePi);
        nPi.setToggleGroup(choosePi);
        
        ToggleGroup chooseJp = new ToggleGroup();
        lJp.setToggleGroup(chooseJp);
        rJp.setToggleGroup(chooseJp);
        fJp.setToggleGroup(chooseJp);
        nJp.setToggleGroup(chooseJp);
               
        
        
        
        
    }
    
    public void resetTopButtons(){
    
    
        lBf.setSelected(false);
        fBf.setSelected(false);
        rBf.setSelected(false);
        nBf.setSelected(false);
        
        lChk.setSelected(false);
        fChk.setSelected(false);
        rChk.setSelected(false);
        nChk.setSelected(false);
        
        lBac.setSelected(false);
        fBac.setSelected(false);
        rBac.setSelected(false);
        nBac.setSelected(false);
        
        lPep.setSelected(false);
        fPep.setSelected(false);
        rPep.setSelected(false);
        nPep.setSelected(false);
        
        lHam.setSelected(false);
        fHam.setSelected(false);
        rHam.setSelected(false);
        nHam.setSelected(false);
        
        lSl.setSelected(false);
        fSl.setSelected(false);
        rSl.setSelected(false);
        nSl.setSelected(false);
        
        lIS.setSelected(false);
        fIS.setSelected(false);
        rIS.setSelected(false);
        nIS.setSelected(false);
        
        lAn.setSelected(false);
        fAn.setSelected(false);
        rAn.setSelected(false);
        nAn.setSelected(false);
        
        fM.setSelected(false);
        rM.setSelected(false);
        lM.setSelected(false);
        nM.setSelected(false);
        
        fGp.setSelected(false);
        rGp.setSelected(false);
        lGp.setSelected(false);
        nGp.setSelected(false);
        
        fOn.setSelected(false);
        rOn.setSelected(false);
        lOn.setSelected(false);
        nOn.setSelected(false);
        
        fTo.setSelected(false);
        rTo.setSelected(false);
        lTo.setSelected(false);
        nTo.setSelected(false);
        
        fBo.setSelected(false);
        rBo.setSelected(false);
        lBo.setSelected(false);
        nBo.setSelected(false);
        
        fGo.setSelected(false);
        rGo.setSelected(false);
        lGo.setSelected(false);
        nGo.setSelected(false);
        
        
        fPi.setSelected(false);
        rPi.setSelected(false);
        lPi.setSelected(false);
        nPi.setSelected(false);
        
        
        
        fJp.setSelected(false);
        rJp.setSelected(false);
        lJp.setSelected(false);
        nJp.setSelected(false);
        
        
    }
    
    @FXML
    public void checkOut(){
    
        PizzaShop.showReciept();
         
        
    }
    
    
}
