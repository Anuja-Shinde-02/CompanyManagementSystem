/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anujshinde
 */

public class Volunteer {
    private String volName;
    private String volId;
    private String volAge;
    private String volAddress;
    private String volCity;
    private String volZipcode;
    private String volState;
    private String volPhno;
    private String volExp;
    private String volAvail;
    private String volNGO;
    
    //getters and setters 
    public String getVolAvail() {
        return volAvail;
    }

    //getters and setters 
    public void setVolAvail(String volAvail) {
        this.volAvail = volAvail;
    }
    
    //getters and setters 
    public String getVolNGO() {
        return volNGO;
    }

    //getters and setters 
    public void setVolNGO(String volNGO) {
        this.volNGO = volNGO;
    }
    
    private UserAccount volAccount;
    private String volUserName;
    private String volPwd;

    //getters and setters 
    public String getVolId() {
        return volId;
    }

    //getters and setters 
    public void setVolId(String volId) {
        this.volId = volId;
    }

    //getters and setters 
    public String getVolAge() {
        return volAge;
    }

    //getters and setters 
    public void setVolAge(String volAge) {
        this.volAge = volAge;
    }

    //getters and setters 
    public String getVolName() {
        return volName;
    }

    //getters and setters 
    public void setVolName(String volName) {
        this.volName = volName;
    }

    //getters and setters 
    public String getVolPhno() {
        return volPhno;
    }

    //getters and setters 
    public void setVolPhno(String volPhno) {
        this.volPhno = volPhno;
    }

    //getters and setters 
    public String getVolZipcode() {
        return volZipcode;
    }

    //getters and setters 
    public void setVolZipcode(String volZipcode) {
        this.volZipcode = volZipcode;
    }    

    //getters and setters 
    public String getVolAddress() {
        return volAddress;
    }

    //getters and setters 
    public void setVolAddress(String volAddress) {
        this.volAddress = volAddress;
    }

    //getters and setters 
    public String getVolCity() {
        return volCity;
    }

    //getters and setters 
    public void setVolCity(String volCity) {
        this.volCity = volCity;
    }

    //getters and setters 
    public String getVolExp() {
        return volExp;
    }

    //getters and setters 
    public void setVolExp(String volExp) {
        this.volExp = volExp;
    }
   
    
    public UserAccount getVolAccount() {
        return volAccount;
    }

    //getters and setters 
    public void setVolAccount(UserAccount volAccount) {
        this.volAccount = volAccount;
    }    
    
    //getters and setters 
    public String getVolState() {
        return volState;
    }

    //getters and setters 
    public void setVolState(String volState) {
        this.volState = volState;
    }

    //getters and setters 
    public String getVolUserName() {
        return volUserName;
    }

    //getters and setters 
    public void setVolUserName(String volUserName) {
        this.volUserName = volUserName;
    }

    //getters and setters 
    public String getVolPwd() {
        return volPwd;
    }

    //getters and setters 
    public void setVolPwd(String volPwd) {
        this.volPwd = volPwd;
    }
    
    @Override
    public String toString(){
        return volId;
    }
    
    
}
