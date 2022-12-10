/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodNGOVolunteers;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class FoodNGOVolunteersRequestsDirectory {
    private ArrayList<FoodNGOVolunteersRequests> vrList;
    public FoodNGOVolunteersRequestsDirectory(){
        vrList = new ArrayList();
    }

    public ArrayList<FoodNGOVolunteersRequests> getVrList() {
        return vrList;
    }

    public void setVrList(ArrayList<FoodNGOVolunteersRequests> vrList) {
        this.vrList = vrList;
    }
     public void addVR(FoodNGOVolunteersRequests vr) {
        vrList.add(vr);
    }
}
