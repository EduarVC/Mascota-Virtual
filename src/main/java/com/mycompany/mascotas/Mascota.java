package com.mycompany.mascotas;

import javax.swing.JOptionPane;

public class Mascota extends Thread{
    
    private String nombreMascota;
    private String apodoMascota;
    private String pathImagen;
    private int nivel;
    private int conteoComidasAcumuladas;
    private int comidasAcumuladas;
    private int conteoEnfermedadesAcumuladas;
    private int EnfermedadesAcumuladas;
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
    }
     @Override
    public String toString() {
        
        return "Nombre: " + getNombreMascota() + "\nNivel: " + getNivel() + "enferma: "  + isEnferma() + "cantidad Enfermedades: " + getEnfermedadesAcumuladas();
    }
    @Override
    public void run(){
        int tiempo = 7000;
        for (int i = 0; i < 10; i++) {
             try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Error en el Hilo");
        }
        JOptionPane.showMessageDialog(null, String.format("Hilo de %s en proceso", getNombreMascota()));
        }
       
    }

    public int getConteoEnfermedadesAcumuladas() {
        return conteoEnfermedadesAcumuladas;
    }

    public void setConteoEnfermedadesAcumuladas(int conteoEnfermedadesAcumuladas) {
        this.conteoEnfermedadesAcumuladas = conteoEnfermedadesAcumuladas;
    }

    public int getEnfermedadesAcumuladas() {
        return EnfermedadesAcumuladas;
    }

    public void setEnfermedadesAcumuladas(int EnfermedadesAcumuladas) {
        this.EnfermedadesAcumuladas = EnfermedadesAcumuladas;
    }

    public int getConteoComidasAcumuladas() {
        return conteoComidasAcumuladas;
    }

    public void setConteoComidasAcumuladas(int conteoComidasAcumuladas) {
        this.conteoComidasAcumuladas = conteoComidasAcumuladas;
    }

    public int getComidasAcumuladas() {
        return comidasAcumuladas;
    }

    public void setComidasAcumuladas(int comidasAcumuladas) {
        this.comidasAcumuladas = comidasAcumuladas;
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
