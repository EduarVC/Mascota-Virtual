package com.mycompany.mascotavirtual;

import com.mycompany.mascotas.*;

public class MascotasExistentes {

    public MascotasExistentes() {

    }

    public Mascota obtenerMascota(int numeroSeleccionado) {
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
            case 7:
                mascotaAdquirida = new Squirtle();
                break;
            case 8:
                mascotaAdquirida = new Wartortle();
                break;
            case 9:
                mascotaAdquirida = new Blastoise();
                break;
            case 10:
                mascotaAdquirida = new Caterpie();
                break;
            case 11:
                mascotaAdquirida = new Metapod();
                break;
            case 12:
                mascotaAdquirida = new Butterfree();
                break;
            case 13:
                mascotaAdquirida = new Weedle();
                break;
            case 14:
                mascotaAdquirida = new Kakuna();
                break;
            case 15:
                mascotaAdquirida = new Beedrill();
                break;
            case 16:
                mascotaAdquirida = new Pidgey();
                break;
            case 17:
                mascotaAdquirida = new Pidgeotto();
                break;
            case 18:
                mascotaAdquirida = new Pidgeot();
                break;
            case 19:
                mascotaAdquirida = new Rattata();
                break;
            case 20:
                mascotaAdquirida = new Raticate();
                break;
            default:
                throw new AssertionError();
        }
        return mascotaAdquirida;
    }
}
