package com.mycompany.Personajes;

import com.mycompany.Controladores.ControladorComboBox;
import com.mycompany.Tienda.Tienda;
import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;

import javax.swing.JOptionPane;

public class Jugador{
    private String [] nombresMascotas;
    private int monedasOro;
    private MascotasExistentes mascotaAdquirida;
    protected Mascota[] mascotasAdquiridas;
    private Tienda mascotasTienda;
    
    public Jugador(){
        
        mascotaAdquirida = new MascotasExistentes();
        mascotasAdquiridas = new Mascota[1];
//        setMascotasAdquiridas(obtenerMascotaPrincipal());        
        setMonedasOro(100);
    }
    //Se obtiene una mascota Inicial aleatoriamente 

    public Mascota[] getMascotasAdquiridas() {
        return mascotasAdquiridas;
    }
    
    public void obtenerMascotaPrincipal(){
        int numero;
        numero = (int) (Math.random()*6+1);  
        mascotasAdquiridas[0] = mascotaAdquirida.obtenerMascota(numero);
        JOptionPane.showMessageDialog(null, "Obtuviste el pokemon: " + mascotasAdquiridas[0].getNombreMascota());  
    }
    
    public String[] obtenerNombres(){
        return nombresMascotas;
    }
    
    public void comprarMascota(int numeroMascota){ 
        mascotasAdquiridas = redimencionarArregloMascotas(getMascotasAdquiridas());
        getMascotasAdquiridas()[getMascotasAdquiridas().length-1] = mascotaAdquirida.obtenerMascota(numeroMascota);
        JOptionPane.showMessageDialog(null, "Obtuviste el pokemon: " + getMascotasAdquiridas()[getMascotasAdquiridas().length-1].getNombreMascota());
    }

    public void setMascotasAdquiridas(Mascota[] mascotasAdquiridas) {
        this.mascotasAdquiridas = mascotasAdquiridas;
    }
    //Se redimenciona el arreglo de las mascotas del jugador cuando compra un nuevo pokemos 
    public static Mascota [] redimencionarArregloMascotas(Mascota[] arregloMascotas){
        Mascota [] arregloRedimencionado = new Mascota[arregloMascotas.length + 1];
        System.arraycopy(arregloMascotas, 0, arregloRedimencionado, 0, arregloMascotas.length);
        
        return arregloRedimencionado;
    }
    public int getMonedasOro() {
        return monedasOro;
    }

    public void setMonedasOro(int monedasOro) {
        this.monedasOro = monedasOro;
    }
    
}
