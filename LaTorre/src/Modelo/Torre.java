package Modelo;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class Torre {

    protected int nivel;
    protected int numeroActual;
    protected int str;
    protected int num;
    String[] n = new String[2];

    public Torre() {
        nivel = 0;
        str = 0;
        num = 0;
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
}
