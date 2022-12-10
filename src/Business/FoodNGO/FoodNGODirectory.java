/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodNGO;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class FoodNGODirectory {
    private ArrayList<FoodNGO> ngoList;
    
    public FoodNGODirectory(){
        ngoList = new ArrayList();
    }

    public ArrayList<FoodNGO> getNgoList() {
        return ngoList;
    }

    public void setNgoList(ArrayList<FoodNGO> ngoList) {
        this.ngoList = ngoList;
    }
    
    public void addNewNGO(FoodNGO ngo){
        ngoList.add(ngo);
    }
    
    public void deleteNGO(FoodNGO selectedngo){
        ngoList.remove(selectedngo);
    }

}
