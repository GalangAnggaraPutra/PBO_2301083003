/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package  Pratikum_08_06_2024;

import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Galang Anggara Putra
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    BukuController controller;
    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.tampil();
        controller.clearForm();
    }

    public JTable getTblBuku() {
        return tblBuku;
    }
    
    public JTextField getTxtJudul() {
        return txtJudul;
    }

    public JTextField getTxtKodeBuku() {
        return txtKodeBuku;
    }

    public JTextField getTxtPenerbit() {
        return txtPenerbit;
    }

    public JTextField getTxtPengarang() {
        return txtPengarang;
    }

    public JTextField getTxtTahunTerbit() {
        return txtTahunTerbit;
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
        txtKodeBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAlamat1 = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTahunTerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 90, 24);

        txtKodeBuku.setText("jTextField1");
        txtKodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtKodeBuku);
        txtKodeBuku.setBounds(120, 20, 180, 22);

        jLabel2.setText("Judul");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 90, 20);

        txtJudul.setText("jTextField2");
        getContentPane().add(txtJudul);
        txtJudul.setBounds(120, 50, 180, 22);

        jLabel3.setText("Pengarang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 80, 80, 20);

        txtPengarang.setText("jTextField3");
        getContentPane().add(txtPengarang);
        txtPengarang.setBounds(120, 80, 180, 22);

        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 80, 20);

        txtAlamat1.setText("jTextField3");
        getContentPane().add(txtAlamat1);
        txtAlamat1.setBounds(120, 80, 180, 22);

        txtPenerbit.setText("jTextField1");
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(120, 110, 180, 22);

        jLabel5.setText("Tahun Terbit");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 140, 70, 20);

        txtTahunTerbit.setText("jTextField2");
        getContentPane().add(txtTahunTerbit);
        txtTahunTerbit.setBounds(120, 140, 180, 22);

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Buku", "Judul", "Pengarang", "Penerbit", "Tahun Terbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);
        if (tblBuku.getColumnModel().getColumnCount() > 0) {
            tblBuku.getColumnModel().getColumn(0).setHeaderValue("Kode Buku");
            tblBuku.getColumnModel().getColumn(1).setHeaderValue("Judul");
            tblBuku.getColumnModel().getColumn(2).setHeaderValue("Pengarang");
            tblBuku.getColumnModel().getColumn(3).setHeaderValue("Penerbit");
            tblBuku.getColumnModel().getColumn(4).setHeaderValue("Tahun Terbit");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 460, 280);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(10, 170, 60, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(80, 170, 70, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(160, 170, 70, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(240, 170, 70, 23);

        setSize(new java.awt.Dimension(474, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        controller.saveBuku();
        controller.tampil();
        controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.updateBuku();
        controller.tampil();
        controller.clearForm();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.deleteBuku();
        controller.tampil();
        controller.clearForm();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtKodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeBukuActionPerformed

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        controller.getBuku();        // TODO add your handling code here:
    }//GEN-LAST:event_tblBukuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtAlamat1;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
