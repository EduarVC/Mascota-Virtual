package com.mycompany.mascotavirtual;

import com.mycompany.mascotas.*;

public class MascotasExistentes {
    public MascotasExistentes(){
        
    }
    
    public Mascota obtenerMascota(int numeroSeleccionado){
       Mascota mascotaAdquirida;
        switch (numeroSeleccionado) {
            case 1:
                mascotaAdquirida = new Bulbasaur();
                break;
            case 2:
                mascotaAdquirida = new Ivysaur();
                break;
            case 3:
                mascotaAdquirida = new Venusaur();
                break;
            case 4:
                mascotaAdquirida = new Charmander();
                break;
            case 5:
                mascotaAdquirida = new Charmeleon();
                break;
            case 6:
                mascotaAdquirida = new Charizard();
                break;
            default:
                throw new AssertionError();
        }
       return mascotaAdquirida;
    }
}
