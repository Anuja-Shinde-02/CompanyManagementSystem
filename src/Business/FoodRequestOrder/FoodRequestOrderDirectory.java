/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodRequestOrder;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class FoodRequestOrderDirectory {
    private ArrayList<FoodRequestOrder> reqOrderList;
    
    public FoodRequestOrderDirectory(){
        reqOrderList = new ArrayList();
    }

    public ArrayList<FoodRequestOrder> getReqOrderList() {
        return reqOrderList;
    }

    public void setReqOrderList(ArrayList<FoodRequestOrder> reqOrderList) {
        this.reqOrderList = reqOrderList;
    }
     public void addNewReqorder(FoodRequestOrder rq){
        reqOrderList.add(rq);
    }
    public void deleteReqorder(FoodRequestOrder selectedD){
        reqOrderList.remove(selectedD);
    }
}
