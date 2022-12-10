/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.FCAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
/**
 *
 * @author drist
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Basically we are creating a network
        
        //we first create an enterprise (one enterprise after the other)
        
        //initialize some organizations under that enterprise
        
        //have some employees working in an organization
        
        //create User accounts
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
