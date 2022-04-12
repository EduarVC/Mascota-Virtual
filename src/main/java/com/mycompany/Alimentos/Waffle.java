package com.mycompany.Alimentos;

import com.mycompany.mascotas.Mascota;

public class Waffle extends Alimento implements InterfasAlimento{
    public Waffle(){
        setNombreAlimento("Waffle");
        setPrecio(50);
        setBeneficio("Aumenta pendientes a 10");
    }

    @Override
    public void AumentarComidasPendientes(Mascota mascotaAlimentada) {
        mascotaAlimentada.setComidasAcumuladas(10);
        mascotaAlimentada.setAlimentada(true);
    }
    
}
