/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



/**
 *
 * @author ADMIN
 */
public class frm_ThuePhong extends javax.swing.JFrame {

    
    public static frm_ThuePhong form;

    public frm_ThuePhong() {
       
//System.out.println(java.time.LocalTime.now());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_TenKH = new javax.swing.JLabel();
        cbb_KhachHang = new javax.swing.JComboBox<>();
        btn_ThemKH = new javax.swing.JButton();
        lbl_Phong = new javax.swing.JLabel();
        lbl2_Phong = new javax.swing.JLabel();
        lbl_NgayThue = new javax.swing.JLabel();
        txt_NgayThue = new javax.swing.JTextField();
        lbl_SoNguoi = new javax.swing.JLabel();
        txt_SoNguoi = new javax.swing.JTextField();
        btn_DichVu = new javax.swing.JButton();
        lbl_GiaTheoGio = new javax.swing.JLabel();
        lbl2_GiaTheoGio = new javax.swing.JLabel();
        lbl_GiaNgay = new javax.swing.JLabel();
        lbl2_GiaNgay = new javax.swing.JLabel();
        lbl_NgayRaDuKien = new javax.swing.JLabel();
        rab_Ngay = new javax.swing.JRadioButton();
        rab_Gio = new javax.swing.JRadioButton();
        txt_NgayRa = new org.netbeans.modules.form.InvalidComponent();
        btn_Tru = new javax.swing.JButton();
        btn_Cong = new javax.swing.JButton();
        lbl_TienCoc = new javax.swing.JLabel();
        txt_TienCoc = new javax.swing.JTextField();
        lbl_vnd = new javax.swing.JLabel();
        btn_Thue = new javax.swing.JButton();
        btn_DatTruoc = new javax.swing.JButton();
        lbl_ThuePhong = new javax.swing.JLabel();
        lbl_Nen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lbl_TenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TenKH.setText("Tên khách hàng");
        getContentPane().add(lbl_TenKH);
        lbl_TenKH.setBounds(54, 153, 99, 17);

        cbb_KhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbb_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_KhachHangActionPerformed(evt);
            }
        });
        getContentPane().add(cbb_KhachHang);
        cbb_KhachHang.setBounds(163, 143, 267, 40);

        btn_ThemKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Icon_Cong.png"))); // NOI18N
        btn_ThemKH.setText("Thêm mới");
        btn_ThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemKHActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ThemKH);
        btn_ThemKH.setBounds(436, 142, 123, 39);

        lbl_Phong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Phong.setText("Phòng");
        getContentPane().add(lbl_Phong);
        lbl_Phong.setBounds(113, 207, 40, 17);

        lbl2_Phong.setBackground(new java.awt.Color(153, 255, 153));
        lbl2_Phong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2_Phong.setOpaque(true);
        getContentPane().add(lbl2_Phong);
        lbl2_Phong.setBounds(163, 199, 91, 25);

        lbl_NgayThue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NgayThue.setText("Ngày thuê");
        getContentPane().add(lbl_NgayThue);
        lbl_NgayThue.setBounds(89, 350, 64, 17);

        txt_NgayThue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_NgayThue.setFocusable(false);
        getContentPane().add(txt_NgayThue);
        txt_NgayThue.setBounds(163, 340, 267, 30);

        lbl_SoNguoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_SoNguoi.setText("Số người");
        getContentPane().add(lbl_SoNguoi);
        lbl_SoNguoi.setBounds(98, 429, 55, 17);

        txt_SoNguoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_SoNguoi.setText("1");
        txt_SoNguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoNguoiActionPerformed(evt);
            }
        });
        txt_SoNguoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SoNguoiKeyReleased(evt);
            }
        });
        getContentPane().add(txt_SoNguoi);
        txt_SoNguoi.setBounds(163, 426, 89, 23);

        btn_DichVu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_DichVu.setText("Dịch vụ");
        btn_DichVu.setEnabled(false);
        btn_DichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DichVuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DichVu);
        btn_DichVu.setBounds(351, 510, 79, 25);

        lbl_GiaTheoGio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_GiaTheoGio.setText("Giá theo giờ");
        getContentPane().add(lbl_GiaTheoGio);
        lbl_GiaTheoGio.setBounds(81, 249, 72, 17);

        lbl2_GiaTheoGio.setBackground(new java.awt.Color(255, 255, 255));
        lbl2_GiaTheoGio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2_GiaTheoGio.setOpaque(true);
        getContentPane().add(lbl2_GiaTheoGio);
        lbl2_GiaTheoGio.setBounds(163, 249, 91, 21);

        lbl_GiaNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_GiaNgay.setText("Giá ngày");
        getContentPane().add(lbl_GiaNgay);
        lbl_GiaNgay.setBounds(100, 296, 53, 17);

        lbl2_GiaNgay.setBackground(new java.awt.Color(255, 255, 255));
        lbl2_GiaNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2_GiaNgay.setOpaque(true);
        getContentPane().add(lbl2_GiaNgay);
        lbl2_GiaNgay.setBounds(163, 296, 91, 22);

        lbl_NgayRaDuKien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NgayRaDuKien.setText("Ngày ra dự kiến");
        getContentPane().add(lbl_NgayRaDuKien);
        lbl_NgayRaDuKien.setBounds(56, 391, 97, 17);

        buttonGroup1.add(rab_Ngay);
        rab_Ngay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rab_Ngay.setText("Thuê theo ngày");
        rab_Ngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rab_NgayActionPerformed(evt);
            }
        });
        getContentPane().add(rab_Ngay);
        rab_Ngay.setBounds(272, 297, 123, 25);

        buttonGroup1.add(rab_Gio);
        rab_Gio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rab_Gio.setText("Thuê theo giờ");
        rab_Gio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rab_GioActionPerformed(evt);
            }
        });
        getContentPane().add(rab_Gio);
        rab_Gio.setBounds(272, 242, 111, 25);

        getContentPane().add(txt_NgayRa);
        txt_NgayRa.setBounds(163, 378, 267, 30);

        btn_Tru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Tru.setText("-");
        btn_Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TruActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Tru);
        btn_Tru.setBounds(258, 428, 37, 23);

        btn_Cong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Cong.setText("+");
        btn_Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CongActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cong);
        btn_Cong.setBounds(301, 428, 41, 23);

        lbl_TienCoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TienCoc.setText("Tiền cọc");
        getContentPane().add(lbl_TienCoc);
        lbl_TienCoc.setBounds(102, 472, 51, 17);

        txt_TienCoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_TienCoc.setText("0");
        txt_TienCoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TienCocKeyReleased(evt);
            }
        });
        getContentPane().add(txt_TienCoc);
        txt_TienCoc.setBounds(163, 462, 267, 30);

        lbl_vnd.setText("(VNĐ)");
        getContentPane().add(lbl_vnd);
        lbl_vnd.setBounds(430, 470, 29, 14);

        btn_Thue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Thue.setText("Thuê");
        btn_Thue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Thue);
        btn_Thue.setBounds(230, 660, 97, 39);

        btn_DatTruoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_DatTruoc.setText("Đặt trước");
        btn_DatTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DatTruocActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DatTruoc);
        btn_DatTruoc.setBounds(460, 660, 99, 39);

        lbl_ThuePhong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_ThuePhong.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ThuePhong.setText("THUÊ PHÒNG");
        getContentPane().add(lbl_ThuePhong);
        lbl_ThuePhong.setBounds(210, 10, 170, 29);

        lbl_Nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/1.jpg"))); // NOI18N
        getContentPane().add(lbl_Nen);
        lbl_Nen.setBounds(0, 0, 570, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemKHActionPerformed
       


    }//GEN-LAST:event_btn_ThemKHActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_ThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThueActionPerformed
       

    }//GEN-LAST:event_btn_ThueActionPerformed

    private void rab_GioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rab_GioActionPerformed
       
    }//GEN-LAST:event_rab_GioActionPerformed

    private void rab_NgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rab_NgayActionPerformed
        

        //System.out.println("ngày ra"+c2.getTime());
    }//GEN-LAST:event_rab_NgayActionPerformed

    private void txt_SoNguoiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SoNguoiKeyReleased
              // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoNguoiKeyReleased

    private void btn_TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TruActionPerformed
       
    }//GEN-LAST:event_btn_TruActionPerformed

    private void btn_CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CongActionPerformed
        SoNGuoi(1);
    }//GEN-LAST:event_btn_CongActionPerformed

    private void txt_TienCocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TienCocKeyReleased
      
    }//GEN-LAST:event_txt_TienCocKeyReleased

    private void btn_DatTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DatTruocActionPerformed
        
    }//GEN-LAST:event_btn_DatTruocActionPerformed

    private void btn_DichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DichVuActionPerformed
       
    }//GEN-LAST:event_btn_DichVuActionPerformed

    private void txt_SoNguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoNguoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoNguoiActionPerformed

    private void cbb_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_KhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_KhachHangActionPerformed
    private void SoNGuoi(int giatri) {
       
    }

    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cong;
    private javax.swing.JButton btn_DatTruoc;
    private javax.swing.JButton btn_DichVu;
    private javax.swing.JButton btn_ThemKH;
    private javax.swing.JButton btn_Thue;
    private javax.swing.JButton btn_Tru;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbb_KhachHang;
    private javax.swing.JLabel lbl2_GiaNgay;
    private javax.swing.JLabel lbl2_GiaTheoGio;
    private javax.swing.JLabel lbl2_Phong;
    private javax.swing.JLabel lbl_GiaNgay;
    private javax.swing.JLabel lbl_GiaTheoGio;
    private javax.swing.JLabel lbl_Nen;
    private javax.swing.JLabel lbl_NgayRaDuKien;
    private javax.swing.JLabel lbl_NgayThue;
    private javax.swing.JLabel lbl_Phong;
    private javax.swing.JLabel lbl_SoNguoi;
    private javax.swing.JLabel lbl_TenKH;
    private javax.swing.JLabel lbl_ThuePhong;
    private javax.swing.JLabel lbl_TienCoc;
    private javax.swing.JLabel lbl_vnd;
    private javax.swing.JRadioButton rab_Gio;
    private javax.swing.JRadioButton rab_Ngay;
    private org.netbeans.modules.form.InvalidComponent txt_NgayRa;
    private javax.swing.JTextField txt_NgayThue;
    private javax.swing.JTextField txt_SoNguoi;
    private javax.swing.JTextField txt_TienCoc;
    // End of variables declaration//GEN-END:variables
}
