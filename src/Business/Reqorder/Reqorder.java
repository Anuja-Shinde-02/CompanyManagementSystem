/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Reqorder;

import Business.Requestor.Requestor;
import Business.UserAccount.UserAccount;

/**
 *
 * @author anujashinde 
 */

public class Reqorder {
    private String reqOrderId;
    private String reqName;
    private String reqPantryName;
    private String reqVol;
    private String reqAdd;
    private String reqCity;
    private String reqZip;
    private String reqOrderQuant;
    private String reqOrderType;
    private String reqOrderStatus;
    private UserAccount reqRequestorAcc;

    //getters and setters 
    public String getReqOrderId() {
        return reqOrderId;
    }

    //getters and setters 
    public void setReqOrderId(String reqOrderId) {
        this.reqOrderId = reqOrderId;
    }
    
    //getters and setters 
    public String getReqVol() {
        return reqVol;
    }

    //getters and setters 
    public void setReqVol(String reqVol) {
        this.reqVol = reqVol;
    }

    //getters and setters 
    public String getReqName() {
        return reqName;
    }

    //getters and setters 
    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    //getters and setters 
    public String getReqOrderQuant() {
        return reqOrderQuant;
    }

    //getters and setters 
    public void setReqOrderQuant(String reqOrderQuant) {
        this.reqOrderQuant = reqOrderQuant;
    }

    //getters and setters 
    public String getReqOrderStatus() {
        return reqOrderStatus;
    }

    //getters and setters 
    public void setReqOrderStatus(String reqOrderStatus) {
        this.reqOrderStatus = reqOrderStatus;
    }

    //getters and setters 
    public String getReqOrderType() {
        return reqOrderType;
    }

    //getters and setters 
    public void setReqOrderType(String reqOrderType) {
        this.reqOrderType = reqOrderType;
    }

    //getters and setters 
    public String getReqPantryName() {
        return reqPantryName;
    }

    //getters and setters 
    public void setReqPantryName(String reqPantryName) {
        this.reqPantryName = reqPantryName;
    }

    //getters and setters 
    public String getReqAdd() {
        return reqAdd;
    }

    //getters and setters 
    public void setReqAdd(String reqAdd) {
        this.reqAdd = reqAdd;
    }

    //getters and setters 
    public String getReqZip() {
        return reqZip;
    }

    //getters and setters 
    public void setReqZip(String reqZip) {
        this.reqZip = reqZip;
    }

    //getters and setters 
    public String getReqCity() {
        return reqCity;
    }

    //getters and setters 
    public void setReqCity(String reqCity) {
        this.reqCity = reqCity;
    }    

    public UserAccount getReqRequestorAcc() {
        return reqRequestorAcc;
    }

    //getters and setters 
    public void setReqRequestorAcc(UserAccount reqRequestorAcc) {
        this.reqRequestorAcc = reqRequestorAcc;
    }
     @Override
    public String toString(){
        return reqOrderId;
    } 
    
}
