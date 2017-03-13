package Controlador;

import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorTorreTresCifras extends ControladorTorre {

    @Override
    public boolean validarNumero(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas, String numeroCorrecto) {
        boolean unidadesCorrectas = txtFUnidades.getText().equals(numeroCorrecto.substring(2, 3));
        boolean decenasCorrectas = txtFDecenas.getText().equals(numeroCorrecto.substring(1, 2));
        boolean centenasCorrectas = txtFCentenas.getText().equals(numeroCorrecto.substring(0, 1));
        return (unidadesCorrectas && decenasCorrectas && centenasCorrectas);
    }

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

    @Override
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

}
