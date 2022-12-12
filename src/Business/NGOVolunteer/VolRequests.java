/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

/**
 *
 * @author anujashinde 
 */


public class VolRequests {
    private String volreqId;
    private String volreqWH;
    private String volreqName;
    private String volreqNum;
    private String volreqStatus;

    //getters and setters 
    public String getVolreqWH() {
        return volreqWH;
    }

    //getters and setters 
    public void setVolreqWH(String volreqWH) {
        this.volreqWH = volreqWH;
    }

    //getters and setters 
    public String getVolreqId() {
        return volreqId;
    }

    //getters and setters 
    public void setVolreqId(String volreqId) {
        this.volreqId = volreqId;
    }

    //getters and setters 
    public String getVolreqName() {
        return volreqName;
    }

    //getters and setters 
    public void setVolreqName(String volreqName) {
        this.volreqName = volreqName;
    }

    //getters and setters 
    public String getVolreqStatus() {
        return volreqStatus;
    }

    //getters and setters 
    public void setVolreqStatus(String volreqStatus) {
        this.volreqStatus = volreqStatus;
    }

    //getters and setters 
    public String getVolreqNum() {
        return volreqNum;
    }

    //getters and setters 
    public void setVolreqNum(String volreqNum) {
        this.volreqNum = volreqNum;
    }
    @Override
    public String toString(){
        return volreqId;
    }
}
