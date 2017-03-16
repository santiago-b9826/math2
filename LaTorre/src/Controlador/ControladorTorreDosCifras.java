package Controlador;

import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorTorreDosCifras extends ControladorTorre {

    @Override
    public boolean validarNumero(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas, String numeroCorrecto) {
        boolean unidadesCorrectas = eliminarCerosSignificativos(txtFUnidades.getText()).equals(numeroCorrecto.substring(1, 2));
        boolean decenasCorrectas = eliminarCerosSignificativos(txtFDecenas.getText()).equals(numeroCorrecto.substring(0, 1));
        return (unidadesCorrectas && decenasCorrectas);

    }

    @Override
    public String cifrasALetras(int a) {
        int unidades = a % 10;
        int decenas = a / 10;
        String numeroEnLetras = "";
        String[] vectorDecenas = decenas();
        String[] vectorUnidades = unidades();

        if (unidades == 0) {
            if (decenas == 1) {
                numeroEnLetras = vectorDecenas[0];
            } else if (decenas == 2) {
                numeroEnLetras = vectorDecenas[7];
            } else {
                numeroEnLetras = vectorDecenas[decenas + 6];
            }
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
            numeroEnLetras = vectorDecenas[decenas + 6] + vectorUnidades[unidades];
            return numeroEnLetras + ".";
        }
        numeroEnLetras = vectorDecenas[decenas + 6] + " y " + vectorUnidades[unidades];
        return numeroEnLetras + ".";
    }

    @Override
    public int numeroAleatorio() {
        double numeroAleatorio;
        int nivelActual = Torre.getNivel();
        int limiteSuperior = 19;
        int limiteInferior = 10;
        if (nivelActual != 0) {
            limiteInferior = 10 * nivelActual;
            limiteSuperior = limiteInferior + 9;
        }
        numeroAleatorio = current().nextInt(limiteInferior, limiteSuperior + 1);
        return (int) (numeroAleatorio);
    }

}
