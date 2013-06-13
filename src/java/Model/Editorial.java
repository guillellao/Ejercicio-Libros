/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tommy
 */
public class Editorial {
    private String nombre;
    private String direc;
    private String ano;

    public String getNombre() {
        return nombre;
    }

    public String getDirec() {
        return direc;
    }

    public String getAno() {
        return ano;
    }

    public Editorial(String nombre, String direc, String ano) {
        this.nombre = nombre;
        this.direc = direc;
        this.ano = ano;
    }
    
}
