package com.mycompany.Personajes;

import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;

public class Enemigo {

    private Mascota mascotaSalvaje;

    public Enemigo() {
        mascotaSalvaje = new Mascota();
    }

    public Mascota obtenerMascota(Mascota mascotaJugador) {
        MascotasExistentes obtenerMascota = new MascotasExistentes();
        int numeroMascota = (int) (Math.random() * 151 + 1);
        mascotaSalvaje = obtenerMascota.obtenerMascota(numeroMascota);
        int numero = (int) (Math.random() * 100 + 1);
        if (numero > 0 && numero <= 34) {
            mascotaSalvaje.setNivel(mascotaJugador.getNivel()-1);
        } else if (numero > 34 && numero <= 67) {
            mascotaSalvaje.setNivel(mascotaJugador.getNivel()+1);
        } else if (numero > 67) {
            mascotaSalvaje.setNivel(mascotaJugador.getNivel()+2);
        }
        
        return mascotaSalvaje;
    }
}
