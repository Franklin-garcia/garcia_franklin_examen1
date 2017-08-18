
import java.util.ArrayList;
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
public class Usuario {
   private String usuario;
   private String contrasena;
   private Date fecha_nacimiento;
   private String número;
   private String correo;
   private String Nombre;
   private String genero_favorito;
   private ArrayList<Integer>lista_libros=new ArrayList();
   private ArrayList<Integer>lista_amigos=new ArrayList();
    private ArrayList<Solicitud> lista_solicitudes=new ArrayList();
    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, Date fecha_nacimiento, String número, String correo, String Nombre, String genero_favorito) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fecha_nacimiento = fecha_nacimiento;
        this.número = número;
        this.correo = correo;
        this.Nombre = Nombre;
        this.genero_favorito = genero_favorito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero_favorito() {
        return genero_favorito;
    }

    public void setGenero_favorito(String genero_favorito) {
        this.genero_favorito = genero_favorito;
    }

    public ArrayList<Integer> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(ArrayList<Integer> lista_libros) {
        this.lista_libros = lista_libros;
    }

    public ArrayList<Integer> getLista_amigos() {
        return lista_amigos;
    }

    public void setLista_amigos(ArrayList<Integer> lista_amigos) {
        this.lista_amigos = lista_amigos;
    }

    public void setLista_solicitudes(ArrayList<Solicitud> lista_solicitudes) {
        this.lista_solicitudes = lista_solicitudes;
    }

    public ArrayList<Solicitud> getLista_solicitudes() {
        return lista_solicitudes;
    }

    @Override
    public String toString() {
        return usuario;
          }
   
}
