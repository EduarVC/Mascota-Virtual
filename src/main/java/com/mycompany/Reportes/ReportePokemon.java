package com.mycompany.Reportes;

public class ReportePokemon {
    private String nombre;
    private String accion;
    private String fecha;
    private String hora;
    private int nivel;
    
     @Override
    public String toString() {
        return getNombre() + " " + getAccion() + "" + getFecha() + " " + getHora() + " " + getNivel();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
