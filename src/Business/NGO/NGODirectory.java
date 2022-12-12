/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGO;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class NGODirectory {
    //ArrayList
    private ArrayList<NGO> ngoList;
    
    //NGODirectory
    public NGODirectory(){
        ngoList = new ArrayList();
    }

    //ArrayList
    public ArrayList<NGO> getNgoList() {
        return ngoList;
    }

    //getter and setter
    public void setNgoList(ArrayList<NGO> ngoList) {
        this.ngoList = ngoList;
    }
    
    //delete NGO
    public void deleteNGO(NGO selectedngo){
        ngoList.remove(selectedngo);
    }
    
    //add NGO
    public void addNewNGO(NGO ngo){
        ngoList.add(ngo);
    }

}
