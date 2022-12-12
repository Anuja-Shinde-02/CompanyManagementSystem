/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCPantry;

/**
 *
 * @author anujashinde
 */

//getters and setters 
public class FCPantryItems {
    
    private String fcpWHname;
    private String pantryName;
    private String fcpitemid;
    private String pantryManager;
    private String foodItem;
    private int foodQuan;

    //getters and setters 
    public void setFcpitemid(String fcpitemid) {
        this.fcpitemid = fcpitemid;
    }

    //getters and setters 
    public String getFcpWHname() {
        return fcpWHname;
    }

    //getters and setters 
    public String getFcpitemid() {
        return fcpitemid;
    }

    //getters and setters 
    public void setFcpWHname(String fcpWHname) {
        this.fcpWHname = fcpWHname;
    }

    //getters and setters 
    public String getPantryName() {
        return pantryName;
    }

    //getters and setters 
    public void setPantryName(String pantryName) {
        this.pantryName = pantryName;
    }

    //getters and setters 
    public int getFoodQuan() {
        return foodQuan;
    }

    //getters and setters 
    public void setFoodQuan(int foodQuan) {
        this.foodQuan = foodQuan;
    }

    //getters and setters 
    public String getPantryManager() {
        return pantryManager;
    }

    //getters and setters 
    public void setPantryManager(String pantryManager) {
        this.pantryManager = pantryManager;
    }

    //getters and setters 
    public String getFoodItem() {
        return foodItem;
    }

    //getters and setters 
    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }
    
    @Override
    public String toString(){
        return fcpitemid;
    }
}
