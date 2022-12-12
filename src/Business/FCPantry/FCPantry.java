/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCPantry;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anujashinde
 */

//getters and setters 
//perform constructor
public class FCPantry {
    private String fcpId;
    private String fcpName;
    private String fcpPhno;
    private String fcpAddres;
    private String fcpCity;
    private String fcpZipcode;
    private String fcpState;
    private String fcpWHname;
    private String fcpManager;
    private UserAccount fcpAccount;

    //getters and setters 
    public String getFcpId() {
        return fcpId;
    }

    //getters and setters 
    public void setFcpId(String fcpId) {
        this.fcpId = fcpId;
    }

    //getters and setters 
    public String getFcpName() {
        return fcpName;
    }
    //getters and setters 
    public void setFcpName(String fcpName) {
        this.fcpName = fcpName;
    }
    //getters and setters 
    public String getFcpWHname() {
        return fcpWHname;
    }
    //getters and setters 
    public void setFcpWHname(String fcpWHname) {
        this.fcpWHname = fcpWHname;
    }
    //getters and setters 
    public String getFcpAddres() {
        return fcpAddres;
    }
    //getters and setters 
    public void setFcpAddres(String fcpAddres) {
        this.fcpAddres = fcpAddres;
    }
    //getters and setters 
    public String getFcpCity() {
        return fcpCity;
    }
    //getters and setters 
    public void setFcpCity(String fcpCity) {
        this.fcpCity = fcpCity;
    }
    //getters and setters 
    public String getFcpZipcode() {
        return fcpZipcode;
    }
    //getters and setters 
    public void setFcpZipcode(String fcpZipcode) {
        this.fcpZipcode = fcpZipcode;
    }
    //getters and setters 
    public String getFcpState() {
        return fcpState;
    }
    //getters and setters 
    public void setFcpState(String fcpState) {
        this.fcpState = fcpState;
    }
    //getters and setters 
    public String getFcpPhno() {
        return fcpPhno;
    }
    //getters and setters 
    public void setFcpPhno(String fcpPhno) {
        this.fcpPhno = fcpPhno;
    }
    //getters and setters 
    public String getFcpManager() {
        return fcpManager;
    }
    //getters and setters 
    public void setFcpManager(String fcpManager) {
        this.fcpManager = fcpManager;
    }

    public UserAccount getFcpAccount() {
        return fcpAccount;
    }
    //getters and setters 
    public void setFcpAccount(UserAccount fcpAccount) {
        this.fcpAccount = fcpAccount;
    }
    @Override
    public String toString(){
        return fcpId;
    }
    
}
