package Controlador.Torre;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorTorreDosCifras implements ControladorTorre {

    /**
     *
     * @param unidades
     * @param decenas
     * @param centenas
     * @param numero
     * @return
     */
    @Override
    public boolean validarNumero(JTextField unidades, JTextField decenas, JTextField centenas, JTextField numero) {
        boolean u;
        boolean d;
        boolean c;
        u = unidades.getText().equals(numero.getText().substring(1, 2));
        d = decenas.getText().equals(numero.getText().substring(0, 1));
        c = centenas.getText().equals("0");
        return (u && d && c);
    }

    public String[] decenas() {
        String[] decenas = {"diez", "once", "doce", "trece", "catorce", "quince", "dieci", "veinte",
            "veinti", "treinta", "cuarenta", "ciencuenta", "sesenta", "setenta", "ochenta", "noventa"};
        return decenas;
    }

    public String[] unidades() {
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        return unidades;
    }

    /**
     *
     * @param a
     * @return
     */
    @Override
    public String cifrasALetras(int a) {
        int u = a % 10;
        int d = a / 10;
        String numeroLetra = "";
        String[] decenas = decenas();
        String[] unidades = unidades();

        if (u == 0) {
            if (d == 1) {
                numeroLetra = decenas[0];
            } else if (d == 2) {
                numeroLetra = decenas[7];
            } else {
                numeroLetra = decenas[d + 6];
            }
            return numeroLetra + ".";
        }

        if (d == 1) {
            if (u <= 5) {
                numeroLetra += decenas[u];
            } else {
                numeroLetra += decenas[6] + unidades[u];
            }
            return numeroLetra + ".";
        }
        if (d == 2) {
            numeroLetra = decenas[d + 6] + unidades[u];
            return numeroLetra + ".";
        }
        numeroLetra = decenas[d + 6] + " y " + unidades[u];
        return numeroLetra + ".";
    }

    /**
     *
     * @return
     */
    @Override
    public int random() {
        double aux;
        aux = ThreadLocalRandom.current().nextInt(10, 99 + 1);
        return (int) (aux);
    }

}
