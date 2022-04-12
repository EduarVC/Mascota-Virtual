package com.mycompany.mascotavirtual;

import com.mycompany.Alimentos.Alimento;
import com.mycompany.Alimentos.Cereal;
import com.mycompany.Alimentos.Manzana;
import com.mycompany.Alimentos.Waffle;

public class AlimentosExistentes {
    public Alimento obtenerAlimentos(int numero){
        Alimento alimentoObtenido;
        switch (numero) {
            case 1:
                alimentoObtenido = new Manzana();
                break;
            case 2:
                alimentoObtenido = new Cereal();
                break;
            case 3:
                alimentoObtenido = new Waffle();
                break;
            default:
                throw new AssertionError();
        }
        return alimentoObtenido;
    }
}
