package com.mycompany.Personajes;

import com.mycompany.mascotas.Mascota;

public class Personaje {
    protected Mascota[] mascotasAdquiridas;
    
    public Personaje(){
       
    }

    public Mascota[] getMascotasAdquiridas() {
        return mascotasAdquiridas;
    }

    public void setMascotasAdquiridas(Mascota[] mascotasAdquiridas) {
        this.mascotasAdquiridas = mascotasAdquiridas;
    }
}
