/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Torre;

import java.util.concurrent.ThreadLocalRandom;
import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JTextField;

/**
 *
 * @author santiago.bedoya5
 */
public class ControladorTorreTresCifras implements ControladorTorre {

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
        boolean c;
        u = unidades.getText().equals(numero.substring(2, 3));
        d = decenas.getText().equals(numero.substring(1, 2));
        c = centenas.getText().equals(numero.substring(0, 1));
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

    /**
     *
     * @param a
     * @return
     */
    @Override
    public String cifrasALetras(int a) {
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

    /**
     *
     * @return
     */
    @Override
    public int random() {
        double aux;
        aux = ThreadLocalRandom.current().nextInt(100, 999 + 1);
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
