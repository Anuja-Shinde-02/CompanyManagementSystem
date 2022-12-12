/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author dristidani
 */

//getters and setters
public class Donor {
    private int donorId;
    private String donorName;
    private String donorType;
    private String donorPhno;
    private String donorEmail;
    private String donorAddres;
    private String donorCity;
    private String donorZipcode;
    private String donorState;
    private UserAccount donorAccount;
    private String donUserName;
    private String donPwd;

    //getters and setters
    public String getDonUserName() {
        return donUserName;
    }

    //getters and setters
    public void setDonUserName(String donUserName) {
        this.donUserName = donUserName;
    }

    //getters and setters
    public String getDonPwd() {
        return donPwd;
    }

    //getters and setters
    public void setDonPwd(String donPwd) {
        this.donPwd = donPwd;
    }

    //class constructor
    public Donor(UserAccount ua)
    {
        this.donorAccount = ua;
        this.donUserName = ua.getUsername();
        this.donPwd = ua.getPassword();
                
    }

    //getters and setters
    public int getDonorId() {
        return donorId;
    }

    //getters and setters
    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    //getters and setters
    public String getDonorName() {
        return donorName;
    }

    //getters and setters
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    //getters and setters
    public String getDonorType() {
        return donorType;
    }

    //getters and setters
    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    //getters and setters
    public String getDonorPhno() {
        return donorPhno;
    }

    //getters and setters
    public void setDonorPhno(String donorPhno) {
        this.donorPhno = donorPhno;
    }

    //getters and setters
    public String getDonorEmail() {
        return donorEmail;
    }

    //getters and setters
    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    //getters and setters
    public String getDonorAddres() {
        return donorAddres;
    }

    //getters and setters
    public void setDonorAddres(String donorAddres) {
        this.donorAddres = donorAddres;
    }

    //getters and setters
    public String getDonorCity() {
        return donorCity;
    }

    //getters and setters
    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    //getters and setters
    public String getDonorZipcode() {
        return donorZipcode;
    }

    //getters and setters
    public void setDonorZipcode(String donorZipcode) {
        this.donorZipcode = donorZipcode;
    }

    //getters and setters
    public String getDonorState() {
        return donorState;
    }

    //getters and setters
    public void setDonorState(String donorState) {
        this.donorState = donorState;
    }

    public UserAccount getDonorAccount() {
        return donorAccount;
    }

    //getters and setters
    public void setDonorAccount(UserAccount donorAccount) {
        this.donorAccount = donorAccount;
    }
    
}
