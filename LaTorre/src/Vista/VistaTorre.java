package Vista;

import Controlador.ControladorTorre;
import Controlador.ControladorTorreDosCifras;
import Controlador.ControladorTorreTresCifras;
import Modelo.ModeloTorre;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
//        float escalar = 0;
//        int ancho = (int) (Toolkit.getDefaultToolkit().getScreenSize().width * escalar);
//        int alto = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * escalar);
//        this.setSize(ancho, alto);
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
        numeroNivel10 = new javax.swing.JLabel();
        numeroNivel9 = new javax.swing.JLabel();
        numeroNivel8 = new javax.swing.JLabel();
        numeroNivel7 = new javax.swing.JLabel();
        numeroNivel6 = new javax.swing.JLabel();
        numeroNivel5 = new javax.swing.JLabel();
        numeroNivel4 = new javax.swing.JLabel();
        numeroNivel3 = new javax.swing.JLabel();
        numeroNivel2 = new javax.swing.JLabel();
        numeroNivel1 = new javax.swing.JLabel();
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
        nivel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        getContentPane().add(btnVerificarNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));
        getContentPane().add(txtFCentenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 70, -1));
        getContentPane().add(txtFDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 70, -1));
        getContentPane().add(txtFUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 70, -1));

        txtNumero.setEnabled(false);
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 270, -1));

        btnSalir.setText("Salir del juego");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 150, -1));

        numeroNivel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel10.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 20));

        numeroNivel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel9.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 70, 20));

        numeroNivel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel8.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 70, 20));

        numeroNivel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel7.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 70, 20));

        numeroNivel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel6.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 70, 20));

        numeroNivel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel5.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 70, 20));

        numeroNivel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel4.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 70, 20));

        numeroNivel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel3.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 70, 20));

        numeroNivel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel2.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 70, 20));

        numeroNivel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroNivel1.setForeground(new java.awt.Color(10, 255, 92));
        numeroNivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numeroNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 70, 20));

        nivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel1O.png"))); // NOI18N
        getContentPane().add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 210, -1));

        nivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel2O.png"))); // NOI18N
        getContentPane().add(nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 500, 200, 60));

        nivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel3O.png"))); // NOI18N
        getContentPane().add(nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 460, 200, -1));

        nivel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel4O.png"))); // NOI18N
        getContentPane().add(nivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 410, 200, -1));

        nivel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel5O.png"))); // NOI18N
        getContentPane().add(nivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 360, 200, -1));

        nivel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel6O.png"))); // NOI18N
        getContentPane().add(nivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 320, 200, -1));

        nivel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel7O.png"))); // NOI18N
        getContentPane().add(nivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 270, 200, -1));

        nivel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel8O.png"))); // NOI18N
        getContentPane().add(nivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 220, 200, -1));

        nivel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel9O.png"))); // NOI18N
        getContentPane().add(nivel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 180, 200, 60));

        nivel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel10O.png"))); // NOI18N
        getContentPane().add(nivel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, 60));

        nivel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nivel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nivel11O.png"))); // NOI18N
        getContentPane().add(nivel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 60));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarNumeroActionPerformed
        boolean numeroValido = ControladorTorre.validarNumero(txtFUnidades, txtFDecenas, txtFCentenas, Integer.toString(Torre.getNumeroActual()));
        int nivel = Torre.getNivel();
        if (numeroValido && nivel == 9) {
            nivel11.setVisible(true);
            mostrarNumero(Torre.getNumeroActual(), 9);
            txtNumero.setText("FELICIDADES");
        }
        if (numeroValido && nivel < 9) {
            nuevoNumero(nivel);
        }
        reiniciarTxtF(txtFUnidades, txtFDecenas, txtFCentenas);
    }//GEN-LAST:event_btnVerificarNumeroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    public JLabel label(int i) {
        return nivelesTorre()[i];
    }

    public JLabel labelN(int i) {
        return numeroNiveles()[i];
    }

    private void nuevoNumero() {
        ControladorTorre.siguienteNumeroAleatorio();
        txtNumero.setText(Torre.getNumeroString());
    }

    private void nuevoNumero(int nivel) {
        label(nivel).setVisible(true);
        Torre.setNivel(nivel + 1);
        mostrarNumero(Torre.getNumeroActual(), nivel);
        nuevoNumero();
    }

    private void mostrarNumero(int numero, int nivel) {
        labelN(nivel).setText(Integer.toString(numero));
    }

    private void inicializarLabels() {
        JLabel[] vectorLabels = nivelesTorre();
        for (int k = 0; k < 10; k++) {
            vectorLabels[k].setVisible(false);
        }
    }

    public void reiniciarTxtF(JTextField txtFUnidades, JTextField txtFDecenas,JTextField txtFCentenas ) {
        txtFUnidades.setText("");
        txtFDecenas.setText("");
        txtFCentenas.setText("");
    }

    public JLabel[] nivelesTorre() {
        JLabel[] vectorLabels = new JLabel[10];
        vectorLabels[0] = nivel2;
        vectorLabels[1] = nivel3;
        vectorLabels[2] = nivel4;
        vectorLabels[3] = nivel5;
        vectorLabels[4] = nivel6;
        vectorLabels[5] = nivel7;
        vectorLabels[6] = nivel8;
        vectorLabels[7] = nivel9;
        vectorLabels[8] = nivel10;
        vectorLabels[9] = nivel11;
        return vectorLabels;
    }

    public JLabel[] numeroNiveles() {
        JLabel[] vectorLabels = new JLabel[10];
        vectorLabels[0] = numeroNivel1;
        vectorLabels[1] = numeroNivel2;
        vectorLabels[2] = numeroNivel3;
        vectorLabels[3] = numeroNivel4;
        vectorLabels[4] = numeroNivel5;
        vectorLabels[5] = numeroNivel6;
        vectorLabels[6] = numeroNivel7;
        vectorLabels[7] = numeroNivel8;
        vectorLabels[8] = numeroNivel9;
        vectorLabels[9] = numeroNivel10;
        return vectorLabels;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificarNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nivel1;
    private javax.swing.JLabel nivel10;
    private javax.swing.JLabel nivel11;
    private javax.swing.JLabel nivel2;
    private javax.swing.JLabel nivel3;
    private javax.swing.JLabel nivel4;
    private javax.swing.JLabel nivel5;
    private javax.swing.JLabel nivel6;
    private javax.swing.JLabel nivel7;
    private javax.swing.JLabel nivel8;
    private javax.swing.JLabel nivel9;
    private javax.swing.JLabel numeroNivel1;
    private javax.swing.JLabel numeroNivel10;
    private javax.swing.JLabel numeroNivel2;
    private javax.swing.JLabel numeroNivel3;
    private javax.swing.JLabel numeroNivel4;
    private javax.swing.JLabel numeroNivel5;
    private javax.swing.JLabel numeroNivel6;
    private javax.swing.JLabel numeroNivel7;
    private javax.swing.JLabel numeroNivel8;
    private javax.swing.JLabel numeroNivel9;
    private javax.swing.JTextField txtFCentenas;
    private javax.swing.JTextField txtFDecenas;
    private javax.swing.JTextField txtFUnidades;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
