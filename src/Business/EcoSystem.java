/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Donation.DonationDirectory;
import Business.Donor.DonorDirectory;
import Business.FCPantry.FCPantryDirectory;
import Business.FCPantry.FCPantryItemsDirectory;
import Business.FCWarehouse.FCWarehouse;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.FCWarehouse.FCWarehouseDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.FCPManagerRole;
import Business.Role.NgoRole;
import Business.Role.DeliveryVolunteer;
import Business.Role.DonorRole;
import Business.Role.FCAdminRole;
import Business.Role.RequestorRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.NGO.NGODirectory;
import Business.NGOVolunteer.VolRequestsDirectory;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.Reqorder.ReqorderDirectory;
import Business.Requestor.RequestorDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author dristidani
 */

//perform getters and setters 
//perform constructor
public class EcoSystem extends Organization{
    
    private static EcoSystem business;    
    private RequestorDirectory reqDir;
    private DonorDirectory donDir;
    private FCWarehouseDirectory fcwDir;
    private NGODirectory ngoDir;
    private FCPantryDirectory fcpDir;
    private DonationDirectory donatDir;
    private ReqorderDirectory reqorderDir;
    private VolRequestsDirectory vrDir;
    private UserAccountDirectory uaDir;
    private FCPantryItemsDirectory fcpiDir;
    private VolunteerDirectory volDir;
    
    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    
    //Class Constructor
    public EcoSystem(RequestorDirectory reqDir, DonorDirectory donDir, FCWarehouseDirectory fcwDir, NGODirectory ngoDir, VolunteerDirectory volDir,
                    FCPantryDirectory fcpDir, FCPantryItemsDirectory fcpiDir, DonationDirectory donatDir, ReqorderDirectory reqorderDir,
                    VolRequestsDirectory vrDir) { // to add ngo directory

        this.reqDir = reqDir;
        this.donDir = donDir;
        this.fcwDir = fcwDir;
        this.ngoDir = ngoDir;
        this.volDir = volDir;
        this.fcpDir = fcpDir;
        this.fcpiDir = fcpiDir;
        this.donatDir = donatDir;
        this.reqorderDir = reqorderDir;
        this.vrDir = vrDir;
    }


    //getters
    public VolunteerDirectory getVolDir() {
        return volDir;
    }

    //setters
    public void setVolDir(VolunteerDirectory volDir) {
        this.volDir = volDir;
    }
    
    //getters
    public NGODirectory getNgoDir() {
        return ngoDir;
    }

    //setters
    public void setNgoDir(NGODirectory ngoDir) {
        this.ngoDir = ngoDir;
    }

    //getters
    public RequestorDirectory getReqDir() {
        return reqDir;
    }

    //setters
    public void setReqDir(RequestorDirectory reqDir) {
        this.reqDir = reqDir;
    }

    //getters
    public DonorDirectory getDonDir() {
        return donDir;
    }

    //setters
    public void setDonDir(DonorDirectory donDir) {
        this.donDir = donDir;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        roleList.add(new RequestorRole());
        roleList.add(new DonorRole());
        roleList.add(new NgoRole());
        roleList.add(new FCAdminRole());
        roleList.add(new FCPManagerRole());
        roleList.add(new DeliveryVolunteer());
        return roleList;
    }
    private EcoSystem(){
        super("Food Cloud");
         this.reqDir =  new RequestorDirectory();
        this.donDir = new DonorDirectory();
        this.donatDir = new DonationDirectory();
        this.ngoDir = new NGODirectory();
        this.fcwDir = new FCWarehouseDirectory();
        this.fcpDir = new FCPantryDirectory();
        this.fcpiDir = new FCPantryItemsDirectory();
        this.uaDir = new UserAccountDirectory();
        this.volDir = new VolunteerDirectory();
        this.vrDir = new VolRequestsDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
      UserAccountDirectory usersList = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
        
        for(UserAccount ua : userAccounts)
        {
            if(ua.getUsername().equals(userName))
                return false;
        }
        
       return true;
    }
    //getters
    public FCWarehouseDirectory getFCWDirectory(){
        return fcwDir;
    }
    //setters
    public void setFCWDirectory(FCWarehouseDirectory fcd){
        this.fcwDir = fcd;
    }
    //getters
    public FCPantryDirectory getFCPDirectory(){
        return fcpDir;
    }
    //getters
    public FCPantryItemsDirectory getFCPIDirectory(){
        return fcpiDir;
    }
    //setters
    public void setFCPIDirectory(FCPantryItemsDirectory fcpid){
        this.fcpiDir = fcpid;
    }
    //setters
    public void setFCPDirectory(FCPantryDirectory fcp){
        this.fcpDir = fcp;
    }
    //setters
    public void setUserAccountDirectory(UserAccountDirectory uad){
        this.uaDir=uad;
    }
    //getters
    public VolRequestsDirectory getVRDirectory(){
        return vrDir;
    }
    //setters
    public void setVRDirectory(VolRequestsDirectory vrDir){
        this.vrDir = vrDir;
    }
    //getters
    public DonationDirectory getDonatDirectory(){
        return donatDir;
    }
    //setters
    public void setDonatDirectory(DonationDirectory donatDir){
        this.donatDir = donatDir;
    }
    //getters
    public ReqorderDirectory getReqorderDirectory(){
        return reqorderDir;
    }
    //setters
    public void setReqorderDirectory(ReqorderDirectory reqorderDir){
        this.reqorderDir = reqorderDir;
    }
}
