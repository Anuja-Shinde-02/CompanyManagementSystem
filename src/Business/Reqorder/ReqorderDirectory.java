/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Reqorder;

import java.util.ArrayList;

/**
 *
 * @author anujshinde
 */
public class ReqorderDirectory {
    //ArrayList
    private ArrayList<Reqorder> reqOrderList;
    
    public ReqorderDirectory(){
        reqOrderList = new ArrayList();
    }

    //ArrayList
    public ArrayList<Reqorder> getReqOrderList() {
        return reqOrderList;
    }

    //set req order
    public void setReqOrderList(ArrayList<Reqorder> reqOrderList) {
        this.reqOrderList = reqOrderList;
    }
    
    //delete req order
    public void deleteReqorder(Reqorder selectedD){
        reqOrderList.remove(selectedD);
    }
    
    //add req order
    public void addNewReqorder(Reqorder rq){
        reqOrderList.add(rq);
    }
}
