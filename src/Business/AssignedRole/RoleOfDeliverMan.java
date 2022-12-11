/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedRole;

import Business.EcoSystem;
import Business.AccountOfUser.AccountOfUser;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author anujakale
 */
public class RoleOfDeliverMan extends AssignedRoles {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, AccountOfUser account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
