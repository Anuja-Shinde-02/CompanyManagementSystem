/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requestor;


import java.util.ArrayList;
import Business.Restaurant.Restaurant;

/**
 *
 * @author anujakale
 */
public class RequestorDirectory {
    //ArrayList
    private ArrayList<Requestor> reqAccList;
    
    //RequestorDirectory
    public RequestorDirectory(){
        reqAccList = new ArrayList();
    }

    //ArrayList
    public ArrayList<Requestor> getReqAccList() {
        return reqAccList;
    }

    //getter and setter
    public void setReqAccList(ArrayList<Requestor> reqAccList) {
        this.reqAccList = reqAccList;
    }

    //remove req by index
    public void removeReqByIndex(int index) {
        reqAccList.remove(index);
    }
    
    //add req
    public void addReqDir(Requestor ro) {
        reqAccList.add(ro);
    }
    
    //remove req
    public void removeRequestor(Requestor r) {
        this.reqAccList.remove(r);
    }

    //getter and setter
    public Requestor getRestDetailsByIndex(int index) {
        return reqAccList.get(index);
    }
    
    int reqIdGeneration = 1000;

    public int generateOrderId() {
        reqIdGeneration++;
        return reqIdGeneration;
    }
    public String getreqState(String name){
        for(Requestor r: reqAccList){
            if(r.getReqAccount().getUsername().equals(name)){
                return r.getReqState();
            }
        }
        return null;
    }
}
