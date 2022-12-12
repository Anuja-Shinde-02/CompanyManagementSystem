/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGO;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anujashide 
 */

public class NGO {
    
    private String ngoId;
    private String ngoName;
    private String ngoAddress;
    private String ngoCity;
    private String ngoZipcode;
    private String ngoState;
    private String ngoPhno;
    private String ngoAgent;
    private UserAccount ngoAccount;

    //getters and setters 
    public String getNgoId() {
        return ngoId;
    }

    //getters and setters 
    public void setNgoId(String ngoId) {
        this.ngoId = ngoId;
    }

    //getters and setters 
    public String getNgoName() {
        return ngoName;
    }

    //getters and setters 
    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    //getters and setters 
    public String getNgoAddress() {
        return ngoAddress;
    }

    //getters and setters 
    public void setNgoAddress(String ngoAddress) {
        this.ngoAddress = ngoAddress;
    }

    //getters and setters 
    public String getNgoCity() {
        return ngoCity;
    }

    //getters and setters 
    public void setNgoCity(String ngoCity) {
        this.ngoCity = ngoCity;
    }

    //getters and setters 
    public String getNgoZipcode() {
        return ngoZipcode;
    }

    //getters and setters 
    public void setNgoZipcode(String ngoZipcode) {
        this.ngoZipcode = ngoZipcode;
    }

    //getters and setters 
    public String getNgoState() {
        return ngoState;
    }

    //getters and setters 
    public void setNgoState(String ngoState) {
        this.ngoState = ngoState;
    }

    //getters and setters 
    public String getNgoPhno() {
        return ngoPhno;
    }

    //getters and setters 
    public void setNgoPhno(String ngoPhno) {
        this.ngoPhno = ngoPhno;
    }

    //getters and setters 
    public String getNgoAgent() {
        return ngoAgent;
    }

    //getters and setters 
    public void setNgoAgent(String ngoAgent) {
        this.ngoAgent = ngoAgent;
    }

    public UserAccount getNgoAccount() {
        return ngoAccount;
    }

    //getters and setters 
    public void setNgoAccount(UserAccount ngoAccount) {
        this.ngoAccount = ngoAccount;
    }
    @Override
    public String toString(){
        return ngoId;
    }
    
}
