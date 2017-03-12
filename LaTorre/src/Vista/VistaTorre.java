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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        nivel1 = new javax.swing.JLabel();
        nivel4 = new javax.swing.JLabel();
        nivel3 = new javax.swing.JLabel();
        nivel2 = new javax.swing.JLabel();
        nivel5 = new javax.swing.JLabel();
        nivel6 = new javax.swing.JLabel();
        nivel7 = new javax.swing.JLabel();
        nivel8 = new javax.swing.JLabel();
        nivel9 = new javax.swing.JLabel();
        nivel10 = new javax.swing.JLabel();
        fondoScroll = new javax.swing.JLabel();
        btnTorre = new javax.swing.JButton();
        txtFCentenas = new javax.swing.JTextField();
        txtFDecenas = new javax.swing.JTextField();
        txtFUnidades = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/1.png"))); // NOI18N
        jPanel1.add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1110, -1, -1));

        nivel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/5.png"))); // NOI18N
        jPanel1.add(nivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 130, 140));

        nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/3.png"))); // NOI18N
        jPanel1.add(nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 860, -1, 140));

        nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/2.png"))); // NOI18N
        jPanel1.add(nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 990, 130, 120));

        nivel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/4.png"))); // NOI18N
        jPanel1.add(nivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 140, 100));

        nivel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/6.png"))); // NOI18N
        jPanel1.add(nivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 160, 140));

        nivel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/8.png"))); // NOI18N
        jPanel1.add(nivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 130, 120));

        nivel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/7.png"))); // NOI18N
        jPanel1.add(nivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 120, 110));

        nivel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/9.png"))); // NOI18N
        jPanel1.add(nivel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, 140));

        nivel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/10.png"))); // NOI18N
        jPanel1.add(nivel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 160));

        fondoScroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fscll.jpg"))); // NOI18N
        jPanel1.add(fondoScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 320, 450));

        btnTorre.setText("jButton1");
        btnTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorreActionPerformed(evt);
            }
        });
        getContentPane().add(btnTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));
        getContentPane().add(txtFCentenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, -1));
        getContentPane().add(txtFDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 70, -1));
        getContentPane().add(txtFUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 70, -1));

        txtNumero.setEnabled(false);
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/F1.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreActionPerformed
        boolean numeroValido = ControladorTorre.validarNumero(txtFUnidades, txtFDecenas, txtFCentenas, Torre.getNumeros()[0]);
        int nivel = Torre.getNivel();
        if (numeroValido && nivel < 9) {
            nuevoNumero(nivel);
        }
        reiniciarTxtF();
    }//GEN-LAST:event_btnTorreActionPerformed
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
    private javax.swing.JButton btnTorre;
    private javax.swing.JLabel fondoScroll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
