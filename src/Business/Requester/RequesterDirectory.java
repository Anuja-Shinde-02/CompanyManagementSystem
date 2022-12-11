/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requester;

import Business.Hotel.Hotel;
import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class RequesterDirectory {
    private ArrayList<Requester> reqAccList;
    
    public RequesterDirectory(){
        reqAccList = new ArrayList();
    }

    public ArrayList<Requester> getReqAccList() {
        return reqAccList;
    }

    public void setReqAccList(ArrayList<Requester> reqAccList) {
        this.reqAccList = reqAccList;
    }
    
    public void addReqDir(Requester ro) {
        reqAccList.add(ro);
    }
    
    public void removeRequestor(Requester r) {
        this.reqAccList.remove(r);
    }

    public void removeReqByIndex(int index) {
        reqAccList.remove(index);
    }

    public Requester getRestDetailsByIndex(int index) {
        return reqAccList.get(index);
    }
    
    int reqIdGeneration = 1000;

    public int generateOrderId() {
        reqIdGeneration++;
        return reqIdGeneration;
    }
    public String getreqState(String name){
        for(Requester r: reqAccList){
            if(r.getReqAccount().getUsername().equals(name)){
                return r.getReqState();
            }
        }
        return null;
    }
}
