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
    String numeroString;
    protected int cantidadNumerosEnLetras;
    protected int cantidadNumerosEnDigitos;    

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

    public String getNumeroString() {
        return numeroString;
    }

    public void setNumeroString(String numeroString) {
        this.numeroString = numeroString;
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
