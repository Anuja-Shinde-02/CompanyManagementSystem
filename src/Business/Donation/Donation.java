/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donation;

import Business.UserAccount.UserAccount;
import Business.Donor.Donor;

/**
 *
 * @author dristidani
 */

//getters and setters
public class Donation {
    
    private String donatId;
    private String donatDname;
    private String donatFooditem;
    private String donatWHname;
    private String donatAdd;
    private String donatCity;
    private String donatZip;
    private String donatFoodQuant;
    private String donatPickuptype;
    private String donatStatus;
    private String donatVol;
    private UserAccount donatDonorAcc;

    //getters and setters
    public String getDonatAdd() {
        return donatAdd;
    }

    //getters and setters
    public void setDonatAdd(String donatAdd) {
        this.donatAdd = donatAdd;
    }

    //getters and setters
    public String getDonatZip() {
        return donatZip;
    }

    //getters and setters
    public void setDonatZip(String donatZip) {
        this.donatZip = donatZip;
    }
    
    //getters and setters
    public String getDonatCity() {
        return donatCity;
    }

    //getters and setters
    public void setDonatCity(String donatCity) {
        this.donatCity = donatCity;
    }

    //getters and setters
    public String getDonatVol() {
        return donatVol;
    }

    //getters and setters
    public void setDonatVol(String donatVol) {
        this.donatVol = donatVol;
    }
    
    //getters and setters
    public String getDonatFooditem() {
        return donatFooditem;
    }

    //getters and setters
    public void setDonatFooditem(String donatFooditem) {
        this.donatFooditem = donatFooditem;
    }
    
    //getters and setters
    public String getDonatStatus() {
        return donatStatus;
    }

    //getters and setters
    public void setDonatStatus(String donatStatus) {
        this.donatStatus = donatStatus;
    }

    //getters and setters
    public String getDonatFoodQuant() {
        return donatFoodQuant;
    }

    //getters and setters
    public void setDonatFoodQuant(String donatFoodQuant) {
        this.donatFoodQuant = donatFoodQuant;
    }

    public UserAccount getDonatDonorAcc() {
        return donatDonorAcc;
    }

    //getters and setters
    public void setDonatDonorAcc(UserAccount donatDonorAcc) {
        this.donatDonorAcc = donatDonorAcc;
    }

    //getters and setters
    public String getDonatId() {
        return donatId;
    }

    //getters and setters
    public void setDonatId(String donatId) {
        this.donatId = donatId;
    }

    //getters and setters
    public String getDonatWHname() {
        return donatWHname;
    }

    //getters and setters
    public void setDonatWHname(String donatWHname) {
        this.donatWHname = donatWHname;
    }
    
    //getters and setters
    public String getDonatPickuptype() {
        return donatPickuptype;
    }

    //getters and setters
    public void setDonatPickuptype(String donatPickuptype) {
        this.donatPickuptype = donatPickuptype;
    }

    //getters and setters
    public String getDonatDname() {
        return donatDname;
    }

    //getters and setters
    public void setDonatDname(String donatDname) {
        this.donatDname = donatDname;
    }
    @Override
    public String toString(){
        return donatId;
    }
}
