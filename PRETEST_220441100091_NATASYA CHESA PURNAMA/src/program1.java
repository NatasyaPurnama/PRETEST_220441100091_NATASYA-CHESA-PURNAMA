
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Natasya
 */
public class program1 extends javax.swing.JFrame {

    /**
     * Creates new form program1
     */
    public program1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAtas = new javax.swing.JPanel();
        Nama = new javax.swing.JLabel();
        uNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pBawah = new javax.swing.JPanel();
        bSimpan = new javax.swing.JButton();
        Nilai = new javax.swing.JLabel();
        uNilai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        Nama.setText("Nama");

        uNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNamaActionPerformed(evt);
            }
        });

        jLabel1.setText("PRETEST");

        javax.swing.GroupLayout pAtasLayout = new javax.swing.GroupLayout(pAtas);
        pAtas.setLayout(pAtasLayout);
        pAtasLayout.setHorizontalGroup(
            pAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uNama, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pAtasLayout.setVerticalGroup(
            pAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(pAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(uNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(pAtas);

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        Nilai.setText("Nilai");

        javax.swing.GroupLayout pBawahLayout = new javax.swing.GroupLayout(pBawah);
        pBawah.setLayout(pBawahLayout);
        pBawahLayout.setHorizontalGroup(
            pBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBawahLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSimpan)
                    .addGroup(pBawahLayout.createSequentialGroup()
                        .addComponent(Nilai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(uNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pBawahLayout.setVerticalGroup(
            pBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBawahLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nilai)
                    .addComponent(uNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(bSimpan)
                .addContainerGap())
        );

        getContentPane().add(pBawah);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNamaActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        String nama = uNama.getText();
        int nilai = Integer.parseInt(uNilai.getText());
        
        JOptionPane.showMessageDialog(null,"Mahasiswa "+ nama + " dengan Nilai "+ nilai+ " telah disimpan.");
        
        if (nama == "" && nilai == 0){
            JOptionPane.showMessageDialog(null,"Silahkan isi form terlebih dahulu");
        }
        
    }//GEN-LAST:event_bSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new program1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Nilai;
    private javax.swing.JButton bSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pAtas;
    private javax.swing.JPanel pBawah;
    private javax.swing.JTextField uNama;
    private javax.swing.JTextField uNilai;
    // End of variables declaration//GEN-END:variables
}
