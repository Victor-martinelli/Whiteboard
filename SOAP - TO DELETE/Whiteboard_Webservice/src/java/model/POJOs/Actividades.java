package model.POJOs;
// Generated May 6, 2018 8:06:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Actividades generated by hbm2java
 */
public class Actividades  implements java.io.Serializable {


     private Integer actividadId;
     private Profesores profesores;
     private Date fechaFin;
     private String tipo;
     private double notaMax;
     private String nombre;
     private Set entregas = new HashSet(0);

    public Actividades() {
    }

	
    public Actividades(Profesores profesores, Date fechaFin, String tipo, double notaMax, String nombre) {
        this.profesores = profesores;
        this.fechaFin = fechaFin;
        this.tipo = tipo;
        this.notaMax = notaMax;
        this.nombre = nombre;
    }
    public Actividades(Profesores profesores, Date fechaFin, String tipo, double notaMax, String nombre, Set entregas) {
       this.profesores = profesores;
       this.fechaFin = fechaFin;
       this.tipo = tipo;
       this.notaMax = notaMax;
       this.nombre = nombre;
       this.entregas = entregas;
    }
   
    public Integer getActividadId() {
        return this.actividadId;
    }
    
    public void setActividadId(Integer actividadId) {
        this.actividadId = actividadId;
    }
    public Profesores getProfesores() {
        return this.profesores;
    }
    
    public void setProfesores(Profesores profesores) {
        this.profesores = profesores;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getNotaMax() {
        return this.notaMax;
    }
    
    public void setNotaMax(double notaMax) {
        this.notaMax = notaMax;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getEntregas() {
        return this.entregas;
    }
    
    public void setEntregas(Set entregas) {
        this.entregas = entregas;
    }




}

