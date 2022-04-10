package com.mycompany.mascotas;

import com.mycompany.JFrameMascotaVirtual.EstablecerImagenes;
import com.mycompany.JFrameMascotaVirtual.JFramePrincipal;

public class Mascota {
    
    private EstablecerImagenes establecer;
    private String nombreMascota;
    private String apodoMascota;
    private String pathImagen;
    private int nivel;
    private boolean nace;
    private boolean crece_vivir;
    private boolean alimentada;
    private boolean limpiada;
    private boolean paseada;
    private boolean curada;
    private boolean enferma;
    private boolean muere;
    private boolean revive;

    public Mascota(){
        establecer = new EstablecerImagenes();
    }
     @Override
    public String toString() {
        
        return "Nombre: " + getNombreMascota() + "\nNivel: " + getNivel();
    }

    
    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }
    public String getApodoMascota() {
        return apodoMascota;
    }

    public void setApodoMascota(String apodoMascota) {
        this.apodoMascota = apodoMascota;
    }
    

    public boolean isRevive() {
        return revive;
    }

    public void setRevive(boolean revive) {
        this.revive = revive;
    }

    
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isNace() {
        return nace;
    }

    public void setNace(boolean nace) {
        this.nace = nace;
    }

    public boolean isCrece_vivir() {
        return crece_vivir;
    }

    public void setCrece_vivir(boolean crece_vivir) {
        this.crece_vivir = crece_vivir;
    }

    public boolean isAlimentada() {
        return alimentada;
    }

    public void setAlimentada(boolean alimentada) {
        this.alimentada = alimentada;
    }

    public boolean isLimpiada() {
        return limpiada;
    }

    public void setLimpiada(boolean limpiada) {
        this.limpiada = limpiada;
    }

    public boolean isPaseada() {
        return paseada;
    }

    public void setPaseada(boolean paseada) {
        this.paseada = paseada;
    }

    public boolean isCurada() {
        return curada;
    }

    public void setCurada(boolean curada) {
        this.curada = curada;
    }

    public boolean isEnferma() {
        return enferma;
    }

    public void setEnferma(boolean enferma) {
        this.enferma = enferma;
    }

    public boolean isMuere() {
        return muere;
    }

    public void setMuere(boolean muere) {
        this.muere = muere;
    }
    
}
