/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;

import java.util.ArrayList;
import Business.Requestor.Requestor;


/**
 *
 * @author dristidani
 */
public class DonorDirectory {
    //ArrayList
    private ArrayList<Donor> donorList;
    
    public DonorDirectory(){
        donorList = new ArrayList();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    //getter and setter
    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
    //add donor
    public void addDonDir(Donor dd) {
        donorList.add(dd);
    }
    
    //remove donor
    public void removeDonor(Donor d) {
        this.donorList.remove(d);
    }

    //remove donor by index
    public void removeDonByIndex(int index) {
        donorList.remove(index);
    }

    //getter and setter
    public Donor getDonorDetailsByIndex(int index) {
        return donorList.get(index);
    }
    
    int donIdGeneration = 1000;

    public int generateDonOrderId() {
        donIdGeneration++;
        return donIdGeneration;
    }
    public String getdonState(String name){
        for(Donor d: donorList){
            if(d.getDonorAccount().getUsername().equals(name)){
                return d.getDonorState();
            }
        }
        return null;
    }
}
