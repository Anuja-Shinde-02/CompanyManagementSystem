/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCWarehouse;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anujashinde
 */

//getters and setters 
public class FCWarehouse {
    
    private String fcwName;
    private String fcwId;
    private String fcwAddres;
    private String fcwCity;
    private String fcwZipcode;
    private String fcwState;
    private String fcwPhno;
    private String fcwAdmin;
    private UserAccount fcwAccount;


    //getters and setters 
    public String getFcwName() {
        return fcwName;
    }

    //getters and setters 
    public void setFcwName(String fcwName) {
        this.fcwName = fcwName;
    }
    
    //getters and setters 
    public String getFcwId() {
        return fcwId;
    }

    //getters and setters 
    public void setFcwId(String fcwId) {
        this.fcwId = fcwId;
    }

    //getters and setters 
    public String getFcwPhno() {
        return fcwPhno;
    }
    
    //getters and setters 
    public void setFcwPhno(String fcwPhno) {
        this.fcwPhno = fcwPhno;
    }

    //getters and setters 
    public String getFcwAddres() {
        return fcwAddres;
    }

    //getters and setters 
    public void setFcwAddres(String fcwAddres) {
        this.fcwAddres = fcwAddres;
    }

    //getters and setters 
    public String getFcwCity() {
        return fcwCity;
    }

    //getters and setters 
    public void setFcwCity(String fcwCity) {
        this.fcwCity = fcwCity;
    }

    //getters and setters 
    public String getFcwZipcode() {
        return fcwZipcode;
    }

    //getters and setters 
    public void setFcwZipcode(String fcwZipcode) {
        this.fcwZipcode = fcwZipcode;
    }

    //getters and setters 
    public String getFcwState() {
        return fcwState;
    }

    //getters and setters 
    public void setFcwState(String fcwState) {
        this.fcwState = fcwState;
    }

    //getters and setters 
    public String getFcwAdmin() {
        return fcwAdmin;
    }

    //getters and setters 
    public void setFcwAdmin(String fcwAdmin) {
        this.fcwAdmin = fcwAdmin;
    }

    public UserAccount getFcwAccount() {
        return fcwAccount;
    }

    //getters and setters 
    public void setFcwAccount(UserAccount fcwAccount) {
        this.fcwAccount = fcwAccount;
    }
   @Override
    public String toString(){
        return fcwId;
    }
}
