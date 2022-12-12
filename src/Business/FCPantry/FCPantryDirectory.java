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
public class FCPantryDirectory {
    //ArrayList
    private ArrayList<FCPantry> fcpList = new ArrayList<FCPantry>();

    //ArrayList
    public ArrayList<FCPantry> getFcpList() {
        return fcpList;
    }

    //setter
    public void setFcpList(ArrayList<FCPantry> fcpList) {
        this.fcpList = fcpList;
    }
     
    //delete pantry
    public void deleteFCPantry(FCPantry selectedfcp){
        fcpList.remove(selectedfcp);
    }
    
    //add new pantry
    public void addNewFCPantry(FCPantry fcp){
        fcpList.add(fcp);
    }
}
