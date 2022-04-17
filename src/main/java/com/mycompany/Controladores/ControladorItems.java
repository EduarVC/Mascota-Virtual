
package com.mycompany.Controladores;

import com.mycompany.JFrameMascotaVirtual.EstablecerImagenes;
import com.mycompany.Personajes.Jugador;
import com.mycompany.mascotas.Mascota;
import javax.swing.JLabel;

public class ControladorItems {
    private Mascota[] mascotas;
    private Jugador jugador;
    private Mascota establecerDatos;
    private EstablecerImagenes establecer;
    
    public ControladorItems(){
        establecer = new EstablecerImagenes();
        establecerDatos = new Mascota();
        jugador = new Jugador();
        mascotas = jugador.getMascotasAdquiridas();
    }
 
    public void verificarNombreMascota(String nombreMascota,JLabel lbl, Mascota [] mascotasJugador, JLabel lblTexto){
        for (Mascota mascota : mascotasJugador) {
            if (mascota.getNombreMascota().equals(nombreMascota)) {
               establecer.establecerImagen(lbl, mascota.getPathImagen());
                establecerDatos(mascota, lbl, lblTexto);
            }
        }
    }
    public void establecerDatos(Mascota mascotaSeleccionada, JLabel lbl, JLabel texto){
        establecer.establecerImagen(lbl, mascotaSeleccionada.getPathImagen());
        texto.setText( "<html>Pokemon: "+ mascotaSeleccionada.getNombreMascota() 
                + "<p>Nivel: "+ mascotaSeleccionada.getNivel()
                + "<p>Apodo: "+ mascotaSeleccionada.getApodoMascota()
                + "<p>Alimento pendiente: "+ mascotaSeleccionada.getConteoComidasAcumuladas() + "/" + mascotaSeleccionada.getComidasAcumuladas()
                + "<p>Paseo pendiente: "+ mascotaSeleccionada.getConteoPaseoAcumulado() + "/4"
                + "<p>Limpieza pendiente: "+ mascotaSeleccionada.getConteoLimpiezaAcumulada() + "/3"
                + "<p>Enfermedades: "+ mascotaSeleccionada.getConteoEnfermedadesAcumuladas() + "/6"
                + "<p>Victorias: "+ mascotaSeleccionada.getBatallasGanadas() + "/" + mascotaSeleccionada.getLimBatallasGanadas()
                +"<html>");
    }
}
