/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import DAO.DichVuDAO;
import HELPER.DialogHelper;
import HELPER.ShareHelper;
import MODEL.DichVu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongNVPH
 */
public class DichVuPanel extends javax.swing.JPanel {

    /**
     * Creates new form DichVuPanel
     */
    DichVuDAO dvd = new DichVuDAO();
    int row = -1;

    public DichVuPanel() {
        initComponents();
        init();

    }

    void init() {
        fillTableDichvu();
    }

    void fillTableDichvu() {
        DefaultTableModel dtm = (DefaultTableModel) tblbangdichvu.getModel();
        dtm.setRowCount(0);
        ArrayList<DichVu> list = dvd.selectAll();
        for (DichVu dichVu : list) {
            Object[] data = {dichVu.getMaDichVu(), dichVu.getTenDichVu(), dichVu.getGiaTien()};
            dtm.addRow(data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtmadichvu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttendichvu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtgiatien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbangdichvu = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("DANH SÁCH DỊCH VỤ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã dịch vụ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên dịch vụ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giá tiền");

        tblbangdichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbangdichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangdichvuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbangdichvu);
        if (tblbangdichvu.getColumnModel().getColumnCount() > 0) {
            tblbangdichvu.getColumnModel().getColumn(2).setResizable(false);
        }

        btnthem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Add.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Edit.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnmoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Refresh.png"))); // NOI18N
        btnmoi.setText("Làm mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttendichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtmadichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtgiatien, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnmoi)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmadichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttendichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(36, 36, 36)
                        .addComponent(btnsua)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgiatien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmoi))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void tblbangdichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangdichvuMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.edit();
        }
    }//GEN-LAST:event_tblbangdichvuMouseClicked

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        clearform();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnsuaActionPerformed


    void clearform() {
        txtmadichvu.setText("");
        txttendichvu.setText("");
        txtgiatien.setText("");
    }

    void insert() {
              DichVu dv = this.getForm();
        if (dv == null) {
            return;
        }
        if (!ShareHelper.isManager()) {
            DialogHelper.alert(this, "Bạn không có quyền thêm dịch vụ!");
        } else if (DialogHelper.confirm(this, "Bạn có thực sự muốn thêm dịch vụ này?")) {
            try {
                dvd.insert(dv);
                fillTableDichvu();
                clearform();
                DialogHelper.alert(this, "Thêm thành công");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm thát bại!");
            }
        }
    }

    void update() {
        DichVu dv = this.getForm();
        if (dv == null) {
            return;
        }
        if (!ShareHelper.isManager()) {
            DialogHelper.alert(this, "Bạn không có quyền cập nhật dịch vụ!");
        } else if (DialogHelper.confirm(this, "Bạn có thực sự muốn cập nhật dịch vụ này?")) {
            try {
                dvd.update(dv);
                fillTableDichvu();
                clearform();
                DialogHelper.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thát bại!");
            }
        }

    }

    


    DichVu getForm() {
        DichVu dv = new DichVu();
        if (txtgiatien.getText().equals("")) {
            return null;
        }
        if (txtmadichvu.getText().equals("")) {
            return null;
        }
        if (txttendichvu.getText().equals("")) {
            return null;
        }
        dv.setMaDichVu(txtmadichvu.getText());
        dv.setTenDichVu(txttendichvu.getText());
        dv.setGiaTien(Float.parseFloat(txtgiatien.getText()));
        return dv;
    }

    void setForm(DichVu dv) {
        txtmadichvu.setText(dv.getMaDichVu());
        txttendichvu.setText(dv.getTenDichVu());
        txtgiatien.setText(Float.toString(dv.getGiaTien()));

    }

    void edit() {
        DefaultTableModel dtm = (DefaultTableModel) tblbangdichvu.getModel();
        row = tblbangdichvu.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtmadichvu.setText(dtm.getValueAt(row, 0).toString());
        txttendichvu.setText(dtm.getValueAt(row, 1).toString());
        txtgiatien.setText(dtm.getValueAt(row, 2).toString());
        
        this.updateStatus();
    }

    void updateStatus() {
         boolean add = (this.row < 0);
        boolean edit = this.row >= 0;
        boolean first = this.row == 0;
        boolean last = this.row == tblbangdichvu.getRowCount() - 1;
        btnthem.setEnabled(!edit && add);
        btnsua.setEnabled(edit);
 
        btnmoi.setEnabled(edit);


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbangdichvu;
    private javax.swing.JTextField txtgiatien;
    private javax.swing.JTextField txtmadichvu;
    private javax.swing.JTextField txttendichvu;
    // End of variables declaration//GEN-END:variables
}
