/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodPantry;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class FoodPantryDirectory {
    private ArrayList<FoodPantry> fcpList = new ArrayList<FoodPantry>();

    public ArrayList<FoodPantry> getFcpList() {
        return fcpList;
    }

    public void setFcpList(ArrayList<FoodPantry> fcpList) {
        this.fcpList = fcpList;
    }
     public void addNewFCPantry(FoodPantry fcp){
        fcpList.add(fcp);
    }
    public void deleteFCPantry(FoodPantry selectedfcp){
        fcpList.remove(selectedfcp);
    }
}
