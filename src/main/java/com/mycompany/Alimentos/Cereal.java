package com.mycompany.Alimentos;

import com.mycompany.mascotas.Mascota;

public class Cereal extends Alimento implements InterfasAlimento{
    public Cereal(){
        setNombreAlimento("Cereal");
        setPrecio(30);
        setBeneficio("Aumenta pendientes a 7");
    }

    @Override
    public void AumentarComidasPendientes(Mascota mascotaAlimentada) {
       mascotaAlimentada.setComidasAcumuladas(7);
    }
}
