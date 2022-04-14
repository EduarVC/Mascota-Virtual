package com.mycompany.Controladores;

import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.cmbMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.cmbRevivir;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getMascotasMuertas;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.setMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.setMascotasMuertas;
import com.mycompany.Personajes.Jugador;
import com.mycompany.mascotas.Mascota;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ControladorComboBox {

    private Jugador jugador;
    private static Mascota[] mascotasMuertas;
    private int tamañoArregloMasMuertas;

    public ControladorComboBox() {
        jugador = new Jugador();
        setTamañoArregloMasMuertas(0);
        mascotasMuertas = new Mascota[getTamañoArregloMasMuertas()];
    }

    public static Mascota[] getmascotasMuertas() {
        return mascotasMuertas;
    }

    public static void setmascotasMuertas(Mascota[] mascotasMuertas) {
        ControladorComboBox.mascotasMuertas = mascotasMuertas;
    }

    public int getTamañoArregloMasMuertas() {
        return tamañoArregloMasMuertas;
    }

    public void setTamañoArregloMasMuertas(int tamañoArregloMasMuertas) {
        this.tamañoArregloMasMuertas = tamañoArregloMasMuertas;
    }

    //se agragan las mascotas adquiridas al combobox
    public void InicializarCbo(JComboBox cmbMascotasJugador) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbMascotasJugador.getModel();
        for (Mascota mascota : getMascotasJugador()) {
            model.addElement(mascota.getNombreMascota());
        }
    }

    //se cambia el arreglo de las mascotas del jugador y las muertas
    public void cambioMascotasJugador(Mascota mascotaMuerta, Mascota[] mascotasM) {
        ControladorItems controlador = new ControladorItems();
        try {
            for (int i = 0; i < mascotasM.length; i++) {
                System.out.println(mascotasM);
                System.out.println(".....");
            }
        } catch (NullPointerException e) {
        }

        setmascotasMuertas(mascotasM);
        try {
            for (int i = 0; i < getmascotasMuertas().length; i++) {
                System.out.println(getmascotasMuertas());
                System.out.println(".....");
            }
        } catch (NullPointerException e) {
        }
        try {
            setTamañoArregloMasMuertas(getmascotasMuertas().length + 1);
        } catch (NullPointerException e) {
            setTamañoArregloMasMuertas(1);
        }

        System.out.println(getTamañoArregloMasMuertas());
        Mascota[] arregloMM = new Mascota[getTamañoArregloMasMuertas()];
        int posicion = 0;
        Mascota[] cambioMascotas = new Mascota[getMascotasJugador().length - 1];
        for (int i = 0; i < getMascotasJugador().length; i++) {
            if (!getMascotasJugador()[i].getNombreMascota().equals(mascotaMuerta.getNombreMascota())) {
                cambioMascotas[posicion] = getMascotasJugador()[i];
                posicion++;
            }

        }

        jugador.setMascotasAdquiridas(cambioMascotas);
        setMascotasJugador(cambioMascotas);
        cmbMascotasJugador.removeAllItems();
        InicializarCbo(cmbMascotasJugador);
        
        for (int i = 0; i < arregloMM.length; i++) {
            if (i != arregloMM.length - 1) {
                arregloMM[i] = getmascotasMuertas()[i];
            } else {
                arregloMM[i] = mascotaMuerta;
            }
        }
        try {
            for (int i = 0; i < arregloMM.length; i++) {
                System.out.println(arregloMM);
                System.out.println(".....");
            }
        } catch (NullPointerException e) {
        }
        setmascotasMuertas(arregloMM);
        setMascotasMuertas(arregloMM);
        cmbRevivir.removeAllItems();
        InicializarCboRevivir(cmbRevivir);
    }

    public void cambioMascotasMuertas(Mascota mascotaRevivida, Mascota[] mascotasMuertasG) {
        setmascotasMuertas(mascotasMuertasG);
        try {
            setTamañoArregloMasMuertas(mascotasMuertasG.length - 1);
        } catch (Exception e) {

        }

        Mascota[] arregloMascotas = new Mascota[getTamañoArregloMasMuertas()];
        int posicion = 0;
        for (int i = 0; i < getMascotasMuertas().length; i++) {
            if (!getMascotasMuertas()[i].getNombreMascota().equals(mascotaRevivida.getNombreMascota())) {
                arregloMascotas[posicion] = getMascotasMuertas()[i];
                posicion++;
            }
        }
        setMascotasMuertas(arregloMascotas);
        if (getTamañoArregloMasMuertas() > 0) {
            cmbRevivir.removeAllItems();

            InicializarCboRevivir(cmbRevivir);
        } else {
            cmbRevivir.removeAllItems();
        }
        try {
            for (int i = 0; i < getMascotasMuertas().length; i++) {
                System.out.println(getMascotasMuertas());
            }
        } catch (Exception e) {
        }

    }

    //se agregan las mascotas muertas para poder revivirlas
    public void InicializarCboRevivir(JComboBox cmbMascotasJugador) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbMascotasJugador.getModel();
        for (Mascota mascota : getMascotasMuertas()) {
            model.addElement(mascota.getNombreMascota());
        }
    }
}
