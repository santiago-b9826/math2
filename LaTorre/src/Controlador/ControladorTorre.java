package Controlador;

import Modelo.Torre;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public interface ControladorTorre {

    public Torre getTorre();

    public boolean validarNumero(JTextField unidades, JTextField decenas, JTextField centenas, String numero);

    public String cifrasALetras(int a);

    int random();

    public void aleatorio();
}
