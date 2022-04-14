package com.mycompany.Controladores;

import static com.mycompany.JFrameMascotaVirtual.Farmacia.lblCantidadOroo;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.lblMonedasOro;
import static com.mycompany.JFrameMascotaVirtual.Pokemon.lblOroTiendaPokemons;
import static com.mycompany.JFrameMascotaVirtual.Restaurante.lblCantidadOro;
import com.mycompany.mascotas.Mascota;

public class ControladorOro {
    private static int Oro;
    
    public ControladorOro(){
        
    }

    public static int getOro() {
        return Oro;
    }

    public static void setOro(int Oro) {
        ControladorOro.Oro = Oro;
    }
    
    public static void establecerOroLblTiendaPok(){
        lblMonedasOro.setText(Integer.toString(getOro()));
        lblOroTiendaPokemons.setText(Integer.toString(getOro()));   
    }
    public static void establecerOroLblTiendaAlim(){
        lblMonedasOro.setText(Integer.toString(getOro()));
        lblCantidadOro.setText(Integer.toString(getOro()));
    }
    public static void establecerOroLblTiendaMed(){
        lblMonedasOro.setText(Integer.toString(getOro()));
        lblCantidadOroo.setText(Integer.toString(getOro()));
    }
    
    public static int precioRevivir(Mascota mascotaSeleccionada){
        int precio = 0;
        precio = (5 * mascotaSeleccionada.getNivel()) + 10;
        return precio;
    }
    public static void establecerOroLblRevivir(){
        lblMonedasOro.setText(Integer.toString(getOro()));
    }
    
}
