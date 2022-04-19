package com.mycompany.mascotas;

import com.mycompany.Controladores.ControladorComboBox;
import com.mycompany.Controladores.ControladorVidaLvl5;
import static com.mycompany.Controladores.ObtenerFechaHora.obtenerFecha;
import static com.mycompany.Controladores.ObtenerFechaHora.obtenerHora;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getMascotasMuertas;
import com.mycompany.Reportes.ControlReportes;
import javax.swing.JOptionPane;

public class Mascota extends Thread {
    
    private String nombreMascota;
    private String apodoMascota;
    private String pathImagen;
    private int nivel;
    private int numeroMascota;
    private int conteoAlimentos;
    private int conteoPaseoAcumulado;
    private int conteoLimpiezaAcumulada;
    private int conteoComidasAcumuladas;
    private int comidasAcumuladas;
    private int conteoEnfermedadesAcumuladas;
    private int EnfermedadesAcumuladas;
    private int batallasGanadas;
    private int limBatallasGanadas;
    private boolean nace;
    private boolean crece_vivir;
    private boolean alimentada;
    private boolean limpiada;
    private boolean paseada;
    private boolean curada;
    private boolean enferma;
    private boolean muere;
    private boolean revive;
    
    public Mascota() {
    }
    
    @Override
    public String toString() {
        
        return "Nombre: " + getNombreMascota()
                + "\nNivel: " + getNivel()
                + "\ncantidad Enfermedades: " + getConteoEnfermedadesAcumuladas()
                + "\nAlimentos pendientes: " + getConteoComidasAcumuladas()
                + "\nConteo Alimentos " + getConteoAlimentos()
                + "\nApodo: " + getApodoMascota();
                
    }
    
    @Override
    public void run() {
        int tiempoAlimento = 30000;
        int tiempoPaseo = 30000;
        ControlReportes control1 = new ControlReportes();
        while (isMuere() == false) { //Se mantiene el proceso si el pokemon sigue vivo
            System.out.println("hilo iniciado " + getNombreMascota());
            if (getConteoComidasAcumuladas() < getComidasAcumuladas() && getConteoEnfermedadesAcumuladas() < getEnfermedadesAcumuladas()) {
                try {
                    Thread.sleep(tiempoAlimento);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en el Hilo de almientos");
                    
                }
                JOptionPane.showMessageDialog(null, String.format("el pokemon %s necesita ser alimentado", getNombreMascota()));
                setConteoComidasAcumuladas(getConteoComidasAcumuladas() + 1);
                control1.agregarRepote(getNombreMascota(), "Peticion alimento", obtenerFecha(), obtenerHora(), getNivel());
                try {
                    Thread.sleep(tiempoPaseo);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en el Hilo de paseo");
                }
                JOptionPane.showMessageDialog(null, String.format("el pokemon %s necesita salir de paseo", getNombreMascota()));
                setConteoPaseoAcumulado(getConteoPaseoAcumulado() + 1);
                control1.agregarRepote(getNombreMascota(), "Peticion paseo", obtenerFecha(), obtenerHora(), getNivel());
                if (getConteoPaseoAcumulado() >= 4) {
                    setConteoEnfermedadesAcumuladas(getConteoEnfermedadesAcumuladas() + 1);
                    setEnferma(true);
                    JOptionPane.showMessageDialog(null, String.format("el pokemon %s a contraido una nueva enfermedad", getNombreMascota()));
                    setConteoPaseoAcumulado(0);
                    control1.agregarRepote(getNombreMascota(), "Se enfermo", obtenerFecha(), obtenerHora(), getNivel());
                }
            }else{
                setMuere(true);
            }
            
            if(getNivel() == 5){
               ControladorVidaLvl5 controlVida = new ControladorVidaLvl5(this);
               controlVida.start();
            } 
        }
        if (getConteoComidasAcumuladas() < getComidasAcumuladas() && getConteoEnfermedadesAcumuladas() < getEnfermedadesAcumuladas()) {
            JOptionPane.showMessageDialog(null, String.format("el pokemon %s a muerto por ser lvl 5", getNombreMascota()));
            control1.agregarRepote(getNombreMascota(), "Murio", obtenerFecha(), obtenerHora(), getNivel());
        }else{
        JOptionPane.showMessageDialog(null, String.format("el pokemon %s a muerto", getNombreMascota()));
        control1.agregarRepote(getNombreMascota(), "Murio", obtenerFecha(), obtenerHora(), getNivel());
        }
        ControladorComboBox control = new ControladorComboBox();
        control.cambioMascotasJugador(this, getMascotasMuertas());
    }
    

    public void calcularLimiteBatallas(){
        int numero = (int)(Math.random()*15+5);
        setLimBatallasGanadas(numero*getNivel());
    }
    public int getBatallasGanadas() {
        return batallasGanadas;
    }

    public void setBatallasGanadas(int batallasGanadas) {
        this.batallasGanadas = batallasGanadas;
    }

    public int getLimBatallasGanadas() {
        return limBatallasGanadas;
    }

    public void setLimBatallasGanadas(int limBatallasGanadas) {
        this.limBatallasGanadas = limBatallasGanadas;
    }

    public int getNumeroMascota() {
        return numeroMascota;
    }

    public void setNumeroMascota(int numeroMascota) {
        this.numeroMascota = numeroMascota;
    }
    
    public int getConteoPaseoAcumulado() {
        return conteoPaseoAcumulado;
    }
    
    public void setConteoPaseoAcumulado(int conteoPaseoAcumulado) {
        this.conteoPaseoAcumulado = conteoPaseoAcumulado;
    }
    
    public int getConteoLimpiezaAcumulada() {
        return conteoLimpiezaAcumulada;
    }
    
    public void setConteoLimpiezaAcumulada(int conteoLimpiezaAcumulada) {
        this.conteoLimpiezaAcumulada = conteoLimpiezaAcumulada;
    }
    
    public int getConteoAlimentos() {
        return conteoAlimentos;
    }
    
    public void setConteoAlimentos(int conteoAlimentos) {
        this.conteoAlimentos = conteoAlimentos;
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
