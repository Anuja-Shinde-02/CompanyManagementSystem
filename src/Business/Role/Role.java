/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import Business.UserAccount.UserAccount;

/**
 *
 * @author anujakale
 */
public abstract class Role {
          
    public enum RoleType{
        FCAdmin("FCAdmin"),
        FCPManager("FCPManager"),
        Donor("Donor"),
        Requestor("Requestor"),
        NGOAgent("NGOAgent"),
        Volunteer("Volunteer"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        //getter
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business,
            JPanel jp,
            JSplitPane jsp);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}