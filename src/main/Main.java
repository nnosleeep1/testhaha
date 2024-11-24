/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.formdev.flatlaf.FlatIntelliJLaf;
import gui.ThongKeThuoc_GUI;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.NhanVien_DAO;
import dao.TaiKhoan_DAO;
import dao.VaiTro_DAO;
import entity.NhanVien;
import entity.TaiKhoan;
import entity.VaiTro;
import gui.Customers_GUI;
import gui.Employees_GUI;
import gui.KetCa;
import gui.LoginForm;
import gui.NhaCungCap_GUI;
import gui.Order_GUI;
import gui.Products_GUI;
import gui.Return_Order_GUI;
import gui.ThongKeDoanhThu;
import gui.ThongKeKhachHang;
import gui.ThongKeThuoc;
import gui.ThongKeThuoc_GUI;
import gui.event.EventMenuSelected;
import gui.event.EventShowPopupMenu;
import gui.main.MainForm;
import gui.menu.Header;
import gui.menu.Menu;
import gui.swing.MenuItem;
import gui.swing.PopupMenu;
import java.awt.Component;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import raven.toast.Notifications;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {

    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    private LoginForm loginForm;
    private TaiKhoan tk;
    private VaiTro vaiTro;
    private NhanVien nhanVien;

    public Main() throws SQLException {
        initComponents();
        loginForm = new LoginForm();
        

        setSize(new Dimension(1350, 768));
        setTitle("Pharmahome");
        setContentPane(loginForm);
        // Thêm listener cho sự kiện đăng nhập
        loginForm.addLoginListener(new LoginForm.LoginListener() {
            @Override
            public void onLoginSuccess(TaiKhoan tk) {
                // Đăng nhập thành công, hiển thị menu và main
                Main.this.tk = tk;
                init();
                setContentPane(bg);
                revalidate();
                repaint();
            }

            @Override
            public void onLoginFailure() {
                // Xử lý khi đăng nhập thất bại (nếu cần)
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Đăng nhập thất bại");
            }
        });
    }

    public void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu();
        initHeaderLabel();
        header = new Header(nhanVien.getTenNhanVien(),vaiTro.getTen(),this);
        main = new MainForm();

        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu index: " + menuIndex + "Sub Index: " + subMenuIndex);
                if (menuIndex == 0) {
                    try {
                        main.showForm(new Products_GUI());
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (menuIndex == 1) {
                    if (subMenuIndex == 0) {
                        main.showForm(new Order_GUI(tk));
                    } else if (subMenuIndex == 1) {
                        main.showForm(new Return_Order_GUI());

                    }
                } else if (menuIndex == 2) {
                    if (subMenuIndex == 0) {
                        try {
                            ThongKeThuoc thongKeThuocPanel = new ThongKeThuoc();
                            main.showForm(thongKeThuocPanel);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                            // Show an error message to the user
                            JOptionPane.showMessageDialog(Main.this, "Error loading ThongKeThuoc_GUI: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (subMenuIndex == 1) {
                        main.showForm(new ThongKeKhachHang());
                    } else if (subMenuIndex == 2) {
                        try {
                            main.showForm(new ThongKeDoanhThu());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (subMenuIndex == 3) {
                        main.showForm(new KetCa());
                    }
                } else if (menuIndex == 3) {
                    main.showForm(new Customers_GUI());

                } else if (menuIndex == 4) {
                    try {
                        main.showForm(new Employees_GUI());
                    } catch (SQLException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (menuIndex == 5) {
                    main.showForm(new NhaCungCap_GUI());
                }
            }
        });
        menu.addEventShowPopup(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main.this.getX() + 52;
                int y = Main.this.getY() + com.getY() + 156;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        bg.add(menu, "w 230!, spany 2");
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 50 + (190 * (1f - fraction));

                } else {
                    width = 50 + (190 * fraction);

                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);

        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.isShowMenu()) {
                    //ẩn menu sau khi thu gọn
                    menu.hideAllMenu();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initHeaderLabel(){
        vaiTro = new VaiTro_DAO().getVaiTro(tk.getVaiTro().getMaVaiTro());
        nhanVien = new NhanVien_DAO().getNhanVien(tk.getNhanVien().getMaNhanVien());
    }
    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splashscreen.SplashScreen(null,true).setVisible(true);
                try {
                    new Main().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
