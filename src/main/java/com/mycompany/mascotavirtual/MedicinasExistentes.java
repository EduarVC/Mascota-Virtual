package com.mycompany.mascotavirtual;

import com.mycompany.Medicinas.Analgesico;
import com.mycompany.Medicinas.Antibiotico;
import com.mycompany.Medicinas.Medicina;
import com.mycompany.Medicinas.Vitamina;

public class MedicinasExistentes {
   
    public Medicina obtenerMedicina(int numero){
        Medicina medicinaTienda = new Medicina();
        switch (numero) {
            case 1:
                medicinaTienda = new Vitamina();
                break;
            case 2:
                medicinaTienda = new Analgesico();
                break;
            case 3:
                medicinaTienda = new Antibiotico();
                break;
            default:
                throw new AssertionError();
        }
        return medicinaTienda;
    }
}
