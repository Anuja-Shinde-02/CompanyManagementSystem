/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodWarehouse;

import java.util.ArrayList;
import Business.FoodWarehouse.FoodWarehouseDirectory;

/**
 *
 * @author anujashinde
 */
public class FoodWarehouseDirectory {
     ArrayList<FoodWarehouse> fcwList;

     public FoodWarehouseDirectory(){
         fcwList = new ArrayList<FoodWarehouse>();
     }
    public ArrayList<FoodWarehouse> getFcwList() {
        return fcwList;
    }

    public void setFcwList(ArrayList<FoodWarehouse> fcwList) {
        this.fcwList = fcwList;
    }
    public void addNewFCWarehouse(FoodWarehouse fcw){
        fcwList.add(fcw);
    }
    public void deleteFCWarehouse(FoodWarehouse selectedfcw){
        fcwList.remove(selectedfcw);
    }
    public String getWHname(String FCAname){
        String WHname;
        for(FoodWarehouse f: fcwList){
            if(f.getFcwAdmin().equals(FCAname)){
                return f.getFcwName();
            }
        }
        return null;
    }
}
