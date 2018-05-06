package model.POJOs;
// Generated May 6, 2018 8:06:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesores generated by hbm2java
 */
public class Profesores  implements java.io.Serializable {


     private Integer idUsuario;
     private String username;
     private String horaTutoria;
     private String password;
     private String nombre;
     private String apellidos;
     private String foto;
     private Set actividadeses = new HashSet(0);
     private Set asignaturases = new HashSet(0);

    public Profesores() {
    }

	
    public Profesores(String username, String horaTutoria, String password, String nombre, String apellidos, String foto) {
        this.username = username;
        this.horaTutoria = horaTutoria;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.foto = foto;
    }
    public Profesores(String username, String horaTutoria, String password, String nombre, String apellidos, String foto, Set actividadeses, Set asignaturases) {
       this.username = username;
       this.horaTutoria = horaTutoria;
       this.password = password;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.foto = foto;
       this.actividadeses = actividadeses;
       this.asignaturases = asignaturases;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getHoraTutoria() {
        return this.horaTutoria;
    }
    
    public void setHoraTutoria(String horaTutoria) {
        this.horaTutoria = horaTutoria;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Set getActividadeses() {
        return this.actividadeses;
    }
    
    public void setActividadeses(Set actividadeses) {
        this.actividadeses = actividadeses;
    }
    public Set getAsignaturases() {
        return this.asignaturases;
    }
    
    public void setAsignaturases(Set asignaturases) {
        this.asignaturases = asignaturases;
    }




}


