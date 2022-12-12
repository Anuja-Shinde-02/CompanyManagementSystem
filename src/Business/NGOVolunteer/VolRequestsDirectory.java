/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class VolRequestsDirectory {
    //ArrayList
    private ArrayList<VolRequests> vrList;
    
    //VolRequestsDirectory
    public VolRequestsDirectory(){
        vrList = new ArrayList();
    }

    //ArrayList
    public ArrayList<VolRequests> getVrList() {
        return vrList;
    }

    //set list
    public void setVrList(ArrayList<VolRequests> vrList) {
        this.vrList = vrList;
    }
    
    //add VR
    public void addVR(VolRequests vr) {
        vrList.add(vr);
    }
}
