package com.mycompany.Controladores;

import static com.mycompany.JFrameMascotaVirtual.Farmacia.lblCantidadOroo;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.lblMonedasOro;
import static com.mycompany.JFrameMascotaVirtual.Pokemon.lblOroTiendaPokemons;
import static com.mycompany.JFrameMascotaVirtual.Restaurante.lblCantidadOro;

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
    
}
