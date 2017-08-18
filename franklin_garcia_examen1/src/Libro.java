
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class Libro {

    private String titulo;
    private String descripcion;
    private String  puntaje;
    private int copias_disponibles;
    private String genero;
    private String  valor;
    private String edicion;
    private String autor;
    private Date ano_publicación;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, String puntaje, int copias_disponibles, String genero, String valor, String edicion, String autor, Date ano_publicación) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias_disponibles = copias_disponibles;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.ano_publicación = ano_publicación;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias_disponibles() {
        return copias_disponibles;
    }

    public void setCopias_disponibles(int copias_disponibles) {
        this.copias_disponibles = copias_disponibles;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAno_publicación() {
        return ano_publicación;
    }

    public void setAno_publicación(Date ano_publicación) {
        this.ano_publicación = ano_publicación;
    }

   

    @Override
    public String toString() {
        return titulo;
    }


}
