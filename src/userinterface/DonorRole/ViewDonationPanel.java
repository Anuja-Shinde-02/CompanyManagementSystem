/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorRole;

import Business.Donation.Donation;
import Business.EcoSystem;
import Business.AccountOfUser.AccountOfUser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class ViewDonationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDonationPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    AccountOfUser userAcc;

    public ViewDonationPanel(JPanel userProcessContainer, EcoSystem ecosystem, AccountOfUser userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        populateTable();
        setBG();
       // setLogo();
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

        lblDonProfileTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDon = new javax.swing.JTable();
        logoImage = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setLayout(null);

        lblDonProfileTitle.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblDonProfileTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblDonProfileTitle.setText("My Food Cloud Donations");
        add(lblDonProfileTitle);
        lblDonProfileTitle.setBounds(310, 60, 383, 34);

        tblDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donation Id", "Food Item", "Quantity", "Warehouse", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDon);
        if (tblDon.getColumnModel().getColumnCount() > 0) {
            tblDon.getColumnModel().getColumn(0).setResizable(false);
            tblDon.getColumnModel().getColumn(1).setResizable(false);
            tblDon.getColumnModel().getColumn(2).setResizable(false);
            tblDon.getColumnModel().getColumn(3).setResizable(false);
            tblDon.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(43, 185, 994, 220);
        add(logoImage);
        logoImage.setBounds(75, 31, 102, 104);
        add(LabelImage);
        LabelImage.setBounds(0, 0, 1550, 870);
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(1500, 1000));
            LabelImage.setPreferredSize(new Dimension(1500, 1000));
            LabelImage.setMaximumSize(new Dimension(1500, 1000));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(2000, 1000, java.awt.Image.SCALE_SMOOTH);
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
        tblDon.setOpaque(false);
        ((DefaultTableCellRenderer) tblDon.getDefaultRenderer(Object.class)).setOpaque(false);
        tblDon.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblDon.getModel().getColumnCount(); i++) {
            tblDon.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDonProfileTitle;
    private javax.swing.JLabel logoImage;
    private javax.swing.JTable tblDon;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDon.getModel();
        model.setRowCount(0);
        for (Donation dt : ecosystem.getDonatDirectory().getDonatList()) {
            Object[] row = new Object[5];
            row[0] = dt;
            row[1] = dt.getDonatFooditem();
            row[2] = dt.getDonatFoodQuant();
            row[3] = dt.getDonatWHname();
            row[4] = dt.getDonatStatus();
            model.addRow(row);
        }
    }

}
