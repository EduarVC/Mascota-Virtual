package com.mycompany.Controladores;

import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.lblMonedasOro;
import static com.mycompany.JFrameMascotaVirtual.Pokemon.lblOroTiendaPokemons;

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
    
    public static void establecerOroLbl(){
        lblMonedasOro.setText(Integer.toString(getOro()));
        lblOroTiendaPokemons.setText(Integer.toString(getOro()));
    }
}
