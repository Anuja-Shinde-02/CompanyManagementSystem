/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donation;

import java.util.ArrayList;

/**
 *
 * @author dristidani
 */
public class DonationDirectory {
    public ArrayList<Donation> donatList = new ArrayList<Donation>();;
    
    //DonationDirectory
    public DonationDirectory(){
        donatList = new ArrayList();
    }

    public ArrayList<Donation> getDonatList() {
        return donatList;
    }

    //donation list
    public void setDonatList(ArrayList<Donation> donatList) {
        this.donatList = donatList;
    }
    
    //delete donation
    public void deleteDonation(Donation selectedD){
        donatList.remove(selectedD);
    }
    
    //add donation
    public void addNewDonation(Donation dt){
        donatList.add(dt);
    }
}
