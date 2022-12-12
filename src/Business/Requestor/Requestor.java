/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requestor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anujakale
 */

public class Requestor {
    private int reqId;
    private String reqName;
    private String reqType;
    private String reqQuan;
    private String reqAddres;
    private String reqCity;
    private String reqState;
    private String reqZipcode;
    private String reqPhno;
    private String reqEmail;
    private UserAccount userAccount;
    private String reqUserName;
    private String reqPwd;

    
    //getters and setters 
    public String getReqUserName() {
        return reqUserName;
    }

    //getters and setters 
    public void setReqUserName(String reqUserName) {
        this.reqUserName = reqUserName;
    }

    //getters and setters 
    public String getReqQuan() {
        return reqQuan;
    }

    //getters and setters 
    public void setReqQuan(String reqQuan) {
        this.reqQuan = reqQuan;
    }

    //getters and setters 
    public String getReqPwd() {
        return reqPwd;
    }

    //getters and setters 
    public void setReqPwd(String reqPwd) {
        this.reqPwd = reqPwd;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    //getters and setters 
    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
   
    
    //class constructor    
    public Requestor(UserAccount ua)
    {
        this.userAccount = ua;
        this.reqUserName = ua.getUsername();
        this.reqPwd = ua.getPassword();
                
    }
    
    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getReqPhno() {
        return reqPhno;
    }

    public void setReqPhno(String reqPhno) {
        this.reqPhno = reqPhno;
    }

    public String getReqAddres() {
        return reqAddres;
    }

    public void setReqAddres(String reqAddres) {
        this.reqAddres = reqAddres;
    }

    public String getReqCity() {
        return reqCity;
    }

    public void setReqCity(String reqCity) {
        this.reqCity = reqCity;
    }

    public String getReqState() {
        return reqState;
    }

    public void setReqState(String reqState) {
        this.reqState = reqState;
    }

    public String getReqZipcode() {
        return reqZipcode;
    }

    public void setReqZipcode(String reqZipcode) {
        this.reqZipcode = reqZipcode;
    }

    public String getReqEmail() {
        return reqEmail;
    }

    public void setReqEmail(String reqEmail) {
        this.reqEmail = reqEmail;
    }

    public UserAccount getReqAccount() {
        return userAccount;
    }

    public void setReqAccount(UserAccount reqAccount) {
        this.userAccount = reqAccount;
    }
    
}
