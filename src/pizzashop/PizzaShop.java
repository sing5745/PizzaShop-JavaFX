package pizzashop;


import Pizza_Class.PizzaFiles;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author inder
 */
public class PizzaShop extends Application {
    
     static Stage mainStage = new Stage();
     static Stage combosStage = new Stage();
     static Stage sideStage = new Stage();
     static Stage dipStage = new Stage();
     static Stage specialStage = new Stage();
     static Stage makeOwnStage = new Stage();
     static Stage recieptStage = new Stage();
    
    @Override
    public void start(Stage stage) throws Exception {
        

          
        FXMLLoader m = new FXMLLoader(getClass().getResource("main.fxml"));
        FXMLLoader c = new FXMLLoader(getClass().getResource("combos2.fxml"));
        FXMLLoader s = new FXMLLoader(getClass().getResource("sides.fxml"));
        FXMLLoader d = new FXMLLoader(getClass().getResource("dips.fxml"));
        FXMLLoader mo = new FXMLLoader(getClass().getResource("makeown.fxml")); 
        FXMLLoader sp = new FXMLLoader(getClass().getResource("specials.fxml"));
        FXMLLoader rt = new FXMLLoader(getClass().getResource("Reciept.fxml"));
         
         
        
        Parent root1 = m.load();
        Parent root2 = c.load();
        Parent root3 = s.load();
        Parent root4 = d.load();
        Parent root5 = mo.load();
        Parent root6 = sp.load();
        Parent root7 = rt.load();
        
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);
        Scene scene5 = new Scene(root5);
        Scene scene6 = new Scene(root6);
        Scene scene7 = new Scene(root7);
        
        mainStage.setScene(scene1);
        combosStage.setScene(scene2);
        sideStage.setScene(scene3);
        dipStage.setScene(scene4);
        makeOwnStage.setScene(scene5);
        specialStage.setScene(scene6);
        recieptStage.setScene(scene7);
        PizzaFiles.initReceipt();
        showMain();
    
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void showMain(){
        mainStage.show();
        combosStage.hide();
        sideStage.hide();
        dipStage.hide();
        makeOwnStage.hide();
        specialStage.hide();
//        double d = SpecialsController.fpSpecials  + MakeOwn.fpMakeOwn + CombosController.fpCombos
//                           + DipsController.fpDips + SidesController.fpSides;
//        mainController.orderPrice.setText(String.format("%.2f",d));
        
    }
    
    public static void showCombos(){
        mainStage.hide();
        combosStage.show();
        sideStage.hide();
        dipStage.hide();
        makeOwnStage.hide();
        recieptStage.hide();
    }
    
    public static void showSides(){
        mainStage.hide();
        combosStage.hide();
        sideStage.show();
        dipStage.hide();
        makeOwnStage.hide();
        specialStage.hide();
        recieptStage.hide();
    }
    
     public static void showDips(){
        mainStage.hide();
        combosStage.hide();
        sideStage.hide();
        dipStage.show();
        makeOwnStage.hide();
        specialStage.hide();
        recieptStage.hide();
    }
     
    public static void showMakeOwn(){
        mainStage.hide();
        combosStage.hide();
        sideStage.hide();
        dipStage.hide();
        makeOwnStage.show();
        specialStage.hide();
         recieptStage.hide();
    } 
    
    @FXML
    public static void showSpecials(){
        mainStage.hide();
        combosStage.hide();
        sideStage.hide();
        dipStage.hide();
        makeOwnStage.hide();
        specialStage.show();
        recieptStage.hide();
        
    }
    
    @FXML
    public static void showReciept(){
        mainStage.hide();
        combosStage.hide();
        sideStage.hide();
        dipStage.hide();
        makeOwnStage.hide();
        specialStage.hide();
        recieptStage.show();
    }
    
   
    
}
