package Controlador.Torre;

import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorTorreDosCifras implements ControladorTorre {

    int numeroActual;
    int str = 0;
    int num = 0;
    String[] n = new String[2];

    public int getNumeroActual() {
        return numeroActual;
    }

    public void setNumeroActual(int numeroActual) {
        this.numeroActual = numeroActual;
    }

    public String[] getN() {
        return n;
    }

    public void setN(String[] n) {
        this.n = n;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int s) {
        this.str = s;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     *
     * @param unidades
     * @param decenas
     * @param centenas
     * @param numero
     * @return
     */
    @Override
    public boolean validarNumero(JTextField unidades, JTextField decenas, JTextField centenas, String numero) {
        boolean u;
        boolean d;
        u = unidades.getText().equals(numero.substring(1, 2));
        d = decenas.getText().equals(numero.substring(0, 1));
        return (u && d);
    }

    public String[] decenas() {
        String[] decenas = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieci", "Veinte",
            "Veinti", "Treinta", "Cuarenta", "Ciencuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
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
        aux = current().nextInt(10, 99 + 1);
        return (int) (aux);
    }

    public void aleatorio() {
        String[] t = new String[2];
        setNumeroActual(random());
        t[0] = Integer.toString(getNumeroActual());
        if (decision()) {
            t[1] = cifrasALetras(getNumeroActual());
        } else {
            t[1] = t[0];
        }
        setN(t);
    }

    public boolean decision() {
        boolean d = true;
        if (num == 5) {
            return true;
        }
        if (str == 5) {
            return false;
        }
        if (current().nextInt(0, 1 + 1) == 0) {
            d = false;
            setNum(getNum() + 1);
        } else {
            setStr(getStr() + 1);
        }
        return d;
    }

}
