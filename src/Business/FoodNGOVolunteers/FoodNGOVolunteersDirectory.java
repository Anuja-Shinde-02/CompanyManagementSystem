/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodNGOVolunteers;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class FoodNGOVolunteersDirectory {

    
    private ArrayList<FoodNGOVolunteers> volunteerList;
    
    public FoodNGOVolunteersDirectory(){
        volunteerList = new ArrayList();
    }
    
    public ArrayList<FoodNGOVolunteers> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<FoodNGOVolunteers> volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    public void addNewVolunteer(FoodNGOVolunteers vol){
        volunteerList.add(vol);
    }
    
    public void deleteVolunteer(FoodNGOVolunteers selectedvol){
        volunteerList.remove(selectedvol);
    }
}
