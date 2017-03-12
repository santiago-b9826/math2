package Modelo;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ModeloTorre {

    protected int nivel;
    protected int numeroActual;
    protected int cantidadNumerosEnLetras;
    protected int cantidadNumerosEnDigitos;
    String[] numeros = new String[2];

    public ModeloTorre() {
        nivel = 0;
        cantidadNumerosEnLetras = 0;
        cantidadNumerosEnDigitos = 0;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNumeroActual() {
        return numeroActual;
    }

    public void setNumeroActual(int numeroActual) {
        this.numeroActual = numeroActual;
    }

    public String[] getNumeros() {
        return numeros;
    }

    public void setNumeros(String[] numeros) {
        this.numeros = numeros;
    }

    public int getCantidadNumerosEnLetras() {
        return cantidadNumerosEnLetras;
    }

    public void setCantidadNumerosEnLetras(int s) {
        this.cantidadNumerosEnLetras = s;
    }

    public int getCantidadNumerosEnDigitos() {
        return cantidadNumerosEnDigitos;
    }

    public void setCantidadNumerosEnDigitos(int cantidadNumerosEnDigitos) {
        this.cantidadNumerosEnDigitos = cantidadNumerosEnDigitos;
    }
}
