package Controlador;

import Modelo.ModeloTorre;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public interface ControladorTorre {

    public ModeloTorre getTorre();

    public boolean validarNumero(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas, String numeroCorrecto);

    public String cifrasALetras(int a);

    public void siguienteNumeroAleatorio();
}
