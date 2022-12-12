/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SysAdminWorkArea;

import Business.EcoSystem;
import Business.AccountOfUser.AccountOfUser;
import Business.AccountOfUser.AccountOfUserDirectory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 * @author sowmyachinimilli
 */
public class ManagingUsersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsers
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    AccountOfUserDirectory uad;

    public ManagingUsersPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        setBG();
        setLogo();
        populateUserTable();
        makeTableTransparent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMgUsersTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        logoImage = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(2000, 1100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMgUsersTitle.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblMgUsersTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblMgUsersTitle.setText("View Users");
        add(lblMgUsersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 24, -1, -1));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Role", "Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUsersMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setResizable(false);
            tblUsers.getColumnModel().getColumn(1).setResizable(false);
            tblUsers.getColumnModel().getColumn(2).setResizable(false);
            tblUsers.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 865, 212));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 92, -1));
        add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 80));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1500, 720));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(1500, 1000));
            LabelImage.setPreferredSize(new Dimension(1500, 1000));
            LabelImage.setMaximumSize(new Dimension(1500, 1000));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(2500, 1000, java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLogo() {
        try {
            logoImage.setMinimumSize(new Dimension(100, 100));
            logoImage.setPreferredSize(new Dimension(100, 100));
            logoImage.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            logoImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void makeTableTransparent() {
        tblUsers.setOpaque(false);
        ((DefaultTableCellRenderer) tblUsers.getDefaultRenderer(Object.class)).setOpaque(false);
        tblUsers.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

       
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);
   //     headerRenderer.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        for (int i = 0; i < tblUsers.getModel().getColumnCount(); i++) {
            tblUsers.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblUsers.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        AccountOfUser selectedUA = (AccountOfUser) model.getValueAt(selectedRowIndex, 0);
        if(selectedUA.getRole().toString().equals("Business.Role.SystemAdminRole")){
            JOptionPane.showMessageDialog(this, "You cannot delete System Admin login!");
        }
        else if(selectedUA.getRole().toString().equals("Business.Role.FCAdminRole") ){
            JOptionPane.showMessageDialog(this, "You cannot delete this login!"
                    + "You can only delete the warehouse or update the admin name");
        }
        else if(selectedUA.getRole().toString().equals("Business.Role.FCPManagerRole")){
             JOptionPane.showMessageDialog(this, "You cannot delete this login!"
                    + "You can only delete the pantry or update the manager name");
        }
        else if(selectedUA.getRole().toString().equals("Business.Role.NgoRole")){
            JOptionPane.showMessageDialog(this, "You cannot delete this login!"
                    + "You can only delete the ngo or update the agent name");
        }
        else{
        uad = ecosystem.getUserAccountDirectory();
        uad.deleteUserAccount(selectedUA);
        ecosystem.setUserAccountDirectory(uad);
        JOptionPane.showMessageDialog(this, "User Account deleted Successfully");
        }
        populateUserTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMousePressed
        // TODO add your handling code here:
        //tblUsers.setSelectionBackground(Color.BLUE );
        tblUsers.setSelectionForeground(Color.BLUE);

    }//GEN-LAST:event_tblUsersMousePressed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblUsersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMgUsersTitle;
    private javax.swing.JLabel logoImage;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables

    private void populateUserTable() {
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);
        for (AccountOfUser ua : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[4];
            row[0] = ua;
            row[1] = ua.getPassword();
            row[2] = getRoles(ua.getRole().toString());
            row[3] = ua.getEmployee();
            model.addRow(row);
        }
    }

    private Object getRoles(String role) {
        String rl = "";
        
        if(role.equals("Business.Role.SystemAdminRole")){
             rl="System Admin";
        }else if(role.equals("Business.Role.FCAdminRole")){
            rl="FC Admin";
        }else if(role.equals("Business.Role.FCPManagerRole")){
            rl="FCP Manager";
        }else if(role.equals("Business.Role.NgoRole")){
            rl="NGO";
        }else if(role.equals("Business.Role.DonorRole")){
            rl="Donor";
        }else if(role.equals("Business.Role.RequestorRole")){
            rl="Requestor";
        }else if(role.equals("Business.Role.DeliveryVolunteer")){
            rl="Volunteer";
        }
        
        return rl;
    }

}