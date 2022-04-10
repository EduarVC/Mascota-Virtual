package com.mycompany.Controladores;

import com.mycompany.JFrameMascotaVirtual.Farmacia;
import com.mycompany.JFrameMascotaVirtual.Pokemon;
import com.mycompany.JFrameMascotaVirtual.Restaurante;
import javax.swing.JComboBox;

public class ControladorSeleccionTienda {
    
    public void tiendaSeleccionada(String tiendaSeleccionada){
        try {
            if(null != tiendaSeleccionada)switch (tiendaSeleccionada) {
            case "Restaurante":
                Restaurante restaurante = new Restaurante();
                restaurante.setVisible(true);
                break;
            case "Farmacia":
                Farmacia farmacia = new Farmacia();
                farmacia.setVisible(true);
                break;
            case "Pokemons":
                Pokemon pokemons = new Pokemon();
                pokemons.setVisible(true);
                break;
            default:
                break;
        }
        } catch (Exception e) {
            System.out.println("Algo salio mal.");
        }
        
    }
}
/*
Restaurante
Farmacia
Pokemons
*/