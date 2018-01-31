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
public class Pizza {
    
    
    
   
    private int size;
    
    private String crust;
    
    private double price;
    
    private String toppings;

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public Pizza(int size, double price, String toppings) {
        this.size = size;
        this.price = price;
        this.toppings = toppings;
    }

    public Pizza(int size, String crust, double price, String toppings) {
        this.size = size;
        this.crust = crust;
        this.price = price;
        this.toppings = toppings;
    }
    
    
   

    
    
    public Pizza() { 
        
        price = 0;
        toppings = "";
        
    }

    
    @Override
     public String toString(){
        return "Pizza{"  + ", size=" + size  + ", price=" + price + ", toppings=" +toppings  + '}';
    }

//    }
    public String toFileString(){
        String[] tops = toppings.split(",");
        String p = size +"|" + price;
        
        for(int i =0;i<tops.length;i++){
            p+="|"+tops[i];
        }
        return p;
    }
    
   

    public int getSize() {
        return size;
    }

    public  void setSize(int size) {
        this.size = size;
    }

   

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
