/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import connect.ConnectDB;
import dao.NhanVien_DAO;
import dao.VaiTro_DAO;
import entity.NhanVien;
import entity.VaiTro;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import utilities.ConvertDate;
import utilities.PlaceholderSupport;

/**
 *
 * @author HÀ NHƯ
 */
public class Employees_GUI extends javax.swing.JPanel {

    private NhanVien_DAO nv_Dao;
    private ArrayList<NhanVien> listNV;
    private DefaultTableModel tableModel;
    private VaiTro_DAO vaiTro_DAO;

    public Employees_GUI() throws SQLException {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        initComponents();
        ConnectDB.connect();
        nv_Dao = new NhanVien_DAO();
        vaiTro_DAO = new VaiTro_DAO();
        tableModel = new DefaultTableModel(new String[]{"Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Email", "Địa chỉ", "CCCD"}, 0);
        tableNV.setModel(tableModel);
        buttonGroup1.add(rdb_dangLamViec);
        buttonGroup1.add(rdb_nghiViec);
        initTable();
        initJcb();
    }

    public void initTable() {
        listNV = nv_Dao.getAllNhanVien();
        for (NhanVien nv : listNV) {
            Object obj[] = new Object[6];
            obj[0] = nv.getMaNhanVien();
            obj[1] = nv.getTenNhanVien();
            obj[2] = nv.getSdt();
            obj[3] = nv.getEmail();
            obj[4] = nv.getDiaChi();
            obj[5] = nv.getCccd();
            tableModel.addRow(obj);
        }
    }

    public void initJcb() {
        ArrayList<VaiTro> list = vaiTro_DAO.getAllVaiTro();
        for (VaiTro vt : list) {
            jcb_vaiTro.addItem(vt.getTen());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtf_timTheoMa = new javax.swing.JTextField();
        jtf_timTheoTen = new javax.swing.JTextField();
        jcb_trangThai = new javax.swing.JComboBox<>();
        btn_loc = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jcb_vaiTro = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_maNhanVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_tenNhanVien = new javax.swing.JTextField();
        jtf_sdt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtf_emil = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtf_diaChi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtf_cccd = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rdb_dangLamViec = new javax.swing.JRadioButton();
        rdb_nghiViec = new javax.swing.JRadioButton();
        btn_xoaTrang = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jDate_ngayVaoLam = new com.toedter.calendar.JDateChooser();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jtf_timTheoMa.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"Nhập mã nhân viên");
        jtf_timTheoMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_timTheoMaKeyTyped(evt);
            }
        });

        jtf_timTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_timTheoTenActionPerformed(evt);
            }
        });
        jtf_timTheoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_timTheoTenKeyTyped(evt);
            }
        });

        jcb_trangThai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcb_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trạng thái", "Đang làm", "Nghỉ việc" }));
        jcb_trangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_trangThaiActionPerformed(evt);
            }
        });

        btn_loc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_loc.setText("Lọc");
        btn_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload_employee.png"))); // NOI18N
        jButton3.setText("Tải lại");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jcb_vaiTro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcb_vaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_vaiTroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_timTheoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_timTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcb_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcb_vaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_timTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_vaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_timTheoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jtf_timTheoMa.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"Nhập mã nhân viên");
        jtf_timTheoTen.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nhập tên nhân viên");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Email", "Địa chỉ", "CCCD"
            }
        ));
        tableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNV);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Mã nhân viên:");

        jtf_maNhanVien.setEnabled(false);
        jtf_maNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_maNhanVienActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Tên nhân viên: ");

        jtf_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_sdtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Số điện thoại:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText(" Email:");

        jtf_emil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emilActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Địa chỉ:");

        jtf_diaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_diaChiActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("CCCD:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Trạng thái:");

        rdb_dangLamViec.setText("Đang làm việc");

        rdb_nghiViec.setText("Nghỉ việc");
        rdb_nghiViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_nghiViecActionPerformed(evt);
            }
        });

        btn_xoaTrang.setText("Xóa trắng");
        btn_xoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTrangActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("Ngày vào làm :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(btn_xoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_emil, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdb_dangLamViec)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdb_nghiViec))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDate_ngayVaoLam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_emil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdb_dangLamViec)
                    .addComponent(rdb_nghiViec))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate_ngayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_timTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_timTheoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_timTheoTenActionPerformed

    private void rdb_nghiViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_nghiViecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_nghiViecActionPerformed

    private void jtf_maNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_maNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_maNhanVienActionPerformed

    private void jtf_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_sdtActionPerformed

    private void jtf_emilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emilActionPerformed

    private void jtf_diaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_diaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_diaChiActionPerformed

    private void jcb_trangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_trangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_trangThaiActionPerformed

    private void tableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVMouseClicked
        int index = tableNV.getSelectedRow();
        String maNhanVien = tableNV.getValueAt(index, 0) + "";
        NhanVien nv = nv_Dao.getNhanVien(maNhanVien);
        jtf_maNhanVien.setText(nv.getMaNhanVien());
        jtf_tenNhanVien.setText(nv.getTenNhanVien());
        jtf_cccd.setText(nv.getCccd());
        jtf_sdt.setText(nv.getSdt());
        jtf_emil.setText(nv.getEmail());
        jtf_diaChi.setText(nv.getDiaChi());
        if (nv.isTrangThai()) {
            rdb_dangLamViec.setSelected(true);
        } else {
            rdb_nghiViec.setSelected(true);

        }
        Date ngayVaoLam = java.sql.Date.valueOf(nv.getNgayVaolam());
        ngayVaoLam.setYear(ngayVaoLam.getYear() + 1900);
        jDate_ngayVaoLam.setDate(ngayVaoLam);

    }//GEN-LAST:event_tableNVMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        int index = tableNV.getSelectedRow();
        String maNhanVien = tableNV.getValueAt(index, 0) + "";
        NhanVien nv = nv_Dao.getNhanVien(maNhanVien);
        String tenNhanVien = jtf_tenNhanVien.getText();
        String email = jtf_emil.getText();
        String diaChi = jtf_diaChi.getText();
        String sdt = jtf_sdt.getText();
        String cccd = jtf_cccd.getText();
        boolean trangThai = true;
        if (rdb_nghiViec.isSelected()) {
            trangThai = false;
        }
        LocalDate nvl = ConvertDate.convert(jDate_ngayVaoLam.getDate());
        NhanVien newNhanVien = new NhanVien(maNhanVien, tenNhanVien, email, sdt, diaChi, cccd, trangThai, nvl);
        try {
            if (nv_Dao.suaNhanVien(maNhanVien, newNhanVien)) {
                JOptionPane.showConfirmDialog(this, "Sửa thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
                Object obj[] = new Object[6];
                obj[0] = newNhanVien.getMaNhanVien();
                obj[1] = newNhanVien.getTenNhanVien();
                obj[2] = newNhanVien.getSdt();
                obj[3] = newNhanVien.getEmail();
                obj[4] = newNhanVien.getDiaChi();
                obj[5] = newNhanVien.getCccd();
                tableModel.insertRow(index, obj);
                tableModel.removeRow(index + 1);

            } else {
                JOptionPane.showConfirmDialog(this, "Sửa thất bại", "Thông báo", JOptionPane.DEFAULT_OPTION);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Employees_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locActionPerformed
//        if (!jtf_timTheoMa.getText().equals("") && jtf_timTheoTen.getText().equals("")) {
//            NhanVien nv = nv_Dao.timKiemTheoMa(jtf_timTheoMa.getText());
//            if (nv != null) {
//                Object obj[] = initObject(nv);
//                DefaultTableModel dm = (DefaultTableModel) tableNV.getModel();
//                dm.getDataVector().removeAllElements();
//                System.out.println(obj);
//                tableModel.addRow(obj);
//            } else {
//                JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên", "Xác nhận", JOptionPane.DEFAULT_OPTION);
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên", "Xác nhận", JOptionPane.DEFAULT_OPTION);
//        }
    }//GEN-LAST:event_btn_locActionPerformed

    public Object[] initObject(NhanVien nv) {
        Object obj[] = new Object[6];
        obj[0] = nv.getMaNhanVien();
        obj[1] = nv.getTenNhanVien();
        obj[2] = nv.getSdt();
        obj[3] = nv.getEmail();
        obj[4] = nv.getDiaChi();
        obj[5] = nv.getCccd();
        return obj;
    }
    private void jcb_vaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_vaiTroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_vaiTroActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (checkData()) {
            String maNV = xuLyMaNV();
            String tenNhanVien = jtf_tenNhanVien.getText();
            String email = jtf_emil.getText();
            String diaChi = jtf_diaChi.getText();
            String sdt = jtf_sdt.getText();
            String cccd = jtf_cccd.getText();
            boolean trangThai = true;
            if (rdb_nghiViec.isSelected()) {
                trangThai = false;
            }
            LocalDate nvl = ConvertDate.convert(jDate_ngayVaoLam.getDate());
            NhanVien nv = new NhanVien(maNV, tenNhanVien, email, sdt, diaChi, cccd, trangThai, nvl);
            Object obj[] = new Object[6];
            obj[0] = nv.getMaNhanVien();
            obj[1] = nv.getTenNhanVien();
            obj[2] = nv.getSdt();
            obj[3] = nv.getEmail();
            obj[4] = nv.getDiaChi();
            obj[5] = nv.getCccd();
            if (nv_Dao.create(nv)) {
                JOptionPane.showConfirmDialog(this, "Thêm thành công", "Xác nhân", JOptionPane.DEFAULT_OPTION);
                tableModel.addRow(obj);
            }

        }


    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTrangActionPerformed
        jtf_maNhanVien.setText("");
        jtf_tenNhanVien.setText("");
        jtf_cccd.setText("");
        jtf_sdt.setText("");
        jtf_emil.setText("");
        jtf_diaChi.setText("");
        buttonGroup1.clearSelection();


    }//GEN-LAST:event_btn_xoaTrangActionPerformed

    private void jtf_timTheoTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_timTheoTenKeyTyped
        tableModel.setRowCount(0);

        List<NhanVien> danhSachNhanVien = nv_Dao.timKiemTheoTen(jtf_timTheoTen.getText());

        for (NhanVien nv : danhSachNhanVien) {
            Object obj[] = initObject(nv);
            tableModel.addRow(obj);
        }
    }//GEN-LAST:event_jtf_timTheoTenKeyTyped

    private void jtf_timTheoMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_timTheoMaKeyTyped
        tableModel.setRowCount(0);

        List<NhanVien> danhSachNhanVien = nv_Dao.timKiemTheoMa(jtf_timTheoMa.getText());

        for (NhanVien nv : danhSachNhanVien) {
            Object obj[] = initObject(nv);
            tableModel.addRow(obj);
        }
    }//GEN-LAST:event_jtf_timTheoMaKeyTyped
    public String xuLyMaNV() {
        //luu nhan vien tam
        ArrayList<NhanVien> listTmp = nv_Dao.getAllNhanVien();
        // luu ma so da qua xu ly
        TreeSet<Integer> listMaNV = new TreeSet();
        for (NhanVien nv : listTmp) {
            listMaNV.add(Integer.valueOf((nv.getMaNhanVien()).substring(8)));
        }
        int size = listMaNV.getLast() + 1;
        System.out.println(size);
        LocalDate ngayVaoLam = LocalDate.now();
        String maNV = "NV" + ngayVaoLam.getDayOfMonth() + "" + ngayVaoLam.getMonthValue() + "" + (ngayVaoLam.getYear() + "").substring(2);
        maNV += String.format("%03d", size);
        return maNV;
    }

    //check regex
    public boolean checkData() {
        String maNV = xuLyMaNV();
        String tenNhanVien = jtf_tenNhanVien.getText();
        String email = jtf_emil.getText();
        String diaChi = jtf_diaChi.getText();
        String sdt = jtf_sdt.getText();
        String cccd = jtf_cccd.getText();
        boolean trangThai = true;
        if (rdb_nghiViec.isSelected()) {
            trangThai = false;
        }
        String regexTenNV = "([A-Z]{1}[a-z]*\\s*)+([A-Z]{1}[a-z]*)*";
        String regexEmailNV = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        String regexSDT = "(84|0[3|5|7|8|9])+([0-9]{8})";
        if (tenNhanVien.equalsIgnoreCase("") || !tenNhanVien.matches(regexTenNV)) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống và phải được viết hoa đầu kí tự", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            jtf_tenNhanVien.requestFocus();
            return false;
        } else if (email.equals("") || !email.matches(regexEmailNV)) {
            JOptionPane.showMessageDialog(this, "Email không được để trống và điền đúng định dạng", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            jtf_emil.requestFocus();
            return false;

        } else if (sdt.equals("") || !sdt.matches(regexSDT)) {
            JOptionPane.showMessageDialog(this, "SDT không được để trống và điền đúng định dạng của số điện thoại Việt Nam", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            jtf_sdt.requestFocus();
            return false;

        } else if (cccd.equals("") || cccd.length() != 12) {
            JOptionPane.showMessageDialog(this, "cccd không được để trống và phải đúng 12 chữ số", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            jtf_cccd.requestFocus();
            return false;

        } else if (!rdb_dangLamViec.isSelected() && !rdb_nghiViec.isSelected()) {
            JOptionPane.showMessageDialog(this, "Không được để trống trạng thái của nhân viên", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (!ConvertDate.convert(jDate_ngayVaoLam.getDate()).isBefore(LocalDate.now())) {
            JOptionPane.showMessageDialog(this, "Ngày vào làm phải trước ngày hiện tại", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            return false;

        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_loc;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoaTrang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDate_ngayVaoLam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_trangThai;
    private javax.swing.JComboBox<String> jcb_vaiTro;
    private javax.swing.JTextField jtf_cccd;
    private javax.swing.JTextField jtf_diaChi;
    private javax.swing.JTextField jtf_emil;
    private javax.swing.JTextField jtf_maNhanVien;
    private javax.swing.JTextField jtf_sdt;
    private javax.swing.JTextField jtf_tenNhanVien;
    private javax.swing.JTextField jtf_timTheoMa;
    private javax.swing.JTextField jtf_timTheoTen;
    private javax.swing.JRadioButton rdb_dangLamViec;
    private javax.swing.JRadioButton rdb_nghiViec;
    private javax.swing.JTable tableNV;
    // End of variables declaration//GEN-END:variables
}
