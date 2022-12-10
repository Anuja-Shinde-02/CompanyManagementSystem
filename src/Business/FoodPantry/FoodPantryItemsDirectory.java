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
public class FoodPantryItemsDirectory {
    private ArrayList<FoodPantryItems> fcpiList;

    public FoodPantryItemsDirectory(){
        fcpiList = new ArrayList<FoodPantryItems>();
    }
    public ArrayList<FoodPantryItems> getFcpiList() {
        return fcpiList;
    }

    public void setFcpiList(ArrayList<FoodPantryItems> fcpiList) {
        this.fcpiList = fcpiList;
    }
    public void addFCPItems(FoodPantryItems fcpi){
        fcpiList.add(fcpi);
    }
    public void deleteFCPItems(FoodPantryItems selectedfcpi){
        fcpiList.remove(selectedfcpi);
    }
}
