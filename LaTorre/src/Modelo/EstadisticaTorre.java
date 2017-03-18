package Modelo;

import java.util.Date;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class EstadisticaTorre {

    String nombreJuego;
    String idEstudiante;
    int erroresUnidades;
    int erroresDecenas;
    int erroresCentenas;
    int nivelAlcanzado;
    Date fecha;

    public EstadisticaTorre(String idEstudiante, Date fecha) {
        this.idEstudiante = idEstudiante;
        erroresUnidades = 0;
        erroresDecenas = 0;
        erroresCentenas = 0;
        nivelAlcanzado = 0;
        this.fecha = fecha;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
    
    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getErroresUnidades() {
        return erroresUnidades;
    }

    public void setErroresUnidades(int erroresUnidades) {
        this.erroresUnidades = erroresUnidades;
    }

    public int getErroresDecenas() {
        return erroresDecenas;
    }

    public void setErroresDecenas(int erroresDecenas) {
        this.erroresDecenas = erroresDecenas;
    }

    public int getErroresCentenas() {
        return erroresCentenas;
    }

    public void setErroresCentenas(int erroresCentenas) {
        this.erroresCentenas = erroresCentenas;
    }

    public int getNivelAlcanzado() {
        return nivelAlcanzado;
    }

    public void setNivelAlcanzado(int nivelAlcanzado) {
        this.nivelAlcanzado = nivelAlcanzado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
