/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedRole;

import Business.EcoSystem;

import Business.Organization;
import Business.AccountOfUser.AccountOfUser;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.HotelAdminRole.AdminWorkAreaJPanel;
import userinterface.SysAdminWorkArea.SysAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class RoleOfAdmin extends AssignedRoles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, AccountOfUser account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new AdminWorkAreaJPanel(userProcessContainer);
    } 

    
    
}
