/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class VolunteerDirectory {

    //ArrayList
    private ArrayList<Volunteer> volunteerList;
    
    //VolunteerDirectory
    public VolunteerDirectory(){
        volunteerList = new ArrayList();
    }
    
    //ArrayList
    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    //setter
    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    //delete volunteer
    public void deleteVolunteer(Volunteer selectedvol){
        volunteerList.remove(selectedvol);
    }
    
    //add volunteer
    public void addNewVolunteer(Volunteer vol){
        volunteerList.add(vol);
    }
}
