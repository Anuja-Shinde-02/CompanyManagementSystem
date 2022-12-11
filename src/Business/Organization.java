/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.AssignedRole.AssignedRoles;
import Business.AccountOfUser.AccountOfUserDirectory;
import Business.AssignedWorkQueue.QueueofWork;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private QueueofWork workQueue;
    private EmployeeDirectory employeeDirectory;
    private AccountOfUserDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
//        RestaurantAdmin("RestaurantAdmin"),
//        Customer("Customer"),
//        DeliveryMan("Delivery"),
//        SysAdmin("Sysadmin");
        FCAdmin("FCAdmin"),
        FCPManager("FCPManager"),
        Donor("Donor"),
        Requestor("Requestor"),
        NGOAgent("NGOAgent"),
        Volunteer("Volunteer"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new QueueofWork();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new AccountOfUserDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<AssignedRoles> getSupportedRole();
    
    public AccountOfUserDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public QueueofWork getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(QueueofWork workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
