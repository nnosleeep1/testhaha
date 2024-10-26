/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import connect.ConnectDB;
import dao.TaiKhoan_DAO;
import entity.TaiKhoan;
import gui.main.MainForm;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import main.Main;

/**
 *
 * @author Hà Như
 */
public class LoginForm extends javax.swing.JPanel {
   
    
        private Main mainFrame; // Tham chiếu đến Main


 
    // Constructor
    public LoginForm(Main main) {
        this.mainFrame = main; // Gán tham chiếu
        initComponents();
    }

    /**
     *
     * @throws SQLException
     */
    public LoginForm()  {
        initComponents();
            
//        connectDB.connect();
           
       setVisible(true);
    
    }
    

    public Dimension getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        btn_DangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        lblTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GUI/pharmacy (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 290));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("PHARMAHOME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 165, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GUI/alternative-medicine.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("ĐĂNG NHẬP");

        txtTaiKhoan.setText("NVBH456");
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        btn_DangNhap.setBackground(new java.awt.Color(153, 255, 153));
        btn_DangNhap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_DangNhap.setText("Đăng Nhập");
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });

        txtMatKhau.setText("NVBH456@@");

        lblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTaiKhoan.setText("Tài khoản:");

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMatKhau.setText("Mật khẩu: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMatKhau)
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btn_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(btn_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 450, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        
       
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhapActionPerformed
        
 if (ktDangNhap()) { // Gọi phương thức ktDangNhap() để kiểm tra đăng nhập
        // Nếu đăng nhập thành công
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this); // Lấy cửa sổ cha
        if (parentFrame instanceof Main) { // Kiểm tra xem parentFrame có phải là Main không
            Main main = (Main) parentFrame; // Cast an toàn
            main.setVisible(true); // Hiển thị cửa sổ Main
            parentFrame.dispose(); // Đóng cửa sổ đăng nhập
        }
    }
    }//GEN-LAST:event_btn_DangNhapActionPerformed
//    public static void main(String[] args) throws SQLException {
//        javax.swing.JFrame frame = new javax.swing.JFrame();
//        frame.setContentPane(new LoginForm());
//        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setLocationRelativeTo(null); 
//        frame.setVisible(true);
//    }
  
public boolean ktDangNhap(){
    String username = txtTaiKhoan.getText();
        String password = new String(txtMatKhau.getPassword());
        StringBuilder sb = new StringBuilder();
        System.out.println(password);
        if (username.equals("")) {
            sb.append("Tài khoản không được để trống\n");
        }
        if (password.equals("")) {
            sb.append("Mật khẩu không được để trống\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        TaiKhoan_DAO taiKhoanDAO = new TaiKhoan_DAO();
        TaiKhoan taiKhoan = taiKhoanDAO.getTaiKhoan(username);
       
        if (taiKhoan != null && taiKhoan.getPassword().equals(password)) {
        // Đăng nhập thành công
        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    
        MainForm main = new MainForm();
     
        SwingUtilities.getWindowAncestor(this).dispose(); // Đóng cửa sổ LoginForm
       // new Main().setVisible(true);
        return true;
        
    } else {
        JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không chính xác", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
    }
       return false;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
