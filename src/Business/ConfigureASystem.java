package Business;

import Business.Employee.Employee;
import Business.AssignedRole.RoleOfFCAdmin;
import Business.AssignedRole.RoleOfSystemAdmin;
import Business.AccountOfUser.AccountOfUser;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        AccountOfUser ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new RoleOfSystemAdmin());
        
        return system;
    }
    
}
