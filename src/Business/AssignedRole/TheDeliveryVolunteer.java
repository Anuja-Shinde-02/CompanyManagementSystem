/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AssignedRole;

import Business.EcoSystem;
import Business.AccountOfUser.AccountOfUser;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.DonorRole.DonorAreaJPanel;
import userinterface.VolunteerRole.VolunteeringAreaPanel;

/**
 *
 * @author sowmyachinimilli
 */
public class TheDeliveryVolunteer extends AssignedRoles{
    public JPanel createWorkArea(JPanel userProcessContainer, AccountOfUser account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new VolunteeringAreaPanel(userProcessContainer, business, account,jp,jsp);
    }
}
