/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza_Class;


/**
 *
 * @author inder
 */

/**  Class for sides and combos **/

public class Combos extends Pizza {
    
    private String ComboName;
    
   private String toppings;
    
    private String anySide;
    
    private double comboPrice;
    
    private int size;

    

    public Combos(String ComboName,int size,String anySide,double comboPrice,String toppings) {
        this.ComboName = ComboName;
        this.anySide = anySide;
        this.comboPrice = comboPrice;
        this.size = size;
        this.toppings = toppings;
    }

    public Combos(String ComboName, String anySide,double comboPrice) {
        this.ComboName = ComboName;
        
        this.anySide = anySide;
        this.comboPrice = comboPrice;
    }

   

    public String getComboName() {
        return ComboName;
    }

    public void setComboName(String ComboName) {
        this.ComboName = ComboName;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

   

    public String getAnySide() {
        return anySide;
    }

    public void setAnySide(String anySide) {
        this.anySide = anySide;
    }

    public double getComboPrice() {
        return comboPrice;
    }

    public void setComboPrice(double comboPrice) {
        this.comboPrice = comboPrice;
    }
    
   
    
//    @Override
//     public String toString(){
//        return "Combo{"  + "Combo=" + ComboName + ", size=" + getSize()  + ", price=" + comboPrice + ", toppings=" +getToppings() + ", Side=" + anySide  + '}';
//    }
//     

    @Override
    public String toString(){
        return "Combos{" + "ComboName=" + ComboName +  ", anySide=" + anySide + ", comboPrice=" + comboPrice + ", size=" + size + '}';
    }
    
    public String toFileString(){
        return   ComboName +  "|" + anySide + "|" + comboPrice + "|" + size + "|" + toppings;
    }
     

    

   
    
    
    
    
    
    
    
}
