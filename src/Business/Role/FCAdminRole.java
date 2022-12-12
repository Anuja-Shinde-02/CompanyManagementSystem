/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import userinterface.FCAdminRole.FCAdminWorkAreaPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author anujakale
 */

    //constructors 
    public class FCAdminRole extends Role{
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, JPanel jp, JSplitPane jsp) {
            return new FCAdminWorkAreaPanel(userProcessContainer, business,account, jp, jsp);
    } 
}
