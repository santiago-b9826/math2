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
public class ControladorTorreTresCifras implements ControladorTorre {

    ModeloTorre Torre = new ModeloTorre();

    /**
     *
     * @return
     */
    @Override
    public ModeloTorre getTorre() {
        return Torre;
    }

    /**
     *
     * @param txtFUnidades
     * @param txtFDecenas
     * @param txtFCentenas
     * @param numeroCorrecto
     * @return
     */
    @Override
    public boolean validarNumero(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas, String numeroCorrecto) {
        boolean unidadesCorrectas;
        boolean decenasCorrectas;
        boolean centenasCorrectas;
        unidadesCorrectas = txtFUnidades.getText().equals(numeroCorrecto.substring(2, 3));
        decenasCorrectas = txtFDecenas.getText().equals(numeroCorrecto.substring(1, 2));
        centenasCorrectas = txtFCentenas.getText().equals(numeroCorrecto.substring(0, 1));
        return (unidadesCorrectas && decenasCorrectas && centenasCorrectas);
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
        int unidades = a % 10;
        int decenas = (a / 10) % 10;
        int centenas = a / 100;
        String numeroEnLetras;
        String[] vectorCentenas = centenas();
        String[] vectorDecenas = decenas();
        String[] vectorUnidades = unidades();

        if (unidades == 0 && decenas == 0) {
            numeroEnLetras = vectorCentenas[centenas];
            return numeroEnLetras + ".";
        }
        numeroEnLetras = vectorCentenas[centenas] + " ";
        if (centenas == 1) {
            numeroEnLetras = vectorCentenas[0] + " ";
        }
        if (decenas == 0) {
            numeroEnLetras += vectorUnidades[unidades];
            return numeroEnLetras + ".";
        }
        if (decenas == 1) {
            if (unidades <= 5) {
                numeroEnLetras += vectorDecenas[unidades];
            } else {
                numeroEnLetras += vectorDecenas[6] + vectorUnidades[unidades];
            }
            return numeroEnLetras + ".";
        }
        if (decenas == 2) {
            if (unidades == 0) {
                numeroEnLetras += vectorDecenas[7];
            } else {
                numeroEnLetras += vectorDecenas[decenas + 6] + vectorUnidades[unidades];
            }
            return numeroEnLetras + ".";
        }
        if (unidades == 0) {
            numeroEnLetras += vectorDecenas[decenas + 6];
        } else {
            numeroEnLetras += vectorDecenas[decenas + 6] + " y " + vectorUnidades[unidades];
        }
        return numeroEnLetras + ".";
    }

    /**
     *
     * @return
     */
    public int numeroAleatorio() {
        double numeroAleatorio;
        int nivelActual = Torre.getNivel();
        int limiteSuperior = 199;
        int limiteInferior = 100;
        if (nivelActual != 0) {
            limiteInferior = 100 * nivelActual;
            limiteSuperior = limiteInferior + 99;
        }
        numeroAleatorio = current().nextInt(limiteInferior, limiteSuperior + 1);
        return (int) (numeroAleatorio);
    }

    /**
     *
     */
    @Override
    public void siguienteNumeroAleatorio() {
        String[] numeros = new String[2];
        Torre.setNumeroActual(numeroAleatorio());
        numeros[0] = Integer.toString(Torre.getNumeroActual());
        if (siguienteNumeroEnLetras()) {
            numeros[1] = cifrasALetras(Torre.getNumeroActual());
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
