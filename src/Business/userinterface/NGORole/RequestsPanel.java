/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.NGO.NGO;
import Business.NGOVolunteer.VolRequests;
import Business.NGOVolunteer.Volunteer;
import Business.Reqorder.Reqorder;
import Business.AccountOfUser.AccountOfUser;
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

/**
 *
 * @author sowmyachinimilli
 */
public class RequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form Requests
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    AccountOfUser userAcc;
    String ngoAName;
    String ngoName = "";

    public RequestsPanel(JPanel userProcessContainer, EcoSystem ecosystem, AccountOfUser userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        ngoAName = userAcc.getEmployee().getName();
        for (NGO ng : ecosystem.getNgoDir().getNgoList()) {
            if (ng.getNgoAgent().equals(ngoAName)) {
                ngoName = ng.getNgoName();
            }
        }
        setBG();
        makeTableTransparent1();
        makeTableTransparent();
        populateRTable();
        populateVTable();
        //tblV.setVisible(false);
        // btnAvail.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddVolTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblR = new javax.swing.JTable();
        btnAvail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblV = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        lblAddVolTitle1 = new javax.swing.JLabel();
        lblW = new javax.swing.JLabel();
        lblAddVolTitle2 = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddVolTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblAddVolTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblAddVolTitle.setText("Requests from Food Cloud");
        add(lblAddVolTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 6, -1, -1));

        tblR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Request", "Warehouse", "Number of Persons", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblR);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 59, 696, 129));

        btnAvail.setText("Make Available");
        btnAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailActionPerformed(evt);
            }
        });
        add(btnAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 463, -1, -1));

        tblV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer Id", "Name", "Address", "City", "Zipcode", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblV);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 292, 814, 153));

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 206, -1, -1));

        lblAddVolTitle1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddVolTitle1.setText("For Warehouse:");
        add(lblAddVolTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 259, -1, -1));

        lblW.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(lblW, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 241, -1, -1));

        lblAddVolTitle2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAddVolTitle2.setText("Request ID:");
        add(lblAddVolTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 224, -1, -1));

        lblR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 235, -1, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 850));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1350, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(ManageVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void makeTableTransparent() {
        tblR.setOpaque(false);
        ((DefaultTableCellRenderer) tblR.getDefaultRenderer(Object.class)).setOpaque(false);
        tblR.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblR.getModel().getColumnCount(); i++) {
            tblR.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    public void makeTableTransparent1() {
        tblV.setOpaque(false);
        ((DefaultTableCellRenderer) tblV.getDefaultRenderer(Object.class)).setOpaque(false);
        tblV.setShowGrid(false);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblV.getModel().getColumnCount(); i++) {
            tblV.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    

    private void btnAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblV.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblV.getModel();
        Volunteer selectedV = (Volunteer) model.getValueAt(selectedRowIndex, 0);
        if (selectedV.getVolAvail().equals("New") || selectedV.getVolAvail().equals("No")) {
            selectedV.setVolAvail("Yes");
            String reqidval = lblR.getText();
            for (VolRequests vr : ecosystem.getVRDirectory().getVrList()) {
                if (vr.getVolreqId().equals(reqidval)) {
                    vr.setVolreqStatus("Completed");
                }
            }
            JOptionPane.showMessageDialog(this, "Request Completed");
        } else if (selectedV.getVolAvail().equals("Yes")) {
            JOptionPane.showMessageDialog(this, "This Volunteer is already available");
        }
        populateRTable();
        populateVTable();
        lblR.setText("");
        lblW.setText("");
    }//GEN-LAST:event_btnAvailActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblR.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblR.getModel();
        VolRequests selectedVR = (VolRequests) model.getValueAt(selectedRowIndex, 0);
        if (selectedVR.getVolreqStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request already completed!");
        } else {
            lblW.setText(selectedVR.getVolreqWH());
            lblR.setText(selectedVR.getVolreqId());
            tblV.setVisible(true);
            btnAvail.setVisible(true);
        }
        populateVTable();
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnAvail;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddVolTitle;
    private javax.swing.JLabel lblAddVolTitle1;
    private javax.swing.JLabel lblAddVolTitle2;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblW;
    private javax.swing.JTable tblR;
    private javax.swing.JTable tblV;
    // End of variables declaration//GEN-END:variables

    private void populateRTable() {
        DefaultTableModel model = (DefaultTableModel) tblR.getModel();
        model.setRowCount(0);
        for (VolRequests vr : ecosystem.getVRDirectory().getVrList()) {
            if (vr.getVolreqName().equals(ngoName)) {
                Object[] row = new Object[6];
                row[0] = vr;
                row[1] = vr.getVolreqName();
                row[2] = vr.getVolreqWH();
                row[3] = vr.getVolreqNum();
                row[4] = vr.getVolreqStatus();
                model.addRow(row);
            }
        }
    }

    private void populateVTable() {
        DefaultTableModel model = (DefaultTableModel) tblV.getModel();
        model.setRowCount(0);
        for (Volunteer vol : ecosystem.getVolDir().getVolunteerList()) {
            if (vol.getVolNGO().equals(ngoAName)) {
                Object[] row = new Object[6];
                row[0] = vol;
                row[1] = vol.getVolName();
                row[2] = vol.getVolAddress();
                row[3] = vol.getVolCity();
                row[4] = vol.getVolZipcode();
                row[5] = vol.getVolAvail();
                model.addRow(row);
            }
        }
    }
}