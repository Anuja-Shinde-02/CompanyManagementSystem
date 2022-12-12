/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import userinterface.DonorRole.DonorAreaJPanel;
import userinterface.VolunteerRole.VolunteerWorkAreaPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author anujakale
 */

    //constructors 
    public class DeliveryVolunteer extends Role{
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, JPanel jp, JSplitPane jsp) {
            return new VolunteerWorkAreaPanel(userProcessContainer, business, account,jp,jsp);
    }
}
