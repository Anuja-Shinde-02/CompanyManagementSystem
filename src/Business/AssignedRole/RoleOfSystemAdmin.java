/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedRole;

import Business.EcoSystem;

import Business.AccountOfUser.AccountOfUser;
import userinterface.SysAdminWorkArea.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author raunak
 */
public class RoleOfSystemAdmin extends AssignedRoles{

  
    public JPanel createWorkArea(JPanel userProcessContainer, AccountOfUser account, EcoSystem system, JPanel jp, JSplitPane jsp) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system, jp, jsp);
    }
    
}
