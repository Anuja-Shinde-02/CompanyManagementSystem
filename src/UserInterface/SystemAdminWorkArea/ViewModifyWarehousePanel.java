/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.FCWarehouse.FCWarehouse;
import Business.FCWarehouse.FCWarehouseDirectory;
import java.awt.Color;
import java.awt.Dimension;
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
 * @author anujakale 
 */
public class ViewModifyWarehousePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyWarehousePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FCWarehouseDirectory fcd;
    public ViewModifyWarehousePanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateWHtable();
        txtFCAuname.setEnabled(false);
        setBG();
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

        lblAddWHTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarehouse = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblWHname = new javax.swing.JLabel();
        txtWHname = new javax.swing.JTextField();
        lblWHPhno = new javax.swing.JLabel();
        txtWHPhno = new javax.swing.JTextField();
        lblWHAdd = new javax.swing.JLabel();
        txtWHAdd = new javax.swing.JTextField();
        lblWHCity = new javax.swing.JLabel();
        txtWHCity = new javax.swing.JTextField();
        lblWHState = new javax.swing.JLabel();
        txtWHState = new javax.swing.JTextField();
        lblWHZip = new javax.swing.JLabel();
        txtWHZip = new javax.swing.JTextField();
        lblWHFCAdmin = new javax.swing.JLabel();
        txtWHFCAdmin = new javax.swing.JTextField();
        lblFCAuname = new javax.swing.JLabel();
        txtFCAuname = new javax.swing.JTextField();
        lblFCApwd = new javax.swing.JLabel();
        txtFCApwd = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblWHname1 = new javax.swing.JLabel();
        lblWHPhno1 = new javax.swing.JLabel();
        lblWHAdd1 = new javax.swing.JLabel();
        lblWHCity1 = new javax.swing.JLabel();
        lblWHState1 = new javax.swing.JLabel();
        lblWHZip1 = new javax.swing.JLabel();
        lblWHFCAdmin1 = new javax.swing.JLabel();
        lblFCAuname1 = new javax.swing.JLabel();
        lblFCApwd1 = new javax.swing.JLabel();
        lblWHid = new javax.swing.JLabel();
        lblWHid1 = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddWHTitle.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        lblAddWHTitle.setForeground(new java.awt.Color(255, 93, 119));
        lblAddWHTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddWHTitle.setText("Warehouse Details");
        add(lblAddWHTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        tblWarehouse.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tblWarehouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Warehouse ID", "Name", "Food Admin", "Phone Number", "Address", "City", "State", "Zipcode"
            }
        ));
        tblWarehouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblWarehouseMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblWarehouse);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 840, 153));

        btnDelete.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 90, 40));

        btnEdit.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 90, 40));

        lblWHname.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHname.setText("Warehouse Name");
        add(lblWHname, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 244, -1, -1));

        txtWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHnameFocusLost(evt);
            }
        });
        txtWHname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWHnameKeyReleased(evt);
            }
        });
        add(txtWHname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 137, -1));

        lblWHPhno.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHPhno.setText("Phone Number");
        add(lblWHPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 281, -1, -1));

        txtWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHPhnoFocusLost(evt);
            }
        });
        txtWHPhno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWHPhnoKeyReleased(evt);
            }
        });
        add(txtWHPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 277, 137, -1));

        lblWHAdd.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHAdd.setText("Address");
        add(lblWHAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 317, -1, -1));

        txtWHAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWHAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 313, 137, -1));

        lblWHCity.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHCity.setText("City");
        add(lblWHCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 354, -1, -1));

        txtWHCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWHCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 137, -1));

        lblWHState.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHState.setText("State");
        add(lblWHState, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 391, -1, -1));

        txtWHState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWHState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 387, 137, -1));

        lblWHZip.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHZip.setText("Zipcode");
        add(lblWHZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 428, -1, -1));

        txtWHZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHZipFocusLost(evt);
            }
        });
        add(txtWHZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 424, 137, -1));

        lblWHFCAdmin.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHFCAdmin.setText("Food Admin");
        add(lblWHFCAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        txtWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHFCAdmin.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHFCAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHFCAdminFocusLost(evt);
            }
        });
        add(txtWHFCAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 461, 137, -1));

        lblFCAuname.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblFCAuname.setText("Food Admin Username");
        add(lblFCAuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        txtFCAuname.setEditable(false);
        txtFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCAuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCAuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 498, 137, -1));

        lblFCApwd.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblFCApwd.setText("Password");
        add(lblFCApwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 535, -1, 25));

        txtFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCApwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCApwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 535, 137, -1));

        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 578, 90, 40));

        lblWHname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 150, 20));

        lblWHPhno1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHPhno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 150, 20));

        lblWHAdd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 150, 20));

        lblWHCity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 150, 20));

        lblWHState1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 150, 20));

        lblWHZip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 150, 20));

        lblWHFCAdmin1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHFCAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 150, 20));

        lblFCAuname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblFCAuname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 150, 20));

        lblFCApwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblFCApwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 150, 30));

        lblWHid.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblWHid.setText("Warehouse Id:");
        add(lblWHid, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, -1, -1));

        lblWHid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 230, -1, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 730));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtWHnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWHnameKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtWHnameKeyReleased

    private void txtWHPhnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWHPhnoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtWHPhnoKeyReleased

    private void txtWHnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHnameFocusLost
        // TODO add your handling code here:
         if(!(txtWHname.getText().matches("^[a-zA-Z]*$"))){
             
        //you will have to add the Warehouse Name in alphabets only. 
            lblWHname1.setText("Input invalid. Please enter only alphabets");
        }
        else{
            lblWHname1.setText("");
        }
    }//GEN-LAST:event_txtWHnameFocusLost

    private void txtWHPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtWHPhno.getText().matches("^[0-9]*$")) || !(txtWHPhno.getText().length()==10)) {
         
        //you will have to add the Phone Number in numbers only.
                lblWHPhno1.setText("Please enter a valid phone number");
        }
        else{
             lblWHPhno1.setText("");
            
        }
    }//GEN-LAST:event_txtWHPhnoFocusLost

    private void txtWHZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHZipFocusLost
        // TODO add your handling code here:
        if((txtWHZip.getText().matches("^[a-zA-Z]*$"))){
            
       //you will have to add the Warehouse ZipCode in numbers only.      
            lblWHZip1.setText("Input invalid. Please enter only numbers");
        }
        else{
            lblWHZip1.setText("");
        }
    }//GEN-LAST:event_txtWHZipFocusLost

    private void txtWHFCAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHFCAdminFocusLost
        // TODO add your handling code here:
        if(!(txtWHFCAdmin.getText().matches("^[a-zA-Z]*$"))){
            
       //you will have to add the Food Cloud Admin in alphabets only. 
            lblWHFCAdmin1.setText("Input invalid. Please enter only alphabets");
        }
        else{
            lblWHFCAdmin1.setText("");
        }
    }//GEN-LAST:event_txtWHFCAdminFocusLost

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouse.getSelectedRow();
        if(selectedRowIndex < 0){
            
            //you have to select a record from the table that you wish to update
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        FCWarehouse selectedFCW = (FCWarehouse)model.getValueAt(selectedRowIndex, 0);
        lblWHid1.setText(selectedFCW.getFcwId());
        txtWHname.setText(selectedFCW.getFcwName());
        txtWHPhno.setText(selectedFCW.getFcwPhno());
        txtWHAdd.setText(selectedFCW.getFcwAddres());
        txtWHCity.setText(selectedFCW.getFcwCity());
        txtWHState.setText(selectedFCW.getFcwState());
        txtWHZip.setText(selectedFCW.getFcwZipcode());
        txtWHFCAdmin.setText(selectedFCW.getFcwAdmin());
        txtFCAuname.setText(selectedFCW.getFcwAccount().getUsername());
        txtFCApwd.setText(selectedFCW.getFcwAccount().getPassword());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouse.getSelectedRow();
        if(selectedRowIndex < 0){
            
            //you have to select a record from the table that you wish to delete
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        
        //DefaultTableModel is a implementation of TableModel which uses Vector of Vectors to store the cell value objects.
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        FCWarehouse selectedFCW = (FCWarehouse)model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getFCWDirectory().getFcwList().get(selectedRowIndex).getFcwAccount());
        fcd= ecosystem.getFCWDirectory();
        fcd.deleteFCWarehouse(selectedFCW);
        ecosystem.setFCWDirectory(fcd);
        
        //Warehouse record will be deleted successfully
        JOptionPane.showMessageDialog(this, "Food Cloud Warehouse deleted Successfully");
        populateWHtable();
        clearfields();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouse.getSelectedRow();
        if(selectedRowIndex < 0){
            
            // we have a select a particular record to perform update on it
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        String WHid = lblWHid1.getText();
        
        ArrayList<FCWarehouse> fcwList = ecosystem.getFCWDirectory().getFcwList();
        for(FCWarehouse f: fcwList)
        {
            if(f.getFcwId().equals(WHid))
            {
                f.setFcwName(txtWHname.getText());
                f.setFcwPhno(txtWHPhno.getText());
                f.setFcwAddres(txtWHAdd.getText());
                f.setFcwCity(txtWHCity.getText());
                f.setFcwState(txtWHState.getText());
                f.setFcwZipcode(txtWHZip.getText());
                f.setFcwAdmin(txtWHFCAdmin.getText());
                //UserAccount WHua=new UserAccount();
                //WHua.setUsername(txtFCAuname.getText());
                //WHua.setPassword(txtFCApwd.getText());
                if(f.getFcwAccount().getUsername().equals(txtFCAuname.getText())){
                    f.getFcwAccount().setPassword(txtFCApwd.getText());
                    f.getFcwAccount().getEmployee().setName(txtWHFCAdmin.getText());
                }
                //f.setFcwAccount(WHua);
               break;
            }
            
        }
       // ecosystem.setFCWDirectory(fcwList);
        fcd = ecosystem.getFCWDirectory();
        ecosystem.setFCWDirectory(fcd);
        
        //after making desired changes the record will be updated successfully 
        JOptionPane.showMessageDialog(this, "Food Cloud Warehouse details updated successfully");
        clearfields();
        populateWHtable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblWarehouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarehouseMousePressed
        tblWarehouse.setSelectionForeground(Color.BLUE);

    }//GEN-LAST:event_tblWarehouseMousePressed

      public void makeTableTransparent() {
        tblWarehouse.setOpaque(false);
        ((DefaultTableCellRenderer) tblWarehouse.getDefaultRenderer(Object.class)).setOpaque(false);
        tblWarehouse.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblWarehouse.getModel().getColumnCount(); i++) {
            tblWarehouse.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddWHTitle;
    private javax.swing.JLabel lblFCApwd;
    private javax.swing.JLabel lblFCApwd1;
    private javax.swing.JLabel lblFCAuname;
    private javax.swing.JLabel lblFCAuname1;
    private javax.swing.JLabel lblWHAdd;
    private javax.swing.JLabel lblWHAdd1;
    private javax.swing.JLabel lblWHCity;
    private javax.swing.JLabel lblWHCity1;
    private javax.swing.JLabel lblWHFCAdmin;
    private javax.swing.JLabel lblWHFCAdmin1;
    private javax.swing.JLabel lblWHPhno;
    private javax.swing.JLabel lblWHPhno1;
    private javax.swing.JLabel lblWHState;
    private javax.swing.JLabel lblWHState1;
    private javax.swing.JLabel lblWHZip;
    private javax.swing.JLabel lblWHZip1;
    private javax.swing.JLabel lblWHid;
    private javax.swing.JLabel lblWHid1;
    private javax.swing.JLabel lblWHname;
    private javax.swing.JLabel lblWHname1;
    private javax.swing.JTable tblWarehouse;
    private javax.swing.JTextField txtFCApwd;
    private javax.swing.JTextField txtFCAuname;
    private javax.swing.JTextField txtWHAdd;
    private javax.swing.JTextField txtWHCity;
    private javax.swing.JTextField txtWHFCAdmin;
    private javax.swing.JTextField txtWHPhno;
    private javax.swing.JTextField txtWHState;
    private javax.swing.JTextField txtWHZip;
    private javax.swing.JTextField txtWHname;
    // End of variables declaration//GEN-END:variables

    private void populateWHtable() {
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        model.setRowCount(0);
        for(FCWarehouse fcwh: ecosystem.getFCWDirectory().getFcwList()){
           Object[] row = new Object[8];
           row[0] =fcwh;
           row[1] =fcwh.getFcwName();
           row[2] =fcwh.getFcwAdmin();
           row[3] =fcwh.getFcwPhno();
           row[4] =fcwh.getFcwAddres();
           row[5] =fcwh.getFcwCity();
           row[6] =fcwh.getFcwState();
           row[7] =fcwh.getFcwZipcode();
           model.addRow(row);
        } 
    }
    private void clearfields() {
        txtWHname.setText("");
        txtWHPhno.setText("");
        txtWHAdd.setText("");
        txtWHCity.setText("");
        txtWHState.setText("");
        txtWHZip.setText("");
        txtWHFCAdmin.setText("");
        txtFCAuname.setText("");
        txtFCApwd.setText("");
        lblWHid1.setText("");
    }
}