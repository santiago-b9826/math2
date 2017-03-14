package Vista;

import Controlador.ControladorTorre;
import Controlador.ControladorTorreDosCifras;
import Controlador.ControladorTorreTresCifras;
import Modelo.ModeloTorre;
import javax.swing.JLabel;

/**
 *
 * @author Santiago Bedoya Betancur.
 * @author Angelica Arroyave Mendoza.
 * @author Juan Pablo Romero Laverde.
 */
public class VistaTorre extends javax.swing.JFrame {

    ControladorTorre ControladorTorre;
    ModeloTorre Torre;

    public VistaTorre(int cantidadDeCifras) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        inicializarLabels();
        if (cantidadDeCifras == 2) {
            ControladorTorre = new ControladorTorreDosCifras();
            txtFCentenas.setVisible(false);
        } else {
            ControladorTorre = new ControladorTorreTresCifras();
        }
        Torre = ControladorTorre.getTorre();
        nuevoNumero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerificarNumero = new javax.swing.JButton();
        txtFCentenas = new javax.swing.JTextField();
        txtFDecenas = new javax.swing.JTextField();
        txtFUnidades = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        nivel1 = new javax.swing.JLabel();
        nivel2 = new javax.swing.JLabel();
        nivel3 = new javax.swing.JLabel();
        nivel4 = new javax.swing.JLabel();
        nivel5 = new javax.swing.JLabel();
        nivel6 = new javax.swing.JLabel();
        nivel7 = new javax.swing.JLabel();
        nivel8 = new javax.swing.JLabel();
        nivel9 = new javax.swing.JLabel();
        nivel10 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVerificarNumero.setText("Verificar Número");
        btnVerificarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificarNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));
        getContentPane().add(txtFCentenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, -1));
        getContentPane().add(txtFDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 70, -1));
        getContentPane().add(txtFUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 70, -1));

        txtNumero.setEnabled(false);
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, -1));

        btnSalir.setText("Salir del juego");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, -1));

        nivel1.setText("jLabel1");
        getContentPane().add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 40, -1));

        nivel2.setText("jLabel1");
        getContentPane().add(nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        nivel3.setText("jLabel1");
        getContentPane().add(nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        nivel4.setText("jLabel1");
        getContentPane().add(nivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        nivel5.setText("jLabel1");
        getContentPane().add(nivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        nivel6.setText("jLabel1");
        getContentPane().add(nivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        nivel7.setText("jLabel1");
        getContentPane().add(nivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        nivel8.setText("jLabel1");
        getContentPane().add(nivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        nivel9.setText("jLabel1");
        getContentPane().add(nivel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        nivel10.setText("jLabel1");
        getContentPane().add(nivel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/F1.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarNumeroActionPerformed
        boolean numeroValido = ControladorTorre.validarNumero(txtFUnidades, txtFDecenas, txtFCentenas, Torre.getNumeros()[0]);
        int nivel = Torre.getNivel();
        if (numeroValido && nivel < 9) {
            nuevoNumero(nivel);
        }
        reiniciarTxtF();
    }//GEN-LAST:event_btnVerificarNumeroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    public JLabel label(int i) {
        return labels()[i];
    }

    private void nuevoNumero() {
        ControladorTorre.siguienteNumeroAleatorio();
        txtNumero.setText(Torre.getNumeros()[1]);
    }

    private void nuevoNumero(int nivel) {
        label(nivel).setVisible(true);
        Torre.setNivel(nivel + 1);
        nuevoNumero();
    }

    private void inicializarLabels() {
        JLabel[] vectorLabels = labels();
        for (int k = 0; k < 9; k++) {
            vectorLabels[k].setVisible(false);
        }
    }

    public void reiniciarTxtF() {
        txtFUnidades.setText("");
        txtFDecenas.setText("");
        txtFCentenas.setText("");
    }

    public JLabel[] labels() {
        JLabel[] vectorLabels = new JLabel[9];
        vectorLabels[0] = nivel2;
        vectorLabels[1] = nivel3;
        vectorLabels[2] = nivel4;
        vectorLabels[3] = nivel5;
        vectorLabels[4] = nivel6;
        vectorLabels[5] = nivel7;
        vectorLabels[6] = nivel8;
        vectorLabels[7] = nivel9;
        vectorLabels[8] = nivel10;
        return vectorLabels;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificarNumero;
    private javax.swing.JLabel nivel1;
    private javax.swing.JLabel nivel10;
    private javax.swing.JLabel nivel2;
    private javax.swing.JLabel nivel3;
    private javax.swing.JLabel nivel4;
    private javax.swing.JLabel nivel5;
    private javax.swing.JLabel nivel6;
    private javax.swing.JLabel nivel7;
    private javax.swing.JLabel nivel8;
    private javax.swing.JLabel nivel9;
    private javax.swing.JTextField txtFCentenas;
    private javax.swing.JTextField txtFDecenas;
    private javax.swing.JTextField txtFUnidades;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
