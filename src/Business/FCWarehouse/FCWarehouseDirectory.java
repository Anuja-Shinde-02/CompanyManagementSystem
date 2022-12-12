/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCWarehouse;


import Business.FCWarehouse.FCWarehouseDirectory;
import java.util.ArrayList;

/**
 *
 * @author anujashide
 */
public class FCWarehouseDirectory {
    //ArrayList
    ArrayList<FCWarehouse> fcwList;

    //FCWarehouseDirectory
    public FCWarehouseDirectory(){
         fcwList = new ArrayList<FCWarehouse>();
    }
    
    //ArrayList
    public ArrayList<FCWarehouse> getFcwList() {
        return fcwList;
    }

    //get list
    public void setFcwList(ArrayList<FCWarehouse> fcwList) {
        this.fcwList = fcwList;
    }
    
    //delete warehouse
    public void deleteFCWarehouse(FCWarehouse selectedfcw){
        fcwList.remove(selectedfcw);
    }
    
    //add warehouse
    public void addNewFCWarehouse(FCWarehouse fcw){
        fcwList.add(fcw);
    }
    public String getWHname(String FCAname){
        String WHname;
        for(FCWarehouse f: fcwList){
            if(f.getFcwAdmin().equals(FCAname)){
                return f.getFcwName();
            }
        }
        return null;
    }
}
