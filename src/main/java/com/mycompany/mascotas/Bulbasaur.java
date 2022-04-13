package com.mycompany.mascotas;

public class Bulbasaur extends Mascota{
    
    public Bulbasaur(){
        setNombreMascota("Bulbasaur");
        setNivel(1);
        setNace(false);
        setCrece_vivir(false);
        setAlimentada(false);
        setLimpiada(false);
        setPaseada(false);
        setCurada(false);
        setEnferma(true);
        setMuere(false);
        setRevive(false);
        setPathImagen("src/main/java/com/mycompany/Imagenes/001Bulbasaur.png");
        setEnfermedadesAcumuladas(3);
    }
    
}
