/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VolunteerRole;

import Business.Donation.Donation;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.NGOVolunteer.Volunteer;
import Business.Reqorder.Reqorder;
import Business.Reqorder.ReqorderDirectory;
import Business.AccountOfUser.AccountOfUser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.DonorRole.DonorAreaJPanel;
import userinterface.DonorRole.DonorProfilePanel;
import userinterface.MainJFrame;

/**
 *
 * @author sowmyachinimilli
 */
public class VolunteeringAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteeringAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    AccountOfUser userAccount;
    JPanel jp;
    JSplitPane jsp;
    String name;

    public VolunteeringAreaPanel(JPanel userProcessContainer, EcoSystem ecosystem, AccountOfUser userAccount, JPanel jp, JSplitPane jsp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.jp = jp;
        this.jsp = jsp;
        name = userAccount.getEmployee().getName();

         if(ecosystem.getDonatDirectory()== null){
         ecosystem.setDonatDirectory(new DonationDirectory());
        }
         if (ecosystem.getReqorderDirectory() == null) {
            ecosystem.setReqorderDirectory(new ReqorderDirectory());
        }

        setBG();
        logoutlogo();
        makeTableTransparent();
        makeTableTransparent1();
        setLogo();
        
        populatePickupTable();
        populateDelTable();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReqDel = new javax.swing.JTable();
        lblDonProfileTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonPick = new javax.swing.JTable();
        lblDonProfileTitle1 = new javax.swing.JLabel();
        lblDonProfileTitle2 = new javax.swing.JLabel();
        btnAcceptPickup = new javax.swing.JButton();
        btnProcessPickup = new javax.swing.JButton();
        btnAcceptDel = new javax.swing.JButton();
        btnProcessDel = new javax.swing.JButton();
        lbllogout = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReqDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Requestor", "Address", "City", "Zip Code", "Status"
            }
        ));
        tblReqDel.setOpaque(false);
        tblReqDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblReqDelMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblReqDel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 389, 1008, 153));

        lblDonProfileTitle.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblDonProfileTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblDonProfileTitle.setText("Food Cloud Requests");
        add(lblDonProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 340, -1));

        tblDonPick.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Donation ID", "Donor", "Address", "City", "Zip Code", "Status"
            }
        ));
        tblDonPick.setOpaque(false);
        tblDonPick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDonPickMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDonPick);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1008, 153));

        lblDonProfileTitle1.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        lblDonProfileTitle1.setForeground(new java.awt.Color(51, 153, 255));
        lblDonProfileTitle1.setText("Pickup Requests");
        add(lblDonProfileTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, -1));

        lblDonProfileTitle2.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        lblDonProfileTitle2.setForeground(new java.awt.Color(51, 153, 255));
        lblDonProfileTitle2.setText("Delivery Requests");
        add(lblDonProfileTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, 220, -1));

        btnAcceptPickup.setText("Accept");
        btnAcceptPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptPickupActionPerformed(evt);
            }
        });
        add(btnAcceptPickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        btnProcessPickup.setText("Process");
        btnProcessPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessPickupActionPerformed(evt);
            }
        });
        add(btnProcessPickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        btnAcceptDel.setText("Accept");
        btnAcceptDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptDelActionPerformed(evt);
            }
        });
        add(btnAcceptDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 560, -1, -1));

        btnProcessDel.setText("Process");
        btnProcessDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessDelActionPerformed(evt);
            }
        });
        add(btnProcessDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 560, -1, -1));

        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbllogoutMousePressed(evt);
            }
        });
        add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 40, 30));
        add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 60));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 790));
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

    public void logoutlogo() {

        try {

            lbllogout.setMinimumSize(new Dimension(50, 60));
            lbllogout.setPreferredSize(new Dimension(50, 60));
            lbllogout.setMaximumSize(new Dimension(50, 60));

            Image img1 = ImageIO.read(getClass().getResource("/Images/Logout.png"));
            Image newimg1 = img1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

            lbllogout.setIcon(new ImageIcon(newimg1));

        } catch (IOException ex) {
            Logger.getLogger(DonorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void makeTableTransparent() {
        tblDonPick.setOpaque(false);
        ((DefaultTableCellRenderer) tblDonPick.getDefaultRenderer(Object.class)).setOpaque(false);
        tblDonPick.setShowGrid(false);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblDonPick.getModel().getColumnCount(); i++) {
            tblDonPick.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    public void makeTableTransparent1() {
        tblReqDel.setOpaque(false);
        ((DefaultTableCellRenderer) tblReqDel.getDefaultRenderer(Object.class)).setOpaque(false);
        tblReqDel.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblReqDel.getModel().getColumnCount(); i++) {
            tblReqDel.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
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

    private void btnAcceptPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptPickupActionPerformed

        int selectedRow = tblDonPick.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Donation dt = (Donation) tblDonPick.getValueAt(selectedRow, 0);
        //        order.setDeliveryMan(userAccount.getEmployee().getName());
        if (dt.getDonatStatus().equals("Assigned to Volunteer")) {
            dt.setDonatStatus("Order Picked up");
        } else {
            JOptionPane.showMessageDialog(null, "Order is accpeted or completed already");
        }
        populatePickupTable();
    }//GEN-LAST:event_btnAcceptPickupActionPerformed

    private void btnProcessPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessPickupActionPerformed

        int selectedRow = tblDonPick.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Donation dt = (Donation) tblDonPick.getValueAt(selectedRow, 0);
        if (dt.getDonatStatus().equals("Delivered")) {
            JOptionPane.showMessageDialog(null, "Already Delivered.");
            return;
        } else if (dt.getDonatStatus().equals("Order Picked up")) {
            dt.setDonatStatus("Delivered");
            for (Volunteer v : ecosystem.getVolDir().getVolunteerList()) {
                if (v.getVolName().equals(name)) {
                    v.setVolAvail("Yes");
                }
            }
            JOptionPane.showMessageDialog(null, "Delivered Order with id : " + dt.getDonatId());
            populatePickupTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please accept the order first");
        }

        //orderDirectory.getOrderDirectory().remove(order);

    }//GEN-LAST:event_btnProcessPickupActionPerformed

    private void btnAcceptDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptDelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReqDel.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Reqorder rq = (Reqorder) tblReqDel.getValueAt(selectedRow, 0);
        //        order.setDeliveryMan(userAccount.getEmployee().getName());
        if (rq.getReqOrderStatus().equals("Assigned to Volunteer")) {
            rq.setReqOrderStatus("Order Picked up");
        } else {
            JOptionPane.showMessageDialog(null, "Order is accpeted or completed already");
        }
        populateDelTable();

    }//GEN-LAST:event_btnAcceptDelActionPerformed

    private void btnProcessDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessDelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReqDel.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Reqorder rq = (Reqorder) tblReqDel.getValueAt(selectedRow, 0);
        if (rq.getReqOrderStatus().equals("Delivered")) {
            JOptionPane.showMessageDialog(null, "Already Delivered.");
            return;
        } else if (rq.getReqOrderStatus().equals("Order Picked up")) {
            rq.setReqOrderStatus("Delivered");
            for (Volunteer v : ecosystem.getVolDir().getVolunteerList()) {
                if (v.getVolName().equals(name)) {
                    v.setVolAvail("Yes");
                }
            }
            JOptionPane.showMessageDialog(null, "Delivered Order with id : " + rq.getReqOrderId());
            populateDelTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please accept the order first");
        }
    }//GEN-LAST:event_btnProcessDelActionPerformed

    private void lbllogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_lbllogoutMousePressed

    private void tblDonPickMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonPickMousePressed
        // TODO add your handling code here:
              tblDonPick.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblDonPickMousePressed

    private void tblReqDelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReqDelMousePressed
        // TODO add your handling code here:
              tblReqDel.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblReqDelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnAcceptDel;
    private javax.swing.JButton btnAcceptPickup;
    private javax.swing.JButton btnProcessDel;
    private javax.swing.JButton btnProcessPickup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDonProfileTitle;
    private javax.swing.JLabel lblDonProfileTitle1;
    private javax.swing.JLabel lblDonProfileTitle2;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel logoImage;
    private javax.swing.JTable tblDonPick;
    private javax.swing.JTable tblReqDel;
    // End of variables declaration//GEN-END:variables

    private void populatePickupTable() {
        DefaultTableModel model = (DefaultTableModel) tblDonPick.getModel();
        model.setRowCount(0);
        for (Donation dt : ecosystem.getDonatDirectory().getDonatList()) {
            if (dt.getDonatVol().equals(userAccount.getEmployee().getName())) {
                Object[] row = new Object[6];
                row[0] = dt;
                row[1] = dt.getDonatDname();
                row[2] = dt.getDonatAdd();
                row[3] = dt.getDonatCity();
                row[4] = dt.getDonatZip();
                row[5] = dt.getDonatStatus();
                model.addRow(row);
            }
        }
    }

    private void populateDelTable() {
        DefaultTableModel model = (DefaultTableModel) tblReqDel.getModel();
        model.setRowCount(0);
        for(Reqorder rq: ecosystem.getReqorderDirectory().getReqOrderList()){
            if(rq.getReqVol().equals(userAccount.getEmployee().getName())){
           Object[] row = new Object[6];
           row[0] =rq;
           row[1] =rq.getReqName();
           row[2] =rq.getReqAdd();
           row[3] =rq.getReqCity();
           row[4] =rq.getReqZip();
           row[5] =rq.getReqOrderStatus();
           model.addRow(row);
            }
        }
    }
}
