package Vista;

/**
 *
 * @author Santiago Bedoya Betancur.
 * @author Angelica Arroyave Mendoza.
 * @author Juan Pablo Romero Laverde.
 */
public class VistaSeleccionarTorre extends javax.swing.JFrame {

    public VistaSeleccionarTorre() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDosCifras = new javax.swing.JButton();
        btnTresCifras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(548, 280));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDosCifras.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnDosCifras.setForeground(new java.awt.Color(0, 0, 0));
        btnDosCifras.setText("Dos Cifras");
        btnDosCifras.setBorderPainted(false);
        btnDosCifras.setContentAreaFilled(false);
        btnDosCifras.setOpaque(false);
        btnDosCifras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosCifrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnDosCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 120, 70));

        btnTresCifras.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnTresCifras.setForeground(new java.awt.Color(0, 0, 0));
        btnTresCifras.setText("Tres Cifras");
        btnTresCifras.setBorderPainted(false);
        btnTresCifras.setContentAreaFilled(false);
        btnTresCifras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresCifrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnTresCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/a.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(220, 110));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 220, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/a.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondP.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(548, 280));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 548, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDosCifrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosCifrasActionPerformed
        NuevaVistaTorre(2);
    }//GEN-LAST:event_btnDosCifrasActionPerformed

    private void btnTresCifrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresCifrasActionPerformed
        NuevaVistaTorre(3);
    }//GEN-LAST:event_btnTresCifrasActionPerformed

    public void NuevaVistaTorre(int CantidadDeCifras) {
        VistaTorre NuevaTorre = new VistaTorre(CantidadDeCifras);
        this.dispose();
        NuevaTorre.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(VistaSeleccionarTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSeleccionarTorre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDosCifras;
    private javax.swing.JButton btnTresCifras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
