package Controlador.Torre;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JTextField;

/**
 *
 * @author santiago.bedoya5
 */
public class ControladorTorre {

    public boolean validarNumero(JTextField unidades, JTextField decenas, JTextField centenas, JTextField numero, int i) {
        boolean u;
        boolean d;
        boolean c;
        if (i == 3) {
            u = unidades.getText().equals(numero.getText().substring(2, 3));
            d = decenas.getText().equals(numero.getText().substring(1, 2));
            c = centenas.getText().equals(numero.getText().substring(0, 1));
            return (u && d && c);
        }
        u = unidades.getText().equals(numero.getText().substring(1, 2));
        d = decenas.getText().equals(numero.getText().substring(0, 1));
        c = centenas.getText().equals("0");
        return (u && d && c);
    }

    public String[] centenas() {
        String[] centenas = {"Ciento", "Cien", "Doscientos", "Trescientos", "Cuatrocientos",
            "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};
        return centenas;
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

    public String aLetrasTresCifras(int a) {
        int u = a % 10;
        int d = (a / 10) % 10;
        int c = a / 100;
        String numeroLetra;
        String[] centenas = centenas();
        String[] decenas = decenas();
        String[] unidades = unidades();

        if (u == 0 && d == 0) {
            numeroLetra = centenas[c];
            return numeroLetra + ".";
        }
        numeroLetra = centenas[c] + " ";
        if (c == 1) {
            numeroLetra = centenas[0] + " ";
        }
        if (d == 0) {
            numeroLetra += unidades[u];
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
            if (u == 0) {
                numeroLetra += decenas[7];
            } else {
                numeroLetra += decenas[d + 6] + unidades[u];
            }
            return numeroLetra + ".";
        }
        if (u == 0) {
            numeroLetra += decenas[d + 6];
        } else {
            numeroLetra += decenas[d + 6] + " y " + unidades[u];
        }
        return numeroLetra + ".";
    }

        public int random(int i) {
        double aux;
        if (i == 2) {
            aux = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            return (int) (aux);
        }
        aux = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        return (int) (aux);

    } 

}
