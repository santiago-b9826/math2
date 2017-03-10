package Controlador.Torre;

import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public interface ControladorT {

    public boolean validarNumero(JTextField unidades, JTextField decenas, JTextField centenas, JTextField numero);
    public String cifrasALetras(int a);
    int random(int i);
}
