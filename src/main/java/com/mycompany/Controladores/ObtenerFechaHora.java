package com.mycompany.Controladores;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class ObtenerFechaHora {
    private static Date fecha;
    
    public static String obtenerFecha(){
        fecha = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
    public static String obtenerHora(){
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        String hora = formato.format(calendario.getTime());
        return hora;
    }
}
