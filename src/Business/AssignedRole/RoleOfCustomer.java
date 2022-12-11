/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedRole;

import Business.EcoSystem;

import Business.Organization;
import Business.AccountOfUser.AccountOfUser;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author raunak
 */
public class RoleOfCustomer extends AssignedRoles{

    
    public JPanel createWorkArea(JPanel userProcessContainer, AccountOfUser account, EcoSystem busines, JPanel jp, JSplitPane jsp) {
        return new CustomerAreaJPanel(userProcessContainer, account);
    }
    
    
}
