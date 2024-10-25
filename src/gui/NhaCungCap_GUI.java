
package gui;

import com.formdev.flatlaf.FlatClientProperties;
import utilities.SVGIcon;

public class NhaCungCap_GUI extends javax.swing.JPanel {
    public NhaCungCap_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_timSoDienThoai = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_loc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nhaCungCap = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_tenNhaCungCap = new javax.swing.JTextField();
        jtf_soDienThoai = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_diaChi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rd_dangLamViec = new javax.swing.JRadioButton();
        rd_nghiViec = new javax.swing.JRadioButton();
        btn_lamMoi = new javax.swing.JButton();
        btn_capNhat = new javax.swing.JButton();
        btn_xuatFile = new javax.swing.JButton();
        btn_themMoi = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Tìm theo số điện thoại");

        jButton2.setText("Lọc");

        btn_loc.setBackground(new java.awt.Color(102, 153, 255));
        btn_loc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_loc.setText("Lọc");
        btn_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_timSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btn_loc)
                .addGap(512, 512, 512)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_timSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        tbl_nhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ", "Email", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tbl_nhaCungCap);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Tên nhà cung cấp :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Số điện thoại :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Email :");

        jtf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ  :");

        jtf_diaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_diaChiActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Trạng thái:");

        rd_dangLamViec.setText("Đang làm việc");

        rd_nghiViec.setText("Nghỉ việc");
        rd_nghiViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_nghiViecActionPerformed(evt);
            }
        });

        btn_lamMoi.setFont(btn_lamMoi.getFont().deriveFont((float)14));
        btn_lamMoi.setText("Xóa trắng");
        btn_lamMoi.setIcon(SVGIcon.getSVGIcon("imgs/public/clear.svg"));
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });

        btn_capNhat.setFont(btn_capNhat.getFont().deriveFont((float)14));
        btn_capNhat.setText("Cập nhật");
        btn_capNhat.setIcon(SVGIcon.getSVGIcon("imgs/public/update.svg"));
        btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatActionPerformed(evt);
            }
        });

        btn_xuatFile.setFont(btn_xuatFile.getFont().deriveFont((float)14));
        btn_xuatFile.setText("Xuất file");
        btn_xuatFile.setIcon(SVGIcon.getSVGIcon("imgs/public/excel.svg"));
        btn_xuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatFileActionPerformed(evt);
            }
        });

        btn_themMoi.setFont(btn_themMoi.getFont().deriveFont((float)14));
        btn_themMoi.setText("Thêm mới");
        btn_themMoi.putClientProperty(FlatClientProperties.STYLE, "background: $Menu.background;"+"foreground: $Menu.foreground");
        btn_themMoi.setIcon(SVGIcon.getPrimarySVGIcon("imgs/public/add.svg"));
        btn_themMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_tenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_dangLamViec)
                        .addGap(18, 18, 18)
                        .addComponent(rd_nghiViec)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_themMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_tenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_dangLamViec)
                    .addComponent(rd_nghiViec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_themMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emailActionPerformed

    private void btn_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_locActionPerformed

    private void jtf_diaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_diaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_diaChiActionPerformed

    private void rd_nghiViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_nghiViecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_nghiViecActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        // TODO add your handling code here:
//        lamMoiForm();
//        jtf_soDienThoai.setText("");
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatActionPerformed
//        int row = tbl_khachHang.getSelectedRow();
//        //        if (row != -1)
//        try {
//            if (row != -1) {
//                KhachHang_DAO.capNhat(jtf_maKhachHang.getText(), getGiaTriForm());
//                taiThongTinLenBang(listKH);
//
//            } else {
//                Notifications.getInstance().show(Notifications.Type.ERROR, "Chưa chọn khách hàng muốn cập nhật thông tin!");
//                return;
//            }
//            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Cập nhật thông tin khách hàng thành công!");
//
//        } catch (Exception ex) {
//            Logger.getLogger(Customers_GUI.class
//                .getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btn_capNhatActionPerformed

    private void btn_xuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatFileActionPerformed
//        // Hiển thị hộp thoại chọn file
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Chọn đường dẫn và tên file");
//        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//
//        // Hiển thị hộp thoại và kiểm tra nếu người dùng chọn OK
//        int userSelection = fileChooser.showSaveDialog(null);
//        if (userSelection == JFileChooser.APPROVE_OPTION) {
//            // Lấy đường dẫn và tên file được chọn
//            File fileToSave = fileChooser.getSelectedFile();
//            String filePath = fileToSave.getAbsolutePath();
//
//            // Gọi phương thức để tạo file Excel với đường dẫn và tên file đã chọn
//            taoFileExcel(listKH, filePath + ".xlsx");
//        }
    }//GEN-LAST:event_btn_xuatFileActionPerformed

    private void btn_themMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themMoiActionPerformed
//        try {
//            // TODO add your handling code here:
//            KhachHang kh = new KhachHang(jtf_maKhachHang.getText(), jtf_tenKhachHang.getText(), jtf_sdt.getText(), 0);
//            boolean isCompleted = KhachHang_DAO.taoMoi(kh);
//            if (!isCompleted) {
//                Notifications.getInstance().show(Notifications.Type.ERROR, "Khách hàng đã tồn tại");
//                return;
//            }
//            taiThongTinLenBang(listKH);
//            lamMoiForm();
//            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Thêm khách hàng thành công!");
//
//        } catch (Exception ex) {
//            Notifications.getInstance().show(Notifications.Type.ERROR, ex.getMessage());
//        }
    }//GEN-LAST:event_btn_themMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhat;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_loc;
    private javax.swing.JButton btn_themMoi;
    private javax.swing.JButton btn_xuatFile;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtf_diaChi;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_soDienThoai;
    private javax.swing.JTextField jtf_tenNhaCungCap;
    private javax.swing.JTextField jtf_timSoDienThoai;
    private javax.swing.JRadioButton rd_dangLamViec;
    private javax.swing.JRadioButton rd_nghiViec;
    private javax.swing.JTable tbl_nhaCungCap;
    // End of variables declaration//GEN-END:variables
}
