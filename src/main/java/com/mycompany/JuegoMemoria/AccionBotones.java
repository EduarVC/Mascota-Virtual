package com.mycompany.JuegoMemoria;

import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AccionBotones implements ActionListener{

    private static JButton [][] arregloBotones;
    private int columas;
    private int filas;
    private static int [][] matrizz;
    private int numero;
    private Mascota mascota;
    MascotasExistentes obtenerImgMas;
    ImageIcon imagen;
    private JButton boton;
    
    public  AccionBotones(int columnas, int Filas){
        this.columas = columnas;
        this.filas = Filas;
        mascota = new Mascota();
        obtenerImgMas = new MascotasExistentes();
        boton = new JButton();
    }

    public static JButton[][] getArregloBotones() {
        return arregloBotones;
    }

    public static void setArregloBotones(JButton[][] arregloBotones) {
        AccionBotones.arregloBotones = arregloBotones;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int[][] getMatriz() {
        return matrizz;
    }

    public static void setMatrizz(int[][] matriz) {
        AccionBotones.matrizz = matriz;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columas; j++) {
                if(e.getSource().equals(getArregloBotones()[i][j])){
                    setNumero(getMatriz()[i][j]);
                    imagenBoton(getNumero());
                    Icon imag = new ImageIcon(getImagen().getImage().getScaledInstance(getArregloBotones()[i][j].getWidth(), getArregloBotones()[i][j].getHeight(), Image.SCALE_DEFAULT));
                    this.boton.setIcon(imag);
                } else {
                }
            }
        }
    }
    
    public void imagenBoton(int Numero){
        mascota = obtenerImgMas.obtenerMascota(Numero);
        ImageIcon im = new ImageIcon(mascota.getPathImagen());
        setImagen(im);
    }
    
}
