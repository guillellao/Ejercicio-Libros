/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tommy
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String genero;
    private String agno;
    private String valor;

    public Libro(String titulo, String autor, String genero, String agno, String valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.agno = agno;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getAgno() {
        return agno;
    }

    public String getValor() {
        return valor;
    }

    
    
    
    
}
