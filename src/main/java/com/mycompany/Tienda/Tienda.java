package com.mycompany.Tienda;

import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tienda {

    private Mascota[] mascotasTienda;
    private MascotasExistentes mascota;
    private final int cantidaPokemons;
    private final int precioPokemons;

    public Tienda() {
        mascota = new MascotasExistentes();

        cantidaPokemons = 6;
        precioPokemons = 50;
        mascotasTienda = new Mascota[cantidaPokemons];
    }

    public void obtenerTiendaPokemons(JTable tabla) {
        String[] datos = new String[3];
        for (int i = 0; i < cantidaPokemons; i++) {
            mascotasTienda[i] = mascota.obtenerMascota(i + 1);

        }
        for (int i = 0; i < mascotasTienda.length; i++) {
            datos[0] = Integer.toString(i + 1);
            datos[1] = mascotasTienda[i].getNombreMascota();
            datos[2] = Integer.toString(precioPokemons);
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
        }

    }

    public Mascota[] getMascotasTienda() {
        return mascotasTienda;
    }
}
