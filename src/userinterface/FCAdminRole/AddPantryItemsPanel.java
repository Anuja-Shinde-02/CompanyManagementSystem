/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FCAdminRole;

import Business.EcoSystem;
import Business.FCPantry.FCPantry;
import Business.FCPantry.FCPantryDirectory;
import Business.FCPantry.FCPantryItems;
import Business.FCPantry.FCPantryItemsDirectory;
import Business.AccountOfUser.AccountOfUser;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 * @author sowmyachinimilli
 */
public class AddPantryItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPantryItemsPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    AccountOfUser userAcc;
    FCPantryItemsDirectory fcpid;
    String WHname;
    public AddPantryItemsPanel(JPanel userProcessContainer,EcoSystem ecosystem,AccountOfUser userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        if(ecosystem.getFCPIDirectory()== null){
         ecosystem.setFCPIDirectory(new FCPantryItemsDirectory());
        }
        String FCAname=userAcc.getEmployee().getName();
        System.out.println(FCAname);
        WHname= ecosystem.getFCWDirectory().getWHname(FCAname);
        System.out.println(WHname);
        lblWHval.setText(WHname);
        ArrayList<String> PantryList = new ArrayList<String>();
        for (FCPantry fcp : ecosystem.getFCPDirectory().getFcpList()){
            if(fcp.getFcpWHname().equals(WHname)){
                PantryList.add(fcp.getFcpName());
            }
            
        }
        cbPantry.setModel(new DefaultComboBoxModel<String>(PantryList.toArray(new String[0])));
        txtPM.setEnabled(false);
        if(cbPantry.getSelectedItem() == null || cbPantry.getItemCount() == 0){
        txtPM.setText("");
        }else{ txtPM.setText(getMngrName(cbPantry.getSelectedItem().toString())); }
        setBG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddFCPTitle = new javax.swing.JLabel();
        lblWHname = new javax.swing.JLabel();
        txtPM = new javax.swing.JTextField();
        lblPantryMg = new javax.swing.JLabel();
        txtFDitem = new javax.swing.JTextField();
        lblFDitem = new javax.swing.JLabel();
        txtFDq = new javax.swing.JTextField();
        lblWHval = new javax.swing.JLabel();
        lblPantry = new javax.swing.JLabel();
        cbPantry = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lblitemID = new javax.swing.JLabel();
        txtitemId = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        LabelImg = new javax.swing.JLabel();
        lblFDq = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddFCPTitle.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblAddFCPTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblAddFCPTitle.setText("Add Pantry Items");
        add(lblAddFCPTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 19, -1, -1));

        lblWHname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblWHname.setText("Warehouse Name :");
        add(lblWHname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        txtPM.setEditable(false);
        txtPM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPM.setPreferredSize(new java.awt.Dimension(150, 25));
        txtPM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPMFocusLost(evt);
            }
        });
        txtPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPMActionPerformed(evt);
            }
        });
        add(txtPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 178, 137, -1));

        lblPantryMg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPantryMg.setText("Pantry Manager :");
        add(lblPantryMg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        txtFDitem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFDitem.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFDitem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFDitemFocusLost(evt);
            }
        });
        add(txtFDitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 264, 137, -1));

        lblFDitem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFDitem.setText("Food Item :");
        add(lblFDitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 268, -1, -1));

        txtFDq.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFDq.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFDq, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 307, 137, -1));

        lblWHval.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        add(lblWHval, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 98, 130, 20));

        lblPantry.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPantry.setText(" Pantry :");
        add(lblPantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        cbPantry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPantry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPantryActionPerformed(evt);
            }
        });
        add(cbPantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 150, -1));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 379, -1, -1));

        lblitemID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblitemID.setText("Item Id :");
        add(lblitemID, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 225, -1, -1));

        txtitemId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtitemId.setPreferredSize(new java.awt.Dimension(150, 25));
        txtitemId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtitemIdFocusLost(evt);
            }
        });
        add(txtitemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 221, 137, -1));

        btnclear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 970));

        lblFDq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFDq.setText("Item Quantity :");
        add(lblFDq, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 311, -1, -1));
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
    
    private void txtPMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPMFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtPMFocusLost

    private void txtFDitemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFDitemFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtFDitemFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            FCPantryItems fcpi=new FCPantryItems();
            fcpi.setFcpitemid(txtitemId.getText());
            fcpi.setFcpWHname(WHname);
            fcpi.setPantryName(String.valueOf(cbPantry.getSelectedItem()));
            fcpi.setPantryManager(txtPM.getText());
            fcpi.setFoodItem(txtFDitem.getText());
            fcpi.setFoodQuan(Integer.parseInt(txtFDq.getText()));           
            fcpid = ecosystem.getFCPIDirectory();
            fcpid.addFCPItems(fcpi);
            ecosystem.setFCPIDirectory(fcpid);
            JOptionPane.showMessageDialog(this, "Items added to Pantry successfully!");
            clearfields(); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }

    private void clearfields() {
        txtitemId.setText("");
       if(cbPantry.getSelectedItem().toString().isEmpty()){
        txtPM.setText("");
        }else{ txtPM.setText(getMngrName(cbPantry.getSelectedItem().toString())); }
        txtFDitem.setText("");
        txtFDq.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbPantryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPantryActionPerformed
        // TODO add your handling code here:
        String fpname=cbPantry.getSelectedItem().toString();
        txtPM.setText(getMngrName(fpname));
    }//GEN-LAST:event_cbPantryActionPerformed

    public String getMngrName(String pantry){
        String mngr="";
        for(FCPantry fp: ecosystem.getFCPDirectory().getFcpList()){
            if(fp.getFcpName().equals(pantry)){
                mngr = fp.getFcpManager(); 
            }
        }
        return mngr;
    }
    
    private void txtitemIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtitemIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemIdFocusLost

    private void txtPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPMActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clearfields();
    }//GEN-LAST:event_btnclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> cbPantry;
    private javax.swing.JLabel lblAddFCPTitle;
    private javax.swing.JLabel lblFDitem;
    private javax.swing.JLabel lblFDq;
    private javax.swing.JLabel lblPantry;
    private javax.swing.JLabel lblPantryMg;
    private javax.swing.JLabel lblWHname;
    private javax.swing.JLabel lblWHval;
    private javax.swing.JLabel lblitemID;
    private javax.swing.JTextField txtFDitem;
    private javax.swing.JTextField txtFDq;
    private javax.swing.JTextField txtPM;
    private javax.swing.JTextField txtitemId;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        if(txtPM.getText().length()!=0 && txtFDitem.getText().length()!=0 && txtFDq.getText().length()!=0)
        {
            return false;
        }
        else return true;
    }
}
