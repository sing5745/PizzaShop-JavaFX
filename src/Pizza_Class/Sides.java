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
public class Sides {
    
    private String sideName;
    private double sidePrice;

    public Sides(String sideName, double sidePrice) {
        this.sideName = sideName;
        this.sidePrice = sidePrice;
    }

    public Sides() {
    }

    @Override
    public String toString() {
        return "Sides{" + "sideName=" + sideName + ", sidePrice=" + sidePrice + '}';
    }
    
    
    public String toFileSideString() {
        return sideName + "|" +sidePrice ;
    }

    public String getSideName() {
        return sideName;
    }

    public void setSideName(String sideName) {
        this.sideName = sideName;
    }

    public double getSidePrice() {
        return sidePrice;
    }

    public void setSidePrice(double sidePrice) {
        this.sidePrice = sidePrice;
    }
    
    
    
}
