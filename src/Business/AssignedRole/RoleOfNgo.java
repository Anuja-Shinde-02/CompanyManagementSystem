/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedRole;

import Business.EcoSystem;
import Business.AccountOfUser.AccountOfUser;
import javax.swing.JPanel;
import userinterface.NGORole.ManageVolunteerPanel;
import javax.swing.JSplitPane;
import userinterface.NGORole.NGOWorkAreaPanel;


/**
 *
 * @author anujakale
 */
public class RoleOfNgo extends AssignedRoles{

    public JPanel createWorkArea(JPanel userProcessContainer, AccountOfUser account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new NGOWorkAreaPanel(userProcessContainer, business, account,jp,jsp);
    }
}
