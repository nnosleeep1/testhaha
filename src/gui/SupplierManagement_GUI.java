/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

//import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatClientProperties;
import entity.Order;
import entity.PurchaseOrder;
import entity.PurchaseOrderDetail;
import entity.Supplier;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
//import main.Application;
import raven.toast.Notifications;
import utilities.SVGIcon;

public class SupplierManagement_GUI extends javax.swing.JPanel {

    public SupplierManagement_GUI() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane_main = new javax.swing.JSplitPane();
        pnl_left = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        pnl_cart = new javax.swing.JPanel();
        scr_cart = new javax.swing.JScrollPane();
        tbl_supplier = new javax.swing.JTable();
        pnl_right = new javax.swing.JPanel();
        pnl_info = new javax.swing.JPanel();
        pnl_orderInfo = new javax.swing.JPanel();
        pnl_orderID = new javax.swing.JPanel();
        lbl_supplierID = new javax.swing.JLabel();
        txt_supplierID = new javax.swing.JTextField();
        pnl_orderDate = new javax.swing.JPanel();
        lbl_supplierName = new javax.swing.JLabel();
        txt_supplierName = new javax.swing.JTextField();
        pnl_orderCustomerGive = new javax.swing.JPanel();
        pnl_container = new javax.swing.JPanel();
        lbl_address = new javax.swing.JLabel();
        scr_description = new javax.swing.JScrollPane();
        txa_address = new javax.swing.JTextArea();
        pnl_btnGroup = new javax.swing.JPanel();
        btn_clear = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_create = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0));

        splitPane_main.setResizeWeight(0.7);
        splitPane_main.setMinimumSize(new java.awt.Dimension(1305, 768));

        pnl_left.setMinimumSize(new java.awt.Dimension(700, 59));
        pnl_left.setPreferredSize(new java.awt.Dimension(900, 768));
        pnl_left.setLayout(new java.awt.BorderLayout());

        pnl_header.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(71, 118, 185))); // NOI18N
        pnl_header.setPreferredSize(new java.awt.Dimension(1366, 60));
        pnl_header.setLayout(new javax.swing.BoxLayout(pnl_header, javax.swing.BoxLayout.LINE_AXIS));

        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Mã nhà cung cấp");
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });
        pnl_header.add(txt_search);

        btn_search.setText("Tìm kiếm");
        btn_search.setMaximumSize(new java.awt.Dimension(100, 50));
        btn_search.setMinimumSize(new java.awt.Dimension(100, 50));
        btn_search.setPreferredSize(new java.awt.Dimension(100, 50));
        btn_search.putClientProperty(FlatClientProperties.STYLE,""
            + "background:$Menu.background;"
            + "foreground:$Menu.foreground;");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        pnl_header.add(btn_search);

        pnl_left.add(pnl_header, java.awt.BorderLayout.NORTH);

        pnl_cart.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(71, 118, 185))); // NOI18N
        pnl_cart.setLayout(new java.awt.BorderLayout());

        tbl_supplier.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scr_cart.setViewportView(tbl_supplier);

        pnl_cart.add(scr_cart, java.awt.BorderLayout.CENTER);

        pnl_left.add(pnl_cart, java.awt.BorderLayout.CENTER);

        splitPane_main.setLeftComponent(pnl_left);

        pnl_right.setPreferredSize(new java.awt.Dimension(400, 768));
        pnl_right.setLayout(new java.awt.BorderLayout());

        pnl_info.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_info.setLayout(new javax.swing.BoxLayout(pnl_info, javax.swing.BoxLayout.Y_AXIS));

        pnl_orderInfo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(71, 118, 185)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5))); // NOI18N
        pnl_orderInfo.setMaximumSize(new java.awt.Dimension(2147483647, 300));
        pnl_orderInfo.setPreferredSize(new java.awt.Dimension(500, 400));
        pnl_orderInfo.setLayout(new javax.swing.BoxLayout(pnl_orderInfo, javax.swing.BoxLayout.Y_AXIS));

        pnl_orderID.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_orderID.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnl_orderID.setPreferredSize(new java.awt.Dimension(561, 40));
        pnl_orderID.setLayout(new javax.swing.BoxLayout(pnl_orderID, javax.swing.BoxLayout.LINE_AXIS));

        lbl_supplierID.setText("Mã nhà cung cấp: ");
        lbl_supplierID.setPreferredSize(new java.awt.Dimension(130, 40));
        pnl_orderID.add(lbl_supplierID);

        txt_supplierID.setEnabled(false);
        txt_supplierID.setPreferredSize(new java.awt.Dimension(64, 40));
        pnl_orderID.add(txt_supplierID);

        pnl_orderInfo.add(pnl_orderID);

        pnl_orderDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_orderDate.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnl_orderDate.setPreferredSize(new java.awt.Dimension(561, 40));
        pnl_orderDate.setLayout(new javax.swing.BoxLayout(pnl_orderDate, javax.swing.BoxLayout.LINE_AXIS));

        lbl_supplierName.setText("Tên nhà cung cấp: ");
        lbl_supplierName.setPreferredSize(new java.awt.Dimension(130, 40));
        pnl_orderDate.add(lbl_supplierName);

        txt_supplierName.setPreferredSize(new java.awt.Dimension(64, 40));
        txt_supplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplierNameActionPerformed(evt);
            }
        });
        pnl_orderDate.add(txt_supplierName);

        pnl_orderInfo.add(pnl_orderDate);

        pnl_orderCustomerGive.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_orderCustomerGive.setMaximumSize(new java.awt.Dimension(32767, 120));
        pnl_orderCustomerGive.setPreferredSize(new java.awt.Dimension(561, 100));
        pnl_orderCustomerGive.setLayout(new javax.swing.BoxLayout(pnl_orderCustomerGive, javax.swing.BoxLayout.Y_AXIS));

        pnl_container.setLayout(new java.awt.GridLayout(1, 0));

        lbl_address.setText("Địa chỉ:");
        lbl_address.setToolTipText("");
        lbl_address.setPreferredSize(new java.awt.Dimension(130, 40));
        pnl_container.add(lbl_address);

        pnl_orderCustomerGive.add(pnl_container);

        txa_address.setColumns(20);
        txa_address.setRows(10);
        txa_address.setTabSize(4);
        txa_address.setWrapStyleWord(true);
        txa_address.setMinimumSize(new java.awt.Dimension(13, 200));
        txa_address.setPreferredSize(new java.awt.Dimension(232, 200));
        scr_description.setViewportView(txa_address);

        pnl_orderCustomerGive.add(scr_description);

        pnl_orderInfo.add(pnl_orderCustomerGive);

        pnl_info.add(pnl_orderInfo);

        pnl_right.add(pnl_info, java.awt.BorderLayout.CENTER);

        pnl_btnGroup.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnl_btnGroup.setPreferredSize(new java.awt.Dimension(281, 60));
        pnl_btnGroup.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        btn_clear.setText("Xóa trắng");
        btn_clear.setIcon(SVGIcon.getSVGIcon("imgs/public/clear.svg"));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        pnl_btnGroup.add(btn_clear);

        btn_update.setText("Cập nhật");
        btn_update.setIcon(SVGIcon.getSVGIcon("imgs/public/update.svg"));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        pnl_btnGroup.add(btn_update);

        btn_create.setText("Thêm mới");
        btn_create.putClientProperty(FlatClientProperties.STYLE,""
            + "background:$Menu.background;"
            + "foreground:$Menu.foreground;");
        btn_create.setIcon(SVGIcon.getPrimarySVGIcon("imgs/public/add.svg"));
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        pnl_btnGroup.add(btn_create);

        pnl_right.add(pnl_btnGroup, java.awt.BorderLayout.SOUTH);

        splitPane_main.setRightComponent(pnl_right);

        add(splitPane_main);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
    
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
 
    }//GEN-LAST:event_btn_createActionPerformed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed


    }//GEN-LAST:event_txt_searchKeyPressed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
  
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_supplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplierNameActionPerformed

    }//GEN-LAST:event_txt_supplierNameActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

    }//GEN-LAST:event_btn_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_supplierID;
    private javax.swing.JLabel lbl_supplierName;
    private javax.swing.JPanel pnl_btnGroup;
    private javax.swing.JPanel pnl_cart;
    private javax.swing.JPanel pnl_container;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_info;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_orderCustomerGive;
    private javax.swing.JPanel pnl_orderDate;
    private javax.swing.JPanel pnl_orderID;
    private javax.swing.JPanel pnl_orderInfo;
    private javax.swing.JPanel pnl_right;
    private javax.swing.JScrollPane scr_cart;
    private javax.swing.JScrollPane scr_description;
    private javax.swing.JSplitPane splitPane_main;
    private javax.swing.JTable tbl_supplier;
    private javax.swing.JTextArea txa_address;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_supplierID;
    private javax.swing.JTextField txt_supplierName;
    // End of variables declaration//GEN-END:variables
}
