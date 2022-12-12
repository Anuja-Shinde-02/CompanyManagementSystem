/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCPantry;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class FCPantryItemsDirectory {
    //ArrayList
    private ArrayList<FCPantryItems> fcpiList;

    //FCPantryItemsDirectory
    public FCPantryItemsDirectory(){
        fcpiList = new ArrayList<FCPantryItems>();
    }
    
    //ArrayList
    public ArrayList<FCPantryItems> getFcpiList() {
        return fcpiList;
    }

    //getter and setter
    public void setFcpiList(ArrayList<FCPantryItems> fcpiList) {
        this.fcpiList = fcpiList;
    }
    
    //delete items
    public void deleteFCPItems(FCPantryItems selectedfcpi){
        fcpiList.remove(selectedfcpi);
    }
    
    //add items
    public void addFCPItems(FCPantryItems fcpi){
        fcpiList.add(fcpi);
    }
}
