package Controlador;

import Modelo.ModeloTorre;
import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public abstract class ControladorTorre {

    ModeloTorre Torre = new ModeloTorre();

    public abstract boolean validarNumero(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas, String numeroCorrecto);

    public abstract String cifrasALetras(int a);

    public abstract int numeroAleatorio();

    public ModeloTorre getTorre() {
        return Torre;
    }

    public String[] centenas() {
        String[] centenas = {"ciento", "cien", "doscientos", "trescientos", "cuatrocientos",
            "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
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

    public void siguienteNumeroAleatorio() {
        String[] numeros = new String[2];
        Torre.setNumeroActual(numeroAleatorio());
        numeros[0] = Integer.toString(Torre.getNumeroActual());
        if (siguienteNumeroEnLetras()) {
            numeros[1] = cifrasALetras(Torre.getNumeroActual());
            numeros[1] = numeros[1].substring(0, 1).toUpperCase() + numeros[1].replaceFirst(numeros[1].substring(0, 1), "");
        } else {
            numeros[1] = numeros[0];
        }
        Torre.setNumeros(numeros);
    }

    public boolean siguienteNumeroEnLetras() {
        boolean decision = true;
        if (Torre.getCantidadNumerosEnDigitos() == 5) {
            return true;
        }
        if (Torre.getCantidadNumerosEnLetras() == 5) {
            return false;
        }
        if (current().nextInt(0, 1 + 1) == 0) {
            decision = false;
            Torre.setCantidadNumerosEnDigitos(Torre.getCantidadNumerosEnDigitos() + 1);
        } else {
            Torre.setCantidadNumerosEnLetras(Torre.getCantidadNumerosEnLetras() + 1);
        }
        return decision;
    }
}
