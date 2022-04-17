package com.mycompany.Tienda;

import com.mycompany.Alimentos.Alimento;
import com.mycompany.Medicinas.Medicina;
import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.AlimentosExistentes;
import com.mycompany.mascotavirtual.MascotasExistentes;
import com.mycompany.mascotavirtual.MedicinasExistentes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tienda {

    private static Mascota[] mascotasTienda;
    private MascotasExistentes mascota;
    private AlimentosExistentes alimento;
    private MedicinasExistentes medicina;
    private final int cantidadPokemons;
    private final int precioPokemons;
    private final int cantidadAlimentos;
    private final int cantidadMedicinas;
    private static Alimento[] alimentosTienda;
    private static Medicina[] medicinaTienda;

    public Tienda() {
        mascota = new MascotasExistentes();
        alimento = new AlimentosExistentes();
        medicina = new MedicinasExistentes();
        cantidadPokemons = 20;
        precioPokemons = 50;
        cantidadAlimentos = 3;
        cantidadMedicinas = 3;
        alimentosTienda = new Alimento[cantidadAlimentos];
        mascotasTienda = new Mascota[cantidadPokemons];
        medicinaTienda = new Medicina[cantidadMedicinas];
    }

    public void obtenerTiendaPokemons(JTable tabla) {
        String[] datos = new String[3];
        for (int i = 0; i < cantidadPokemons; i++) {
            mascotasTienda[i] = mascota.obtenerMascota(i + 1);
        }
        setMascotasTienda(mascotasTienda);
        for (int i = 0; i < mascotasTienda.length; i++) {
            datos[0] = Integer.toString(i + 1);
            datos[1] = mascotasTienda[i].getNombreMascota();
            datos[2] = Integer.toString(precioPokemons);
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
        }

    }

    public void obtenerAlimentosTienda(JTable tabla) {
        String[] datos = new String[4];
        for (int i = 0; i < cantidadAlimentos; i++) {
            alimentosTienda[i] = alimento.obtenerAlimentos(i + 1);
        }
        setAlimentosTienda(alimentosTienda);
        for (int i = 0; i < alimentosTienda.length; i++) {
            datos[0] = Integer.toString(i + 1);
            datos[1] = alimentosTienda[i].getNombreAlimento();
            datos[2] = alimentosTienda[i].getBeneficio();
            datos[3] = Integer.toString(alimentosTienda[i].getPrecio());
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
        }
    }

    public void obtenerMedicinaTienda(JTable tabla) {
        String[] datos = new String[4];
        for (int i = 0; i < cantidadMedicinas; i++) {
            medicinaTienda[i] = medicina.obtenerMedicina(i + 1);
        }
        setMedicinaTienda(medicinaTienda);
        for (int i = 0; i < medicinaTienda.length; i++) {
            datos[0] = Integer.toString(i + 1);
            datos[1] = medicinaTienda[i].getNombreMedicina();
            datos[2] = medicinaTienda[i].getDescripcion();
            datos[3] = Integer.toString(medicinaTienda[i].getPrecio());
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
        }
    }

    public static void setMascotasTienda(Mascota[] mascotasTienda) {
        Tienda.mascotasTienda = mascotasTienda;
    }

    public Mascota[] getMascotasTienda() {
        return mascotasTienda;
    }

    public Alimento[] getAlimentosTienda() {
        return alimentosTienda;
    }

    public static void setAlimentosTienda(Alimento[] alimentosTienda) {
        Tienda.alimentosTienda = alimentosTienda;
    }

    public static Medicina[] getMedicinaTienda() {
        return medicinaTienda;
    }

    public static void setMedicinaTienda(Medicina[] medicinaTienda) {
        Tienda.medicinaTienda = medicinaTienda;
    }
}
