package Controlador.Torre;

import javax.swing.JTextField;

/**
 *
 * @author santiago.bedoya5
 */
public class ControladorTorre {

    public boolean validarNumero(JTextField unidades, JTextField decenas, JTextField centenas, JTextField numero) {
        boolean u = unidades.getText().equals(numero.getText().substring(2, 3));
        boolean d = decenas.getText().equals(numero.getText().substring(1, 2));
        boolean c = centenas.getText().equals(numero.getText().substring(0, 1));
        return (u && d && c);
    }

}
